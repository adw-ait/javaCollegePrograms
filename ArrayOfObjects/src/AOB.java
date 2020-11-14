import java.util.HashMap;
import java.util.Scanner;

class userInfo{

    String name, city;
    int age;
    userInfo(String name, String city, int age){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void showData(){
        System.out.println("\nName : "+name+"\nAge : "+age+"\nCity : "+city);
    }
}


public class AOB{
    static HashMap<Integer, userInfo> UI = new HashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, city;
        int id = 0;
        int age, choice;

        do {
            System.out.print("\nEnter choice : \n1. Add user Details\n2. Display\n3. Exit\n\nChoice : ");
            choice = input.nextInt();
            switch (choice){
                case 1 : {
                    System.out.println("\nName : ");
                    name = input.nextLine();
                    System.out.println("\nCity : ");
                    city = input.nextLine();
                    System.out.println("\nAge : ");
                    age = input.nextInt();
                    id += 1;
                    UI.put(id, new userInfo(name, city, age));
                }
                    break;
                case 2 :
                    for (int i = 1; i < UI.size(); i++) {
                        UI.get(i).showData();
                    }
                    break;
                case 3 : break;
                default:
                    System.out.println("\nWrong input, Enter Again");break;

            }
        }while (choice != 3);



//        UI.put(1, new userInfo("Advait", "Wardha", 23));

//        System.out.println(UI.get(1).name);


    }
}