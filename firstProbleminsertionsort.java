package assignment1;
import java.util.Scanner;
public class firstProbleminsertionsort {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of Strings to be sorted");
    int n=in.nextInt();
    String a[]=new String[n];
    int i=0;
    for(i=0;i<n;i++)
    {
        a[i]=in.next();
    }
    String key;
    int j=0;
    for (j = 1; j < a.length; j++)
    {
        key = a[j];
        i = j - 1;
        while (i >= 0)
        {
            if (key.compareTo(a[i])>0)
            {
                break;
            }
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = key;
    }
    System.out.println("Sorted strings");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }

}
}
