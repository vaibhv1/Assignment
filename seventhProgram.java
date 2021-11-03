package assignment1;
import java.util.Scanner;
import java.util.regex.Pattern;
public class seventhProgram {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String reverse="";
        System.out.println("Enter a sentence");
        reverse = in.nextLine();
        String split[]=reverse.split(" ");
        for(int i=0;i<split.length;i++)
        {
            displayReverse(split[i]);
        }
    }
    public static void displayReverse(String s)
    {
        String regex="[A-Za-z]{1,}";
        if(s.matches(regex)) {
            System.out.print(reverseString(s));
        }
        else {
            System.out.print(s);
        }
        System.out.print(" ");
    }
    public static String reverseString(String rev) {
        String reverse="";
        for(int i=rev.length()-1;i>=0;i--) {
            reverse+=rev.charAt(i);
        }
        return reverse;
    }
}
