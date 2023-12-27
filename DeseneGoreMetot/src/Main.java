import java.util.Scanner;

public class Main {

    static void pattern(int number, int number2, int direction) {
        System.out.print(number2 + " ");// İlk sayı yazdırılır.
        if (number == number2 && direction == 2)// Artırılan sayı ilk sayıya eşitlenince işlem durdurulur
            return;

        if (number2 <= 0) { // Sayı 0'a eşit veya küçükse yön değiştirilir.Sayı arttırılr.
            direction = 2;
        }
        pattern(number, direction == 1 ? number2 - 5 : number2 + 5, direction);// İşlem yapılır.
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Gİriniz: ");//Kullanıcıdan sayı girişi istenir.
        int number = inp.nextInt();
        if (number<0){
            System.out.println("Pozitif değer giriniz.");
        }else {
        //Girilen sayı pozitifse işlem yapılır.
            pattern(number, number, 1);
        }
    }
}