import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divisor) {

        if (number < 2)//En küçük asal sayı 2 olduğundan 2den küçük olması durumu kontrol edilir.
            return false;
        if (number == divisor)
            return true;
        if (number % divisor == 0)//Sayının herhangi bir sayıya bölümünden kalan sıfırsa asal değildir.
            return false;

        return (isPrime(number, divisor += 1));// Bölen sayısını 1er artırarak asal sayı kontrolü yapılır.

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");//Kullanıcıdan sayı girişi istenir.
        int number = inp.nextInt();
        System.out.print(isPrime(number, 2) ? number + " Asal Sayıdır." : number + " Asal Sayı Değildir.");
    }
}