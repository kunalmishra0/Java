import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Check wether pass or fail.(Min passsing criteria: 33% per subject, 40% in total)
        int[] subjects = new int[3];
        int total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter value for subject %d: ", i + 1);
            subjects[i] = sc.nextInt();
            total += subjects[i];
        }

        int flag = 0;
        for (int i = 0; i < 3; i++) {
            if (subjects[i] < 33) {
                flag = 1;
            }
        }

        if (total / 3 >= 40 && flag == 0) {
            System.out.println("\nCongratulations you have passed!");
        } else {
            System.out.println("\nYou have failed.");
        }
        

        //2. Calculate income tax paid.
        
        System.out.println("Enter your annual salary in lakhs.");
        float salary = sc.nextFloat();
        float tax =0.0f;

        if(salary>2.5f && salary<=5.0f){
            tax= tax+ 0.05f*(salary-2.5f);
        }
        else if(salary>5.0f && salary<=10.0f){
            tax= tax+ 0.05f*(5.0f-2.5f);
            tax= tax+ 0.2f*(salary-5.0f);
        }
        else if(salary>10.0f){
            tax= tax+ 0.05f*(5.0f-2.5f);
            tax= tax+ 0.05f*(10.0f-5.0f);
            tax= tax+ 0.3f*(salary-10.0f);
        }

        System.out.printf("The total tax to be paid: %f ",tax);
        
         
        //3. Tell day of the week from number.
        System.out.println("Enter no for day of the week:");
        int no= sc.nextInt();
        String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.printf("%s",days[no-1]);
        

        //4. Check whether entered year is a leap year
        System.out.print("Enter year:");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.printf("%d is a leap year!",year);
        }
        else{
            System.out.printf("%d is not a leap year!",year);
        }
        
        //5.Check ending of website for ".org",".com",".in"
        System.out.println("Enter website:");
        String website=sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is an .org website!");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an .com website!");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an .in website!");
        }
        else{
            System.out.println("Cannot determine website ending!");
        }

        sc.close();
    }
}
