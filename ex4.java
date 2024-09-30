import java.util.Date;

public class ex4 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date (toString): " + currentDate.toString());
        long timeInMillis = currentDate.getTime();
        System.out.println("Current Time in Milliseconds since Epoch: " + timeInMillis);
        Date futureDate = new Date(currentDate.getTime() + 1000 * 60 * 60);
        System.out.println("Is futureDate after currentDate? " + futureDate.after(currentDate));
        Date pastDate = new Date(currentDate.getTime() - 1000 * 60 * 60);
        System.out.println("Is pastDate before currentDate? " + pastDate.before(currentDate));
        Date anotherDate = new Date(currentDate.getTime() + 1000 * 60);
        int comparison = currentDate.compareTo(anotherDate);
        if (comparison < 0) {
            System.out.println("currentDate is before anotherDate.");
        } else if (comparison > 0) {
            System.out.println("currentDate is after anotherDate.");
        } else {
            System.out.println("currentDate is equal to anotherDate.");
        }
    }
}
