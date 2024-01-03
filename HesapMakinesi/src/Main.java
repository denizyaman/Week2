import java.util.Scanner;

public class Main {
    static void sum(int number1, int number2){
        int result = number1+number2;
        System.out.println("Toplama İşlemi Sonucu: "+ result);
    }
    static void subtraction(int number1,int number2){
        int result = number1-number2;
        System.out.println("Çıkarma İşlemi Sonucu: "+result);
    }
    static void multiplication(int number1,int number2){
        int result= number1*number2;
        System.out.println("Çarpma İşlemi Sonucu: "+ result);
    }
    static void division (int number1,int number2){
        int result=number1/number2;
        System.out.println("Bölme İşlemi Sonucu: "+ result);
    }
    static void exponential(int number1, int number2){
        int result=1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;
        }
        System.out.println("Üslü Sayı Sonucu: "+ result);
    }
    static void mod(int number1, int number2){
        int result=0;
        result=number1%number2;
        System.out.println("Mod Hesabı Sonucu: "+ result);
    }
    static void rectangle(int number1, int number2){
        int result=0;
        result=2*(number1+number2);
        System.out.println("Dikdörtgenin Çevresi: " +result);
        int result2=0;
        result2=number2*number1;
        System.out.println("Dikdörtgenin Alanı: " +result2);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Mod Alma İşlemi\n"
                +"7_Dikdörtgen Alan ve Çevre Hesabı\n"
                +"8-Çıkış Yap\n";
        System.out.print(menu);
    while (true){
        System.out.print("İşlem türünü seçiniz: ");
        select= inp.nextInt();
        if (select==0){
            break;
        }
        if (select==8){
            System.out.println("Çıkış Gerçekleştirildi.");
            System.exit(0);
        }
        System.out.print("İlk sayıyı giriniz: ");
        int number1= inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int number2= inp.nextInt();

        switch (select){
            case 1:
                sum(number1,number2);
                break;
            case 2:
                subtraction(number1,number2);
                break;
            case 3:
                multiplication(number1,number2);
                break;
            case 4:
                division(number1,number2);
                break;
            case 5:
                exponential(number1,number2);
                break;
            case 6:
                mod(number1,number2);
                break;
            case 7:
                rectangle(number1,number2);
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz!!");
                break;
        }
    }

    }
}