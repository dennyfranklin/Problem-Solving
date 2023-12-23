package String;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FibanocciSeries {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        System.out.print(x + " ");
        System.out.print(y + " ");

        for (int i = 2; i < 15; i++) {
            int sum = x + y;
            System.out.print(sum + " ");
            x = y;
            y = sum;
        }
    }
}
