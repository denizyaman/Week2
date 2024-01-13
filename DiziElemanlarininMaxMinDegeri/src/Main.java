import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num = input.nextInt();

        int[] list = {15, 12, 88, 1, -1, -78, 79, 2, 0};
        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length - 1];

        for (int eleman : list) {
            if ( eleman < max && eleman > num ) {
                max = eleman;
            }
            if ( eleman > min&&eleman < num) {
                min = eleman;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}