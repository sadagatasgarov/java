// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok gozel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(topla(2,4));

    }
    public static void ekle(){
        System.out.println("Ekendi");

    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Guncellendi");
    }

/*
    public static double topla(int i, int b){
        int c;
        c=i+b;
        return c;
    }
*/


    public static int topla(int... sayilar){
        int topla=0;
        for (int sayi:sayilar
             ) {
            topla = topla+sayi;
        }
        return topla;
    }
}