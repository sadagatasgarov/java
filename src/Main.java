// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,7,8,9,0};
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
        }else {
            System.out.println("Sayi yoxdur");
        }


    }
}