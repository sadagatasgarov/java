// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sayi = 10;
        String sehir = "Ankara";
        for (int i = 0; i < sayi; i++) {
            System.out.println(1 == 8);
        }

        if (sayi == 10) {
            System.out.println(sehir);
        } else {
            System.out.println("sayi on deyil");
        }

        int sayi1 = 30;
        int sayi2 = 25;
        int sayi3 = 1000;

        if (sayi1 > sayi2 && sayi2 >= sayi3) {
            System.out.println(sayi1);
        } else if (sayi2 > sayi1 && sayi1 >= sayi3) {
            System.out.println(sayi2);
        } else {
            System.out.println(sayi3);
        }

        char not = 'A';

        switch (not) {
            case 'A':
                System.out.println("Ela");
                break;
            case 'B':
                System.out.println("yaxsi");
                break;
            case 'C':
                System.out.println("Cetinlikel");
            default:
                System.out.println("Kece bilmediniz");
        }


    }
}