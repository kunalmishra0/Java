import java.util.Scanner;

public class ps5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //1. Print star pattern
        System.out.println("Enter no. of rows to be printed:");
        
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //2.Find sum of first n even numbers using while loop.
       
        System.out.println("Enter value for n:");
        int n= sc.nextInt();
        int i=n,a=0;
        while (i>0) {
            System.out.printf("%d ",a);
            i--;
            a+=2;
        }

        //3.Print multiplication table of n.
        System.out.println("Enter value for n:");
        int n= sc.nextInt();

        for(int i=0;i<11;i++){
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }

        //4.Print multiplication table of 10 in reverse.
        int n=10;
        for(int i=10;i>0;i--){
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }


        //5.Find factorial of n using for loop.
        System.out.println("Enter number whose factorial is to be found:");
        int n=sc.nextInt();
        long fact=1;
        for(long i=n;i>0;i--){
            fact*=i;
        }
        System.out.printf("The factorial of %d is %d.",n,fact);

        //6.Find factorial of n using while loop.
        System.out.println("Enter number whose factorial is to be found:");
        int n=sc.nextInt();
        int fact=1;
        int i=n;
        while(i>0){
            fact*=i;
            i--;
        }
        System.out.printf("The factorial of %d is %d.",n,fact);
        
        //7.Print star pattern using while loop.
        System.out.println("Enter no. of rows to be printed:");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=i;
            while(j>=0){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }


        //8.Calculate sum of numbers of multiplication table of n.
        System.out.println("Enter n to calculate sum of first 10 multiples:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<11;i++){
            sum=sum+n*i;
        }
        System.out.printf("Sum of first 10 multiples of %d is %d",n,sum);
               
        
        //9.Sum of first n even numbers using for loop.
        System.out.println("Enter value for n:");
        int n=sc.nextInt();
        int e=0;
        for(int i=0;i<n;i++){
            System.out.printf("%d ",e);
            e+=2;
        }
        sc.close();

    }
}
