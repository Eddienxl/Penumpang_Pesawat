//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Flight flight = new Flight();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Penumpang");
            System.out.println("2. Hapus Penumpang");
            System.out.println("3. Tampilkan Semua Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama penumpang: ");
                    String addName = scanner.nextLine();
                    flight.addPassenger(addName);
                    System.out.println("Penumpang " + addName + " telah ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan nama penumpang yang akan dihapus: ");
                    String removeName = scanner.nextLine();
                    flight.removePassenger(removeName);
                    System.out.println("Penumpang " + removeName + " telah dihapus (jika ada).");
                    break;
                case 3:
                    System.out.println("Daftar Penumpang:");
                    flight.displayPassengers();
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
