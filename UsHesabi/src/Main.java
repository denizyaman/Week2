import java.util.Scanner;

public class Main {
    static int us(int baseNumber, int exponential ){//Metod oluşturuldu.
        if (baseNumber==0)//Tabanın sıfıra eşit olup olmadığı kontrol edildi.
            return 0;
        if (exponential==0)//Üs değerinin sıfıra eşit olup olmadığı konrtol edildi.
            return 1;// Sıfıra eşit olduğunda recursive sonlandırılır.
        return (baseNumber*us(baseNumber,exponential-1));//Recursive işlemi yapıldı.
    }

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Üssü alınacak değeri giriniz: ");
        int baseNumber= inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponential= inp.nextInt();
        System.out.print("Sonuç: "+us(baseNumber,exponential));// Girilen değerlerle fonksiyon çağırılır.

    }
}