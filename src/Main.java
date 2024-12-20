import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter birthdate in yyyy-mm-dd form: ");
        LocalDate customerBirthdate = getBirthdate();
        boolean alcoholAccess = canAlcohol(customerBirthdate);
        System.out.println(alcoholAccess);
    }

    public static String getName(){

        return null;
    }

    public static LocalDate getBirthdate(){
        int year, month, day;
        Scanner scan = new Scanner(System.in);
        try{
            String birthdate = scan.nextLine();
            year = Integer.parseInt(birthdate.substring(0,4));
            month = Integer.parseInt(birthdate.substring(5,7));
            day = Integer.parseInt(birthdate.substring(8));
            LocalDate customerBirthdate = LocalDate.of(year, month, day);
            scan.close();
            return customerBirthdate;
        } catch (NumberFormatException e) {
            System.out.print("Enter birthdate in yyyy-mm-dd form: ");;
        }
        return(LocalDate.MAX);
    }

    public static boolean canAlcohol(LocalDate birthdate){
        LocalDate twentyOneYearsAgo = LocalDate.now().minusYears(21);
        return birthdate.isBefore(twentyOneYearsAgo);
    }
}