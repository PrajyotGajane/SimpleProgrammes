import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2026, 12, 15);
        LocalDate d2 = LocalDate.of(2020, 01, 15);

        System.out.println("Date 1 : " + d1);
        System.out.println("Date 2 : " + d2);
        if (d1.isAfter(d2)) {
            System.out.println("Date 1 : " + d1 + " is after Date 2 : " + d2);
        } else if (d1.isBefore(d2)) {
            System.out.println("Date 1 : " + d1 + " is before Date 2 : " + d2);
        } else if (d1.isEqual(d2)) {
            System.out.println("Date1 is equal to Date2");
        }
    }
}