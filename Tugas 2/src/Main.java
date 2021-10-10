import java.util.Scanner;

/**
 * Nama     : Putri Matondang
 * Kelas    : DHBA
 * NIM      : 24001983861
 */

public class Main {
    public static String nama = "-", alamat = "-", noHP = "-", tanggalLahir = "-", status = "-", noKTP = "-", confirm, newStatus;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int inputMenu;
        do{
            System.out.print("Nama: "); nama = scanner.nextLine();
            System.out.print("Tanggal Lahir: "); tanggalLahir = scanner.nextLine();
            System.out.print("Nomor Handphone: "); noHP = scanner.nextLine();

            do{
                System.out.print("Apakah Anda yakin dengan data tersebut? [Y|N]: "); confirm = scanner.nextLine();
                if(confirm.equals("y") || confirm.equals("Y") || confirm.equals("n") || confirm.equals("N"))
                    break;
                else {
                    System.out.println("Masukan salah");
                }
            }
            while (true);
        }
        while (confirm.equals("n") || confirm.equals("N"));

        while(true){
            System.out.println("Menu:");
            System.out.println("  1. Lihat Data Diri");
            System.out.println("  2. Update Data Diri");
            System.out.println("  3. Keluar");

            try{
                System.out.print("Input pilihan: "); inputMenu = Integer.parseInt(scanner.nextLine());
                if(inputMenu == 1)
                    showDataDiri();
                else if(inputMenu == 2)
                    UpdateDataDiri();
                else if(inputMenu == 3)
                    break;
                else
                    System.out.println("Pilihan tidak tersedia");
            }
            catch (NumberFormatException e){
                System.out.println("Error: Masukan tidak valid");
            }
        }
    }

    private static void UpdateDataDiri() {
        System.out.println("==== Update Data Diri ====");
        System.out.println("Pilihan: ");
        System.out.println("  1. Nama");
        System.out.println("  2. Alamat");
        System.out.println("  3. Nomor Handphone");
        System.out.println("  4. Tanggal Lahir");
        System.out.println("  5. Status");
        System.out.println("  6. Nomor KTP");
        System.out.println("  7. Cancel");
        System.out.print("Masukkan pilihan: ");

        try {
            int pilihan = Integer.parseInt(scanner.nextLine());
            switch (pilihan){
                case 1:
                    System.out.print("Nama: " + nama + "\n");
                    System.out.print("Masukkan Nama Baru : "); nama = scanner.nextLine(); break;
                case 2:
                    System.out.print("Alamat: " + alamat + "\n");
                    System.out.print("Masukkan Alamat Baru : ") ;alamat = scanner.nextLine(); break;
                case 3:
                    System.out.print("Nomor Handphone: " + noHP + "\n");
                    System.out.print("Masukkan Nomor Handphone Baru : "); noHP = scanner.nextLine(); break;
                case 4:
                    System.out.print("Tanggal Lahir: " + tanggalLahir + "\n");
                    System.out.print("Masukkan Tanggal Lahir Baru : "); tanggalLahir = scanner.nextLine(); break;
                case 5:
                    System.out.print("Status: " + status + "\n");
                    System.out.print("Masukkan Status Baru (Kawin / Belum Kawin) : \n");
                    status = scanner.nextLine();
                    if(status.equals("Kawin") || status.equals("kawin") || status.equals("belum kawin") || status.equals("Belum Kawin"))
                        break;
                    else {
                        System.out.println("Masukan salah. Masukan hanya menerima (Kawin / Belum Kawin)");
                    }
                    break;

                case 6:
                    System.out.print("Nomor KTP: " + noKTP + "\n");
                    System.out.print("Masukkan Nomor KTP Baru : "); noKTP = scanner.nextLine(); break;
                case 7: break;
                default: System.out.println("Cancel"); UpdateDataDiri(); break;
            }
        }
        catch (NumberFormatException e){
            System.out.println("Error: Masukan tidak valid");
            UpdateDataDiri();
        }
    }

    private static void showDataDiri() {
        System.out.println("==== Data Diri ====");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Handphone: " + noHP);
        System.out.println("Tangggal Lahir: " + tanggalLahir);
        System.out.println("Status: " + status);
        System.out.println("Nomor KTP: " + noKTP);
    }
}
