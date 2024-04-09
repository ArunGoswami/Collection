package day20;

public class ConstructorsTest
{
public static void main(String s[])
{
int i = 2;
Bb b = new Bb();
b.execute();
}
}

class Aa
{
int i = 0;
Aa(){}
}

class Bb extends Aa
{
void execute()
{
for(; i < 6; i++)

        switch(i)
        {
            case 0:
            System.out.println("i is zero.");
            break;

            case 1:
            System.out.println("i is one.");
            break;

            case 2:
            System.out.println("i is two.");
            continue;

            case 3:
            System.out.println("i is three.");
            break;

            default:
            System.out.println("i is greater than three.");
        }
}
}





