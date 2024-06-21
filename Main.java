import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int number = inp.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        // Basamak sayısını hesapla
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        // tempNumber'ı tekrar orijinal değere ayarla
        tempNumber = number;
        // Basamakları ekrana yazdır
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1 ; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        System.out.println(result);
    }
}

