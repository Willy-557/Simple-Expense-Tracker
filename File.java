// start 19:36
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;



public class File{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        HashMap<String, ArrayList<Integer>> storage = new HashMap <>();
        
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
                switch (opsi) {

                    // Tambah Kategori Baru
                    case 1:
                        System.out.println("-- Tambah Kategori --");
                        System.out.print("Nama kategori: ");
                        String namaKategori = scanner.nextLine();

                        if (storage.containsKey(namaKategori)) {
                            System.out.println("Nama kategori '" + namaKategori + "' sudah ada!, tolong pilih nama yang lain!");
                            break;
                        }
                        else {
                            ArrayList<Integer> penyimpananPengeluaran = new ArrayList<>();
                            storage.put(namaKategori, penyimpananPengeluaran);
                            System.out.println("Kategori '" + namaKategori + "' berhasil di-tambahkan!");
                            System.out.println(storage);
                            break;
                        }

                    //  Catat pengeluaran
                    case 2:
                        System.out.println("-- Catat Pengeluaran --");
                        for (String nameKategori : storage.keySet()) {
                            System.out.println("- " + nameKategori);
                        }
                        System.out.print("Pilih kategori yang ingin di-tambahkan nominal: ");
                        String pilihKategori = scanner.nextLine();
                        
                        if (!storage.containsKey(pilihKategori)) {
                            System.out.println("Kategori '" + pilihKategori + "' tidak ada di menu, silahkan buat terlebih dahulu!");
                            continue;
                        }
                        else {
                            System.out.print("Tuliskan nominalnya (Rp): ");
                            int nominalKategori = scanner.nextInt();
                            storage.get(pilihKategori).add(nominalKategori);
                            System.out.println("Berhasil menambahkan nominal sebesar Rp " + nominalKategori + " ke Kategori '" + pilihKategori + "'.");
                            break;
                        }

                    // Tampilkan Laporan (Total per kategori)
                    case 3:
                        System.out.println("-- LAPORAN KEUANGAN --");
                        
                        for (String namaMasing2Kategori : storage.keySet()) {
                            int total = 0;
                            System.out.println("Kategori : " + namaMasing2Kategori);
                            for (Integer nominalKategori : storage.get(namaMasing2Kategori)){
                                
                                
                                System.out.println("- " + nominalKategori);
                                total += nominalKategori;
                                
                            }
                            System.out.println("Total makan: Rp " + total);
                        }

                        


                    default:
                        break;
                }
            }
        }
    }
}