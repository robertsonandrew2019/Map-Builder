import java.util.Random;
public class Main {

    public static int mapWidth = 100;
    public static int mapHeight = 100;

    public static void main(String[] args) {
        buildMap();
    }

    public static void buildMap() {
        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                System.out.printf("%s ", getCell());
            }
            System.out.println();
        }
    }

    public static String getCell() {
        Random rand = new Random();
        int count = rand.nextInt(5);
        String cell;
        if (count == 0) {
            cell = "."; //grass
        }
        else if (count == 1) {
            cell = ":"; //thick grass
        }
        else if (count == 2) {
            cell = "^"; //mountain
        }
        else if (count == 3) {
            cell = "T"; //tree
        }
        else {
            cell = "~"; //water
        }
        return cell;
    }
}
