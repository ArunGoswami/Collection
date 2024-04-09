package jvm;

interface java.lang.AutoCloseable
{
   public abstract void close() throws Exception;
}
public interface java.io.Closeable extends java.lang.AutoCloseable
{
   void close() throws IOException;
}
