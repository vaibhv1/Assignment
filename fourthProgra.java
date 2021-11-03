package assignment1;
import java.util.Scanner;
public class fourthProgra {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter two names");
        String fName=in.nextLine();
        String sName=in.nextLine();
        interchangeLastName(fName,sName);
    }
    public static void interchangeLastName(String fName,String sName) {
        String firstName[]=findLastName(fName);
        String secondName[]=findLastName(sName);
        String firstFullName="";
        String secondFullName="";
        for(int i=0;i<Integer.valueOf(firstName[1]);i++)
            firstFullName+=fName.charAt(i);
        for(int i=0;i<Integer.valueOf(secondName[1]);i++)
            secondFullName+=sName.charAt(i);
        System.out.println(firstFullName+secondName[0]);
        System.out.println(secondFullName+firstName[0]);
    }
    public static String[] findLastName(String s)
    {
        int index=0;
        String lname="";
        String re[]=new String[2];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>64 && s.charAt(i)<97)
                index=i;
        }
        for(int i=index;i<s.length();i++)
        {
            lname+=s.charAt(i);
        }
        re[0]=lname;
        re[1]=String.valueOf(index);
        return re;
    }
}
