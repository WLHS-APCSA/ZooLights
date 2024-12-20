import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, month, day;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter birthdate in yyyy-mm-dd form: ");

        try{
            String birthdate = scan.nextLine();
            year = Integer.parseInt(birthdate.substring(0,4));
            month = Integer.parseInt(birthdate.substring(5,7));
            day = Integer.parseInt(birthdate.substring(8));
            LocalDate customerBirthdate = LocalDate.of(year, month, day);
            boolean alcoholAccess = canAlcohol(customerBirthdate);
            System.out.println(alcoholAccess);
        } catch (NumberFormatException e) {
            System.out.print("Enter birthdate in yyyy-mm-dd form: ");;
        }


    }

    public static boolean canAlcohol(LocalDate birthdate){
        LocalDate twentyOneYearsAgo = LocalDate.now().minusYears(21);
        return birthdate.isBefore(twentyOneYearsAgo);
    }
}