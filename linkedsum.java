import java.util.LinkedList;
import java.util.Scanner;

public class linkedsum {

    static Scanner in =  new Scanner(System.in);

    static LinkedList<Integer> list=new LinkedList<>();

    int sz,num;
    int getsize()
    {
        System.out.println("Enter the size ");
        sz  = in.nextInt();
        return  sz;
    }

    public static void main(String[] args)
    {
        int size;

        linkedsum s = new linkedsum();

        size=s.getsize();

        for (int i=0;i<size;i++)
        {
            list.add(in.nextInt());
        }

        for (int j=0;j<size;j++)
        {
            int sum=0,num;

            num = list.get(1+j);
            sum = num % 10 + sum;
            num = num / 10;

            if (sum % 2 == 0 )
            {
                list.remove(1+j);
                System.out.println("Element removed ");
            }
            else
            {
                break;
            }

        }
        System.out.println("Linked list " +list);
    }

}