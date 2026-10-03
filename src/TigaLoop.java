import java.util.Scanner;
    

public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // 1. Versi FOR dengan variabel pencacahnya sendiri (i)
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (i == n ? "" : " "));
        }
        System.out.println();

        // 2. Versi WHILE dengan variabel pencacahnya sendiri (j)
        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + (j == n ? "" : " "));
            j++;
        }
        System.out.println();

        // 3. Versi DO-WHILE dengan variabel pencacahnya sendiri (k)
        System.out.print("do-while : ");
        int k = 1;
        do {
            if (n > 0) {
                System.out.print(k + (k == n ? "" : " "));
            } else {
                System.out.print(k); // Mencetak '1' secara alami saat n = 0
            }
            k++;
        } while (k <= n);
        System.out.println();
        System.out.println();

        // Pembuktian meleset satu (off-by-one) dengan dua penghitung terpisah
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Penyaringan deret 1-10 dengan continue (lewati genap) dan break (berhenti kalau i > 7)
        System.out.print("Disaring : ");
        int countPrintln = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Melewati angka genap (diletakkan SEBELUM break)
            }
            if (i > 7) {
                break;    // Berhenti jika i > 7
            }

            System.out.print(i + (i == 7 ? "" : " "));
            countPrintln++;
        }
        System.out.println();

        System.out.println("Sampai println  : " + countPrintln + " kali");

        scanner.close();
    }
}
