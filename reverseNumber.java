import java.util.Scanner;

import packageNumutil.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter 3 digit number : ");
        revNum rn1 = new revNum(input.nextInt());
        rn1.reverseNum();
        rn1.display();
        input.close();
    }
}