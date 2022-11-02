import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boyut, iterator = 0;
        Scanner input = new Scanner(System.in);
        boyut = input.nextInt();

        int[] list = new int[boyut];
        for (int a = 0; a < boyut; a++) {
            System.out.println(a + ". indiste bulanan eleman : ");
            list[a] = input.nextInt();
        }
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            iterator = 1;
            for (int j = 0; j < list.length; j++) {

                if (i != j && list[i] == list[j]) {
                    iterator++;
                }

            }
            if (iterator != 0) {
                System.out.println(list[i] + "sayısı " + iterator + " kere tekrar edildi.");
            }

        }
    }
}