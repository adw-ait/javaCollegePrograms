import java.util.ArrayList;
import java.util.Scanner;

/**
 * arrayList
 */
public class arrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos;
        String name;
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Advait");
        namesList.add("CHinmay");
        namesList.add("Harshad");

        //current list
        System.out.println(namesList);

        do {
            System.out.print("\nEnter position to be inserted : ");
            pos = input.nextInt();
        } while (pos > namesList.size());
        
        System.out.print("\nEnter name : ");
        name = input.next();

        namesList.add(pos, name);
        
        //after adding 
        System.out.println(namesList);
    }
}