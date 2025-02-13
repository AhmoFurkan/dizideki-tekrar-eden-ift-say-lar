import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Verilen dizi
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        // Girilen sayı
        int girilenSayi = 5;

        // Diziyi sıralıyoruz
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));





        System.out.println("500");
        // Girilen sayıdan küçük en yakın sayıyı bulalım
        int kucukEnYakin = -1;
        int buyukEnYakin = -1;

        // Diziyi tarayarak küçük ve büyük en yakın sayıları bulalım
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < girilenSayi) {
                kucukEnYakin = arr[i];

            }
            if (arr[i] > girilenSayi) {
                buyukEnYakin = arr[i];
                break;
            }
        }

        // Sonuçları ekrana yazdıralım
        System.out.println("Girilen Sayı: " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);
    }
}
























