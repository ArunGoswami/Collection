//
//
//package com.ravi.vector;
//
//import java.util.Vector;
//
//public class VectorDemo2
//{ 
//	public static void main(String[] args)
//	{
//		Vector<Integer> v = new Vector<>();
//		v.add(1); v.add(2); v.add(3);
//		v.add(4); v.add(5); v.add(6);
//		v.add(7); v.add(8); v.add(9);
//		
//
//		//Without Stream
//		Vector<Integer> even = new Vector<>();
//		
//		for(Integer i : v)
//		{
//			if(i%2 ==0)
//			{
//				even.add(i);
//			}
//		}
//		System.out.println(even);
//		
//		//With Stream
//		
//		v.stream().filter(num -> num%2==0).forEach(System.out::println);
//		
//		  
//		
//		
//	}
//}
//----------------------------------------------------------------
////Program to filter product data based on Predicate
//
//package com.ravi.vector;
//
//import java.util.Vector;
//
//record Product(int pid, String pname, double price)
//{
//	
//}
//
//public class VectorStream 
//{
//	public static void main(String[] args)
//	{
//		Vector<Product> listOfProduct = new Vector<>();
//		listOfProduct.add(new Product(1, "Camera", 12000));
//		listOfProduct.add(new Product(2, "Laptop", 82000));
//		listOfProduct.add(new Product(3, "Mobile", 44000));
//		listOfProduct.add(new Product(4, "LED", 56000));
//		
//		listOfProduct.stream().filter(p -> p.price()<30000).forEach(prod -> System.out.println(prod.pname()));
//		
//		 
//
//	}
//
//}
//----------------------------------------------------------------
//package com.ravi.vector;
////Array To Collection
//import java.util.*;
//public class VectorDemo3
//{
//	public static void main(String args[])
//	{
//		Vector<Integer> v = new Vector<>();
//		
//		int x[]={22,20,10,40,15,58};
//   
//        //Adding array values to Vector
//		for(int i=0; i<x.length; i++)
//		{
//			v.add(x[i]);
//		}		
//		Collections.sort(v);
//		System.out.println("Maximum element is :"+Collections.max(v));
//		System.out.println("Minimum element is :"+Collections.min(v));
//		System.out.println("Vector Elements :");
//		v.forEach(y -> System.out.println(y));
//	}
//}
//-----------------------------------------------------------------
////Program to describe that ArrayList is better than Vector in performance
//
//package com.ravi.vector;
//
//import java.util.ArrayList;
//import java.util.Vector;
//
//public class VectorDemo4 
//{
//	public static void main(String[] args) 
//	{
//		long startTime = System.currentTimeMillis();
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		
//		for(int i=0 ; i<=1000000; i++)
//		{
//			al.add(i);
//		}
//		
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total time taken by ArrayList :"+(endTime-startTime)+ "ms");
//		
//        startTime = System.currentTimeMillis();
//		
//		Vector<Integer> v = new Vector<>();
//		
//		for(int i=0 ; i<=1000000; i++)
//		{
//			v.add(i);
//		}
//		
//		endTime = System.currentTimeMillis();
//		System.out.println("Total time taken by Vector :"+(endTime-startTime)+ "ms");
//		
//	}
//}
