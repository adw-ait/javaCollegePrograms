import java.util.ArrayList;
import java.util.Scanner;

class Citizen{
    int age;
    String name;

    Citizen(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class Children{
    int age;
    String name;

    Children(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class Adult{
    int age;
    String name;

    Adult(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class Senior{
    int age;
    String name;

    Senior(int age, String name){
        this.age = age;
        this.name = name;
    }
}


public class classifyPeople {
    public static ArrayList<Citizen> citizenArrayList = new ArrayList<>();
    public  static ArrayList<Children> childrenArrayList = new ArrayList<>();
    public  static ArrayList<Adult> adultsArrayList = new ArrayList<>();
    public  static ArrayList<Senior> seniorsArrayList = new ArrayList<>();

    public static void main(String[] args) {

        int choice;
        int age;
        String name;
        Scanner getInput = new Scanner(System.in);

        do {
            System.out.println("\n1. Add Citizen\n2. Segregate\n3. Display\n4. Exit");
            System.out.print("\nEnter choice : ");
            choice = getInput.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("\nEnter age : ");
                    age = getInput.nextInt();
                    getInput.nextLine();
                    System.out.print("\nEnter Name : ");
                    name = getInput.nextLine().toLowerCase();
                    citizenArrayList.add(new Citizen(age, name));
                    System.out.println("\nCitizen Added successfully");
                    break;

                case 2 : citizenArrayList.forEach(citizen -> {if(citizen.age <= 17 && citizen.age >= 1){
                    childrenArrayList.add(new Children(citizen.age, citizen.name));
                }

                    //add adult
                    if(citizen.age <= 59 && citizen.age >= 18){
                        adultsArrayList.add(new Adult(citizen.age, citizen.name));
                    }

                    //add senior
                    if(citizen.age <= 100 && citizen.age >= 60){
                        seniorsArrayList.add(new Senior(citizen.age, citizen.name));
                    }

                });
                    System.out.println("\nSegregated Successfully"); break;

                case 3 :
                    //Child display
                    System.out.println("\nChildren : ");
                    for (Children children : childrenArrayList) {
                        System.out.println("\n" + children.name + " " + children.age);
                    }

                    //Adult display
                    System.out.println("\nAdult : ");
                    for (Adult adult : adultsArrayList) {
                        System.out.println("\n" + adult.name + " " + adult.age);
                    }


                    //senior display
                    System.out.println("\nSenior Citizens : ");
                    for (Senior senior : seniorsArrayList) {
                        System.out.println("\n" + senior.name + " " + senior.age);
                    }
                    break;


                case 4 : break;

            }
        }while (choice != 4);


    }
}