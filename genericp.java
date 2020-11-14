import java.util.Scanner;
import java.lang.*;
class Student{
    public  static <E> void print(E[] inputArray)
    {
        int last,i;
        int arr[]=new int[30];
    for(E element:inputArray)
    {
        System.out.println("Your Roll no.s are "+inputArray+"\n");
    }
        for(E element:inputArray)
        {
             i = (int)element;
             i%=10;
             arr[i]=i;
        }
        System.out.println(" No.s are ");
        for(E element:inputArray)
        {
            System.out.println(arr);
        }

    }
}

public class genericp {
    public static void main(String[]args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.s you want to insert ");
        int size = sc.nextInt();
        Integer st[] = new Integer[size];
        System.out.println("Enter the Roll no.s");
        for (int i = 0; i < size; i++) {

            st[i] = sc.nextInt();

        }
        s.print(st);
    }
}