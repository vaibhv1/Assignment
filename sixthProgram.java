package assignment1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class sixthProgram {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the USN:");
       String usn = in.nextLine();
       valid(usn);
    }

    public static void valid(String usn) {
        String regx="[1-2][A-Z]{2}[0-9]{2}[CS||IS||EC||ME]{2}[0-9]{3}";
        boolean f=usn.matches(regx);
        if(f)
        {
            System.out.println("SUCCESS");
        }
        else
        {
            System.out.println("FAILURE");
        }
    }
}
