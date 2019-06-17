import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Geomeetriline keskmine");
        Scanner scan = new Scanner(System.in);
        System.out.println("Mitmest arvust keskmist soovid leida? ");
        int mitu = scan.nextInt();
        if (mitu >= 2) {
            int list[] = new int[mitu];
            double vastand = 1 / (double) mitu;
            int kokku = 1;
            System.out.println("Sisesta arvud: ");
            for (int i = 0; i < mitu; i++) {
                list[i] = scan.nextInt();
                kokku *= list[i];
            }
            double vastus = Math.pow(kokku, vastand);
            if (kokku >= 0) {
                System.out.println(mitu + ". juur nende arvude korrutisest (geomeetriline keskmine) " + vastus);
            } else {
                System.out.println(mitu + ". juurt nende arvude korrutisest ei saa leida");
            }
        } else {
            System.out.println("Sisesta vähemalt 2 arvu");
        }
    }
}
