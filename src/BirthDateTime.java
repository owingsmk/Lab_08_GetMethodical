import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] arg) {

        int yearBirth = 0;
        int monthBirth = 0;
        int dayOfBirth = 0;
        int hour = 0;
        int minutes = 0;
        Scanner in = new Scanner(System.in);

        yearBirth = SafeInput.getRangedInt(in, "Please enter birth year using 4 digit: ", 1950, 2023);

        monthBirth = SafeInput.getRangedInt(in, "Enter your birth month using 1-12: ", 1, 12);

        switch(monthBirth){
            case 9:
            case 4:
            case 6:
            case 11:
                dayOfBirth = SafeInput.getRangedInt(in, "Enter the date of your birth using 1-30: ", 1, 30);
                break;
            case 2:
                if (((yearBirth % 4 ==0) && !(yearBirth % 100 == 0)) || (yearBirth % 400 == 0)){

                    dayOfBirth = SafeInput.getRangedInt(in, "Enter the date of your birth using 1-29: ", 1, 29);
                }
                else{
                    dayOfBirth = SafeInput.getRangedInt(in,"Enter the date of your birth using 1-31: ", 1, 31);
                }
                break;
            default:
                dayOfBirth = SafeInput.getRangedInt(in, "Enter the date of your birth using 1-31: ", 1, 31);
                break;
        }

        hour = SafeInput.getRangedInt(in, "What is the hour: ", 1, 24);

        minutes = SafeInput.getRangedInt(in, "What is the minute now: ", 1, 60);

        System.out.print("Your birthday is " + yearBirth + monthBirth + dayOfBirth);
        System.out.print("The time is " + hour + minutes);
    }
}
