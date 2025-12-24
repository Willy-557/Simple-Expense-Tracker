// start 19:36
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;



public class File{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        HashMap<String, ArrayList> storage = new HashMap<>();

        while (true) {
            System.out.println("=== DOMPET PINTAR ===");
            System.out.println("1. Tambah Kategori Baru");
            System.out.println("2. Catat pengeluaran");
            System.out.println("3. Tampilkan Laporan (Total per kategori)");
            System.out.println("4. Keluar");

            System.out.print(">> ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            if (opsi == 4) {
                System.out.println("Terimakasih!");
                break;
            }
            else if (opsi > 4 || opsi < 1) {
                System.out.println("Invalid input!");
                continue;
            }
            else {
                
            }
        }
    }
}