import java.util.*;
public class Calci
{
public static void main(Strign args []){
System.out.println("this is basic structure");
Scanner sc = new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("addition function is called and the result is = "+add(a,b)");
System.out.println("subtraction function is called and the result is = "+sub(a,b)");
System.out.println("multi function is called and the result is = "+multi(a,b)");
System.out.println("div function is called and the result is = "+div(a,b)");

}
}