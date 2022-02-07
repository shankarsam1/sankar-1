import java.util.Scanner;
// my edit

class sample
{
public static void main(String args[])
{



Scanner sc = new Scanner(System.in);
System.out.println("Enter name");
String name=sc.nextLine();

System.out.println("Enter tamil mark");
int m1=sc.nextInt();

System.out.println("Enter english  mark");
int m2=sc.nextInt();

System.out.println("Enter Maths mark");
int m3=sc.nextInt();

System.out.println("Enter Science  mark");
int m4=sc.nextInt();

System.out.println("Enter social  science mark");
int m5=sc.nextInt();

int total=m1+m2+m3+m4+m5;


System.out.println("welcome  "+"    Yourname  "+name);


System.out.println("Tamil mark:"+m1);

System.out.println("English mark:"+m2);

System.out.println("Maths mark:" +m3);

System.out.println("Science mark:"+m4);

System.out.println("Social Science mark:"+m5);
 
System.out.println("total="+total);


}
}
