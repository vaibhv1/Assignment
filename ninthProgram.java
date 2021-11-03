package assignment1;
import java.util.Scanner;
public class ninthProgram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string");
        String input= in.nextLine();
        stringComp(input);
    }
    public static void stringComp(String ss) {
        String s=ss.toLowerCase();
        String comp="";
        int count=1;
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                comp+=String.valueOf(s.charAt(i))+count;
                count=1;
            }
        }
        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2))
        {
            comp+=String.valueOf(s.charAt(s.length()- 1))+"1";
        }
        else {
            int c=1;
            for(int i=s.length()-1;i>=0;i--) {
                if(s.charAt(i)!=s.charAt(i-1))
                    break;
                c++;
            }
            comp+=String.valueOf(s.charAt(s.length()-1))+c;
        }
        System.out.println(comp);
    }
}
