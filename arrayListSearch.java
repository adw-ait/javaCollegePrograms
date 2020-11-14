import java.util.ArrayList;
import java.util.Scanner;

public class arrayListSearch {
    Scanner getNum = new Scanner(System.in);

    static ArrayList<Integer> numList = new ArrayList<Integer>();

    boolean found = false;
    int number;

    void addToList(){
        System.out.print("\nEnter number : ");
        number = getNum.nextInt();
        numList.add(number);
    }
    

    void searchList(){
        int searchNum;
        System.out.print("\nENter element to be searched : ");
        searchNum = getNum.nextInt();

        if(numList.contains(searchNum)){
            System.out.println("\nElement found");
        }
        else{
            System.out.println("\nElement not present");
        }

    }

    void displayList(){
        System.out.println(numList);
    }
    public static void main(String[] args) {
        
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n1. Add\n2. Search\n3. Display\n4. Exit");
            System.out.print("Enter Choice : ");
            choice = input.nextInt();
            arrayListSearch obj = new arrayListSearch();

            switch (choice) {
                case 1: obj.addToList();break;
                case 2: obj.searchList();break;
                case 3: obj.displayList();
                case 4: break;
                default:System.out.println("\nwrong input");break;
            }
        } while (choice != 4);

        
    }

    
}
