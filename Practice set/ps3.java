// Strings

import java.util.Scanner;
public class ps3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        //⭐1. Convert string to lowercase
        System.out.println("Input:");
        String name=sc.nextLine();
        char[] chars = name.toCharArray();

        System.out.println("Do you wish to: \n1.Capitalize\n2.Lowercase\n");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
            for(int i=0;i<chars.length;i++){
                if(Character.isLowerCase(chars[i])){
                    chars[i]=Character.toUpperCase(chars[i]);
                }
            }
            break;

            case 2:
            for(int i=0;i<chars.length;i++){
                if(Character.isUpperCase(chars[i])){
                    chars[i]=Character.toLowerCase(chars[i]);
                }
            }
            break;
        }
        String str = new String(chars);
        System.out.printf("%s",str);
        

        //2. Replace spaces with underscores.
        System.out.println("Enter line:");
        String input=sc.nextLine();

        char[] inp= input.toCharArray(); 
        for(int i=0;i<input.length();i++){
            if(inp[i]==' '){
                inp[i]='_';
            }
        }
        String out= new String(inp);
        System.out.printf("%s",out);
        

        //3. Fill letter template "Dear <name>, Thanks a lot!"
        System.out.println("Enter first name:");
        String name1=sc.next();
        System.out.printf("Dear %s, thanks a lot!",name1); 
        

         //4. Check for double and triple spaces.
         System.out.println("Enter line:");
         String myString=sc.nextLine();
         System.out.println((myString.indexOf("  ")));
         System.out.println((myString.indexOf("   ")));

        sc.close();

    }
    
}
