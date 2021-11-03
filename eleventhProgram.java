package assignment1;
import java.util.Scanner;
public class eleventhProgram {
    public static void main(String[] args) {
        int itemId[]= {5001,5002,5003,5004,5005};
        int quantity[]= {1,2,3,4,5};
        double price[]= {1000,2000,3000,4000,5000};
        double discount[]= {4,10,20,15,5};
        display(itemId,quantity,price,discount,5005);
    }
    public static void display(int[] itemId,int[]
            quantity,double[] price,double[] discount,int purchaseId)
    {
        boolean flag=false;
        int temp=0,customerId=0,billId=0;
        for(int i=0;i<itemId.length;i++)
        {
            if(purchaseId==itemId[i])
            {
                flag=true;
                temp=i;
                customerId++;
                billId++;
                break;
            }
        }
        if(flag)
        {
            double billAmount=price[temp]*quantity[temp];
            double discountAmount=billAmount*(discount[temp]/100);
            System.out.println("bill id : "+billId);
            System.out.println("Customer id : "+customerId);
            System.out.println("purchase id : "+purchaseId);
            System.out.println("quantity purchased : "+quantity[temp]);
            System.out.println("discount amount : "+discountAmount);
            System.out.println("bill amount : "+(billAmount-discountAmount));
        }
        else
            System.out.println("item not found");
    }
}
