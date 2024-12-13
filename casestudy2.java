import java.util.Scanner;

public class casestudy2 {
    
    // Method to display the cafe menu
    public static void displayMenu() {
        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000");
        System.out.println("4. Mie Goreng - Rp 18000");
    }
    
    // Method to take the order
    public static void takeOrder(Scanner sc) {
        int hargaKopiHitam = 15000, hargaLatte = 22000, hargaTehTarik = 12000, hargaMieGoreng = 18000;
        System.out.println();
        sc.nextLine();
        
        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan nomor meja: ");
        int nomorMeja = sc.nextInt();
        
        System.out.println();
        displayMenu();
        
        int jumlahKopiHitam = 0, jumlahLatte = 0, jumlahTehTarik = 0, jumlahMieGoreng = 0;
        int menuKafe;
        
        do{
            System.out.print("Pilih menu (masukkan nomor menu atau 0 untuk selesai) : ");
            menuKafe = sc.nextInt();
            if (menuKafe == 0) {
                break;
            }
            if (menuKafe == 1) {
                System.out.print("Masukkan jumlah item untuk Kopi Hitam : ");
                jumlahKopiHitam = sc.nextInt();
            }
            if (menuKafe == 2) {
                System.out.print("Masukkan jumlah item untuk Latte : ");
                jumlahLatte = sc.nextInt();
            }
            if (menuKafe == 3) {
                System.out.print("Masukkan jumlah item untuk Teh Tarik : ");
                jumlahTehTarik = sc.nextInt();
            }
            if (menuKafe == 4) {
                System.out.print("Masukkan jumlah item untuk Mie Goreng : ");
                jumlahMieGoreng = sc.nextInt();
            }


        }while (menuKafe != 0);
        
        int jumlahPesanan = (jumlahKopiHitam * hargaKopiHitam) + (jumlahLatte * hargaLatte) + (jumlahTehTarik * hargaTehTarik) + (jumlahMieGoreng * hargaMieGoreng);
        System.out.println("Pesanan berhasil ditambahkan.");
        System.out.println("Total harga pesanan : " + jumlahPesanan);
    }
    
    public static void showOrders(Scanner sc, String nama, int nomorMeja) {
        System.out.println("=== DAFTAR PESANAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Nomer Meja : " + nomorMeja);

    }
    
    public static void Exit() {
        System.out.println("Terima kasih!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("=== MENU KAFE ===");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihMenu = sc.nextInt();
            
            if (pilihMenu == 1) {
                takeOrder(sc); 
            } else if (pilihMenu == 2) {
                showOrders(nama, nomorMeja); 
            } else if (pilihMenu == 3) {
                Exit();
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
        
        sc.close(); // Close the scanner
    }
}

