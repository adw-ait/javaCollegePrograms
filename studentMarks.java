import java.util.*;

public class studentMarks {
    static LinkedHashMap<Integer, Integer> studMarks = new LinkedHashMap<Integer, Integer>();
    Scanner getInput = new Scanner(System.in);
    int marks, rollno;

    void addToList(){
        System.out.println("\nEnter Roll no : ");
        rollno = getInput.nextInt();

        System.out.println("\nEnter marks : ");
        marks = getInput.nextInt();

        studMarks.put(rollno, marks);
    }

    void sortList(){

    }

    void display(){
        System.out.println("\n"+ studMarks);
    }

    public static void main(String[] args) {

        int choice;
        Scanner input = new Scanner(System.in);
        studentMarks sm = new studentMarks();

        do {
            System.out.print("\nChoose one : \n1.Add Info \n2.sort\n3.display\n4.Exit\nCHoice : ");

            choice = input.nextInt();

            switch (choice) {
                case 1: sm.addToList();
                case 2: sm.sortList();
                case 3: sm.display();
                case 4: break;
                default : System.out.println("\nWrong input");
            }
        } while (choice != 4);
    }
}
