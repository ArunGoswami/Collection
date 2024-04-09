package Exception;


public class ExcProgram01
{
public int m1(int a) 
{
System.out.println("m1 started");
while(a==5) 
{ 
try 
{
++a;
return 10;
// break;
//continue;
}
finally 
{
// break; continue;
}
}
return 20;

}
}
