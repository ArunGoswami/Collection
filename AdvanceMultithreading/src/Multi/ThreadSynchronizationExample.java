package Multi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int sharedValue = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            // Critical section: Only one thread can access this block at a time
            int temp = sharedValue;
            Thread.sleep(100); // Simulating some work
            sharedValue = temp + 1;
            System.out.println("Thread " + Thread.currentThread().getId() + " incremented value to: " + sharedValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class IncrementThread extends Thread {
    private SharedResource sharedResource;

    public IncrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
        }
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating multiple threads that share the same resource
        Thread thread1 = new IncrementThread(sharedResource);
        Thread thread2 = new IncrementThread(sharedResource);
        Thread thread3 = new IncrementThread(sharedResource);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final shared value: " + sharedResource.sharedValue);
    }
}

