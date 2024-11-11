//Basic calculations

import java.util.Scanner;
 
public class ps1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        //1. Sum of 3 numbers.
        int a,b,c,sum0=0;
        System.out.println("Enter value for a:");
        a=sc.nextInt();

        System.out.println("Enter value for b:");
        b=sc.nextInt();

        System.out.println("Enter value for c:");
        c=sc.nextInt();

        sum0=a+b+c;
        System.out.printf("Sum:%d",sum0);
        

        //2. CGPA calculator for 3 subjects.
        float[] marks= new float[3];
        float CGPA,sum=0;

        System.out.println("Enter marks");
        for(int i=0;i<3;i++){
            System.out.printf("Subject %d:",i+1);
            marks[i]=sc.nextFloat();
            sum+=marks[i];
        }

        CGPA=sum/30;
        System.out.printf("CGPA: %f",CGPA);
       

        //3. Greeting message.
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.printf("Hello %s!",name);
         

        //4. Kilometers to miles.
        System.out.println("Enter distance in KM:");
        float km=sc.nextFloat();
        System.out.printf("Distance in miles:%f",km*0.62137119);
        

        //5. Check whether user input is INT or NOT.
        System.out.println("Enter value:");
        if(sc.hasNextInt()){
            System.out.println("Input is integer!");
        }
        else{
            System.out.println("Input is not integer!");
        }
        sc.close();
    }
}