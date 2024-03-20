import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class Train {
    private String destination;
    private int number;
    private LocalTime time;

    public Train(String destination, int number, LocalTime time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public static Train[] sortByNumber(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(Train::getNumber));
        return trains;
    }

    public static Train[] sortByDestination(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getTime));
        return trains;
    }

    public static void info(Train[] trains, int number) {
        for (Train train: trains) {
            if (train.getNumber() == number) {
                System.out.println(train.toString());
                return;
            }
        }
        System.out.println("This train doesn't exist!");
    }

    public String toString() {
        return "Destination: " + destination + ", number: " + number + ", time: " + time;
    }
}
