import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's date is : " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time is : " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Today's date and time is : " + dateTime);

        Month month = dateTime.getMonth();
        System.out.println("Month is : " + month);

        int day = dateTime.getDayOfMonth();
        System.out.println("Day in the month is : " + day);
    }
}
