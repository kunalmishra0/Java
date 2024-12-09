import java.util.Scanner;
public class ps7 {
    public static void main(String[] args){
        //Methods
        Scanner sc= new Scanner(System.in);
        //1. Print multiplication table of number n.
        System.out.print("Enter value for n:");
        int n = sc.nextInt();
        multi(n);
        
        //2. Print star pattern for n-rows
        System.out.println("Enter value for n:");
        int n= sc.nextInt();
        star(n);
        
        //3. Recursive function to calculate sum of first n natural numbers.
        System.out.println("Enter value for n:");
        int n= sc.nextInt();
        System.out.printf("The sum of first %d numbers is: %d",n,sum(n));
        

        //4. Print pattern opposite to 2
        System.out.println("Enter value for n:");
        int n= sc.nextInt();
        revstar(n);

        //5. Return n no of terms of fibbonaci series
        System.out.println("Enter value for n:");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("%d ",fibb(i));
        }


        //6. Function to find avergae of given numbers
        int[] numbers= new int[100];
        System.out.print("Enter no of number whose average is to be calculated: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.printf("The average of the following numbers is: %d ",avg(numbers,n));
        

        //7. Repeat 4 using recursion
        System.out.print("Enter no. of rows to be printed: ");
        int n=sc.nextInt();

        recursiveStarRev(n);
        

        //8.⭐ Repeat 2 using recursion
        System.out.print("Enter no. of rows to be printed: ");
        int n=sc.nextInt();

        recursiveStar(n);
        

        //9. Function to convert celsius into fahreneit or fahreneit into celsius
        while(true){
            System.out.print("1. Convert Celsius to Fahreneit\n2. Convert Fahreneit to Celsius.\nYour choice: ");
            int c=sc.nextInt();

            if(c!=1 && c!=2){
                System.out.println("\n\nIncorrect input! Try again.\n\n");
                continue;
            }
            else if(c==1){
                System.out.print("Enter temperature(in C) to be converted to Fahreneit: ");
                float temp=sc.nextFloat();
                System.out.printf("%.2f *F",tempconvert(c,temp));
                break;
            }
            else if(c==2){
                System.out.print("Enter temperature(in F) to be converted to Celsius: ");
                float temp=sc.nextFloat();
                System.out.printf("%.2f *C",tempconvert(c,temp));
                break;
            }
        }
        
        //10. Repeat 3 using iteration.
        System.out.print("Enter value whose sum to be calculated: ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.printf("The sum of the first %d natural number is %d",n,sum);
    
    }

    //1
    static void multi(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }

    //2
    static void star(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //3
    static int sum(int n){
        if(n==1)
            return n;
        else
            return n+ sum(n-1);
    }
    
    //4
    static void revstar(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //5
    static int fibb(int n){
        if(n<=1)
            return n;
        else
            return fibb(n-1)+fibb(n-2);
    }

    //6
    static int avg(int[] a,int n){
        int avg=0;
        for(int i=0;i<n;i++){
            avg+=a[i];
        }
        avg/=n;
        return avg;
    }

    //7
    static void recursiveStarRev(int n){
        if(n!=0){
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            recursiveStarRev(n-1);
        }
    }

    //8 ⭐
    static void recursiveStar(int n){
        if(n>0){
            recursiveStar(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //9
    static float tempconvert(int c,float temp){
        if(c==1){
            temp=(1.8f*temp)+32.0f;
        }
        else if(c==2){
            temp=(5.0f/9.0f)*(temp-32.0f);
        }
        return temp;
    }
}
