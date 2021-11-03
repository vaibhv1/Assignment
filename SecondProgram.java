package assignment1;
import java.util.Scanner;
public class SecondProgram {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        initials(name);
    }
    static void initials(String name)
    {
        if(name.length()==0)
        {
            return;
        }
        System.out.print(Character.toUpperCase(name.charAt(0)));
        for(int i=1;i<name.length()-1;i++)
        {
            if(name.charAt(i)==' ')
            {
                System.out.print(" "+Character.toUpperCase(name.charAt(i+1)));
            }
        }

}}
