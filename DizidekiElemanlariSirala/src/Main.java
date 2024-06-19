import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Sıfırdan büyük bir değer giriniz!!");
        } else {
            int[] arr = new int[number];
            for (int i = 0; i < number; i++) {
                System.out.println((i + 1) + ". sayıyı giriniz: ");
                arr[i] = input.nextInt();
                System.out.println((i + 1) + ". eleman: " + arr[i]);
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
