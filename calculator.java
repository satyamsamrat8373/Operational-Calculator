import java.util.*;
class calculator
{
    public static void main(String[]k)
    {
	   //For input taking:
        Scanner sc=new Scanner(System.in);
        int op1;
        double a,b;
        System.out.println("Operational number are as follows ;1-Addition,2-product,3-Subtract,4-Remainder,5-Quotient");
        System.out.println("Enter Operational number=");
        op1=sc.nextInt();
        System.out.print("Enter two number=");
        a=sc.nextDouble();
        b=sc.nextDouble();
	//Logic starts here
        if(op1==1)
        {
            calculator1.add(a,b);
        }
        else if(op1==2)
        {
            calculator1.multiply(a,b);
        }
        else if(op1==3)
        {
            calculator1.subtract(a,b);
        }
        else if(op1==4)
        {
            calculator1.remainder(a,b);
        }
        else if(op1==5)
        {
            calculator1.division(a,b);
        }
        else
        {
            System.out.println("Invalid choice please enter correct operational number ");
        }
    }
}
class calculator1
{
    public static void add(double x,double y)
    {
        double res=x+y;
        System.out.println("Addition of two number is=" + res);
    }
     public static void multiply(double x,double y)
    {
       double res=x*y;
        System.out.println("Product of two number is=" + res);
    }
     public static void subtract(double x,double y)
    {
        double res=x-y;
        System.out.println("Difference of two number is=" + res);
    }
     public static void remainder(double x,double y)
    {
        double res=x%y;
        System.out.println("Remainder of two number is=" + res);
    }
     public static void division(double x,double y)
    {
        double res=x/y;
        System.out.println("Quotient of two number is=" + res);
    }
}