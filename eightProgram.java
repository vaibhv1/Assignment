package assignment1;
import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.Scanner;

public class eightProgram {
public static void main(String[] args)
{
    Scanner in= new Scanner(System.in);
    String  input="";
    System.out.println("Enter the string");
    input=in.nextLine();
    printConsecutiveCharacters(input);
}
public static void printConsecutiveCharacters(String input)
{
    HashMap<String,Integer> map= new HashMap<>();
    String s=input.replace("-","");
    for(int i=0;i<s.length()-1;i++)
    {
        if(s.charAt(i)+1==s.charAt(i+1)) {
            String temp = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));

            if (map.containsKey(temp)) {
                int ans = map.get(temp);
                map.put(temp, ans + 1);
            } else {
                map.put(temp, 1);
            }
        }
    }
    System.out.println(map);
}
}

