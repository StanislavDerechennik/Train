import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Train[] trains = {new Train("Zhabinka", 6468, LocalTime.of(12, 48)),
                new Train("Minsk", 620, LocalTime.of(12, 24)),
                new Train("Vitebsk", 489, LocalTime.of(9, 46)),
                new Train("Gomel", 527, LocalTime.of(18, 57)),
                new Train("Zhabinka", 1324, LocalTime.of(10, 1))};

        for (Train train: trains) {
            System.out.println(train.toString());
        }
        trains = Train.sortByNumber(trains);
        System.out.println();
        for (Train train: trains) {
            System.out.println(train.toString());
        }
        trains = Train.sortByDestination(trains);
        System.out.println();
        for (Train train: trains) {
            System.out.println(train.toString());
        }
        System.out.println();
        Train.info(trains, 1324);
        Train.info(trains, 17);
    }
}
