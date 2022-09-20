package Use_of_for_loop;

public class CubeOfMultipleNo {
    static void printCube(int n) {
        System.out.println("number\t\t\tsquare\t\t\tcube");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "\t\t\t" + (int) Math.pow(i, 2) + "\t\t\t" + (int) Math.pow(i, 3));
        }
    }

    public static void main(String[] args) {
        printCube(6);

    }

}
