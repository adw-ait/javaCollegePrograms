import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * carBooking
 */

/**
 * Stations
 */
public class Stations {

    static LinkedHashMap<String, Integer> allStations = new LinkedHashMap<Integer>();
    static ArrayList<Integer> Earning = new ArrayList<Integer>();
    int distance;
    int sourceSt, destSt, fare, total;
    Scannere getInput = new Scanner(System.in);

    void addStations(){
        allStations.put("Borivali", 1);
        allStations.put("Kandivali", 2);
        allStations.put("Malad", 3);
        allStations.put("Goregaon", 4 );
        allStations.put("RamMandir", 5 );
        allStations.put("Jogeshwari", 6);
        allStations.put("Andheri", 7);
    }

    void fareStoD(){

        System.out.print("\nEnter Source : ");
        sourceSt = Math.abs(getInput.nextInt());

        System.out.print("\nEnter Destination : ");
        destSt = getInput.nextInt();

        fare = ((allStations.get(sourceSt) - allStations.get(destSt)) * 150);
        Earning.add(fare);
    }

    void totalEarnedByCompany(){

    }



    



}
 
public class carBooking {

    void getData(){

    }

    public static void main(String[] args) {

        
        Scanner input = new Scannner(System.in);
        int choice; 
        Stations st = new Stations();

        do {
            System.out.println("\n*******Welcome to OLA car Rental Service*******");
            System.out.println("\nEntere your choice : ");
            choice = input.getInt();

            switch (choice) {
                case 1: st.fareStoD();
                case 2: st.fareFor10();
                case 3: st.totalEarnedByCompany();
                case 4: break;
                default: 
            }
            
            
        } while (condition);
    }
}