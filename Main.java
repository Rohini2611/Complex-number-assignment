import java.util.Scanner;
import java.io.*;


class complex
{
    public int real;
    public int imaginary;
    
    Scanner in = new Scanner(System.in);

    complex()
    {
        real=10;
        imaginary=20;
    }

    complex(int a,int b)
    {
        real=a;
        imaginary=b;
    }

   public void getnumber( )
    {
        System.out.println("enter the real part");
        real=in.nextInt();
        System.out.println("enter the imaginary part");
        imaginary=in.nextInt();
    }
    
    
    complex addcomplexnumber (complex a,complex b,complex c)
        {
            c.real=a.real+b.real;
            c.imaginary=a.imaginary+b.imaginary;
            return c;
        }
        
        
    complex subcomplexnumber (complex a,complex b,complex c)
        {
            c.real=a.real-b.real;
            c.imaginary=a.imaginary-b.imaginary;
            return c;
        }

    complex multiplycomplexnumber (complex a,complex b,complex c)
        {
            c.real = a.real*b.real - a.imaginary* b.imaginary;
            c.imaginary = a.real*b.imaginary + a.imaginary* b.real;
            return c;
        }

    complex dividecomplexnumber (complex a,complex b,complex c)
        {
            c.real = (a.real*b.real + a.imaginary* b.imaginary) / (b.real * b.real +b.imaginary * b.imaginary );
            c.imaginary = (b.real*a.imaginary - b.imaginary* a.real) / (b.real * b.real +b.imaginary * b.imaginary );
            return c;
        }
        
}    

public class Main { 
    public static void main (String[] args) {
        /* code */

        complex a = new complex();
        complex b = new complex (10,40);
        complex c = new complex ();

        a.getnumber();
        b.getnumber();
   
        int choice =0 ;
        System.out.println("Menu");
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("enter your choice");
        Scanner in = new Scanner(System.in);
        choice=in.nextInt();
        switch (choice)
        {
        
            case 1:
                c=c.addcomplexnumber(a,b,c);
                System.out.println("Complex Number addition  :"+c.real +"+("+ c.imaginary+")i");
                break;

            case 2:
                c=c.subcomplexnumber(a,b,c);
                System.out.println("Complex Number substraction  :"+c.real +"+("+ c.imaginary+")i");
                break; 
    
            case 3:
                c=c.multiplycomplexnumber(a,b,c);
                System.out.println("Multiplication of complex number :"+c.real +"+("+ c.imaginary+")i");
                break;

            case 4:
                c=c.dividecomplexnumber(a,b,c);
                System.out.println("Division of complex numbe"+  +c.real +"+("+ c.imaginary+")i");
                break;
        }
    }
}