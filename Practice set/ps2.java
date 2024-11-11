
import java.util.Scanner;
public class ps2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //1. Program to encrypt grade by adding 8 to it.
            System.out.println("Enter letter grade: ");
            
            char grade=sc.next().charAt(0); //To take char input from user.
            grade=(char)(grade+8); //Type-casting

            System.out.printf("Your grade:%c",grade);
        

        //2. Compare user input.
            System.out.println("Enter value for a:");
            int a= sc.nextInt();

            System.out.println("Enter value for b:");
            int b= sc.nextInt();

            if(a>b){
                System.out.printf("%d > %d.",a,b);
            }
            else if(a==b){
                System.out.printf("%d = %d.",a,b);
            }
            else{
                System.out.printf("%d < %d.",a,b);
            }
        sc.close();
    }
}