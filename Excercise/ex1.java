import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        int[] arr1= new int[5];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks for:");
        for(int i=0;i<5;i++){
            System.out.printf("\nSubject %d:",i+1);
            arr1[i]=sc.nextInt();
            sum+=arr1[i];
        }
        int percentage=sum/5;
        System.out.printf("Percentage:%d",percentage);
    }
}