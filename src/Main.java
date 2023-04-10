// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranacak = 6;
        boolean VarMi=false;
        for (int sayi :
                sayilar) {
            if (sayi == aranacak){
                VarMi=true;
                break;
            }
        }

        if (VarMi) {
            System.out.println("Sayi var");
            mesajVer(aranacak);
        }else {
            System.out.println("Sayi yoxdur");
        }
    }

    public static void mesajVer(int aranacak){
        System.out.println("Sayi ,movcuddur: " + aranacak);
    }
}