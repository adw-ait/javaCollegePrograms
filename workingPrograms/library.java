import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class library {
    static HashMap<Integer, String> al = new HashMap<>();
    int bookId = 0;
    Scanner getInput = new Scanner(System.in);
    String getBook, addBook;
//    int removeBook;


    void findBook(){
        System.out.println("\nEnter book name : ");
        getBook = (getInput.nextLine()).toLowerCase();

        if(al.containsValue(getBook)){
            System.out.println("\nYour book found "+getBook);
        }
        else{
            System.out.println("\nBook not found");

        }
    }

    void addBook(){
        System.out.print("\nAdd Book : ");
        addBook = (getInput.nextLine()).toLowerCase();

        if(al.containsValue(addBook)){
            System.out.println("\nBook already there");
        }
        else{

            al.put(bookId, addBook);
            bookId+=1;
            System.out.println("\nBook Added");
        }

    }

    void removeBook(){
        System.out.print("\nEnter Book to remove : ");
        getBook = (getInput.nextLine()).toLowerCase();
        System.out.println(getBook);

        // String tempStoreValue;

        if(al.containsValue(getBook)){
            int i=0;
            String getValue = al.get(i);
            while(i < al.size() && getBook != getValue){
                System.out.println(al.get(i));
                System.out.println(i);
                i++;
                getValue = al.get(i);
            }
            System.out.println(i);
            al.remove(i);
            System.out.println("\nBook removed");

        }
        else{
            System.out.println("\nBook not present");
        }

    }

    void display(){
        System.out.println("\nBooks in the library : \n"+al.entrySet());
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        library lib = new library();
        int choice;
        do {
            System.out.print("\nMini Library Mgmt : \n1. Find Book\n2. Add Book\n3. Remove Book\n4. Display all books\n5. Exit\nEnter Choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1: lib.findBook();break;
                case 2: lib.addBook();break;
                case 3: lib.removeBook();break;
                case 4: lib.display();break;
                case 5: break;
                default: System.out.println("Wrong Input");
            }
        } while (choice != 5);
    }
}