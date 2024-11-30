import java.util.Scanner;
public class ps6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        //1. Create array of 5 floats and calculate sum.
        float[] list=new float[100];
        float sum=0;
        System.out.print("Enter length of array:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.printf("Value for index %d: ",i);
            list[i]=sc.nextFloat();
            sum+=list[i];
        }
        System.out.printf("\nSum of array elements:%f",sum);
        

        //2.Find wether given int is in array or not.(Linear search)
        int[] arr= new int[100];
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.printf("Enter element %d: ",i+1);
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter number to be checked: ");
        int x=sc.nextInt();
        int flag=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=i;
                break;
            }
        }

        if(flag==-1){
            System.out.printf("'%d' not found in array.",x);

        }
        else{
            System.out.printf("'%d' found at index %d",x,flag);
        }
        

        //3. Calculate the avg maks from array containing marks of all students in Physics.
        int[] marks= {60,70,40,80,90,78};
        int sum=0,avg;
        for(int i=0;i<6;i++){
            sum+=marks[i];
        }
        avg=sum/6;
        System.out.printf("The average marks are: %d",avg);
        

        //4.Add two matrices of user defined size.
        int[][] arr1= new int[100][100],arr2= new int[100][100];
        System.out.printf("Enter no. of rows for matrix 1:");
        int r1=sc.nextInt();
        
        System.out.printf("Enter no. of columns for matrix 1:");
        int c1=sc.nextInt();

        System.out.printf("Enter no. of rows for matrix 2:");
        int r2=sc.nextInt();

        System.out.printf("Enter no. of columns for matrix 2:");
        int c2=sc.nextInt();

        if(r1==r2 && c1==c2){
            System.out.println("Enter elemnts for matrix 1:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }

            System.out.println("Enter elemnts for matrix 2:");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }

            int[][] arr3= new int[r1][c1];
            System.out.println("Sum of matrices 1 and 2: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.printf("%d ",arr3[i][j]);
                }
                System.out.println();
            }
        }
        

        //5. Reverse an array.
        int[] arr=new int[100];

        System.out.print("Enter size of array: ");
        int n=sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your array: ");
        for(int e:arr){
            System.out.print(e+ " ");
        }

        int x=n/2;
        int temp;
        System.out.print("\nReversed array: ");
        if(n%2==0){
            for(int i=0;i<x;i++){
                temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }
        }
        else{
            for(int i=0;i<x;i++){
                temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        

        //6. Find maximum element in array.
        int[] a= new int[100];

        System.out.print("Enter length of array:");
        int n=sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max=a[0];
        System.out.print("The largest element in array: ");
        for(int i=0;i<n-1;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.printf("%d",max);
        

        //7. Find minimum element in array.
        int[] a= new int[100];

        System.out.print("Enter length of array:");
        int n=sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int min=a[0];
        System.out.print("The smallest element in array: ");
        for(int i=0;i<n-1;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.printf("%d",min);
        

        //8. Check wether array is sorted.
        int[] a= new int[100];

        System.out.print("Enter length of array:");
        int n=sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int min=a[0],flag=0;
        for(int i=0;i<n;i++){
            if(min>a[i]){
                System.out.println("This array is not sorted.");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("The array is sorted.");
        }
        sc.close();
    }
    
}
