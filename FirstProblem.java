package assignment1;
import java.util.Scanner;
import java.util.Arrays;
public class FirstProblem {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STRINGS TO BE SORTED");
        int n=in.nextInt();
        String a[]=new String[n];
        for(int l=0;l<n;l++)
        {
            a[l]=in.next();
        }
        int size=a.length;

        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("SORTED STRINGS\n\n");
        for(int k=0;k<n;k++)
        {
            System.out.println(a[k]);
        }

    }
}
