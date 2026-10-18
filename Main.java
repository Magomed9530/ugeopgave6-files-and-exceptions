/*Opgave1
import java.util.Scanner;

void main(){
        Scanner scan = new Scanner(System.in);

        int number = promptNumber(scan, "Skriv et tal:");
        System.out.println("Du skrev: " + number);

        scan.close();
    }

    // Spørger brugeren om et tal
    public static int promptNumber(Scanner scan, String msg) {
        System.out.println(msg);

        try {
            return Integer.parseInt(scan.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Skriv venligst et heltal");
            return promptNumber(scan, msg);
        }
    }
*/
/*Opgave2
public class Main {

    public static void main(String[] args) {

        // Opretter en drink med en gyldig pris
        Drink drink = new Drink(25.0);
        System.out.println("Gyldig pris: " + drink.getPrice());

        // Tester en ugyldig pris
        try {
            drink.setPrice(-5.0);

        } catch (IllegalArgumentException e) {
            System.out.println("Ugyldig pris: " + e.getMessage());
        }
    }
}
 */