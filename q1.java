import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   int nam1;
   
   System.out.println("enter a nam");
   nam1 = scan. nextInt();
   nam1%=2;
   if(nam1==0){
   System.out.println("even");
   }
   else{
   System.out.println("odd");
   }
