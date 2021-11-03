package assignment1;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class ThirdProgram {
    public static void main(String[] args)
    {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name");
        String fName = in.nextLine();
        System.out.println("Enter Middle Name");
        String mName = in.nextLine();
        System.out.println("Enter Last Name");
        String lName = in.nextLine();
        System.out.println("Enter Age");
        int Age = in.nextInt();
        String fullname=fName+mName+lName;
        String initial="";
        for(int i=0;i<fullname.length();i++)
        {
            if(fullname.charAt(i)>64 && fullname.charAt(i)<97)
                initial+=fullname.charAt(i);
        }
        System.out.println(generatePassword(initial,Age));
    }
    public static char[] generatePassword(String initial,int Age)
    {
        String comb=initial+Age;
        char pass[]=new char[8];
        for(int i=0;i<8;i++)
        {
            char c=comb.charAt((int)(Math.random()*comb.length()));
            pass[i]=c;
        }

        return pass;
    }
}
