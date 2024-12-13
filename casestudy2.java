import java.util.Scanner;

public class casestudy2 {

    public static void addData(Scanner sc, String[][] menus, int count) {
        System.out.println("Masukkan nama pelanggan");
        menus[count][0] = sc.nextLine();
        System.out.println("Masukkan nomor meja");
        menus[count][1] = String.valueOf(sc.nextInt());

        showCafeMenus();
    }

   public static void showMenu() {
        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Tambahkan Pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
    
   }
    public static void showCafeMenus() {
        int hargaKopiHitam = 15000, hargaLatte = 22000, hargaTehTarik = 12000, hargaMieGoreng = 18000;
        while (true) {
            int menu = 0;
            System.out.println("=== MENU KAFE ===");
            if (menu == 1) {
                System.out.println("1. Kopi Hitam - Rp" + hargaKopiHitam);
            }
            if (menu == 2) {
                System.out.println("2. Latte - Rp" + hargaLatte);
            }
            if (menu == 3) {
                System.out.println("3. Teh Tarik Rp" + hargaTehTarik);
            }
            if (menu == 4) {
                System.out.println("4. Mie Goreng - Rp" + hargaMieGoreng);
            }
        }
    }

    public static void chooseMenu() {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listMenu = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
        String[][] menus = new String[20][2];
        while (true) {
            showMenu();
            int menu = sc.nextInt();

            if (menu == 1) {
                showMenu();
            }
            if (menu == 2) {
                showCafeMenus();

                break;
            }
            if (menu == 3) {
                System.out.println("Terima kasih telah berkunjung");
            }
        }
    }
}