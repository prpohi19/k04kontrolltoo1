import java.io.BufferedReader;
import java.io.FileReader;


public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Student Admin\\IdeaProjects\\Kontrolltöö\\src\\at2hed"));

        String textFile;
        String[] words = new String[0];
        int vastus = 0;
        int vastus2 = 0;
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= textFile.length() - 1; i++) {
                if (textFile.charAt(i) == 'a') {
                    vastus++;
                } else if (textFile.charAt(i) == 'A') {
                    vastus2++;
                }
            }
        }

        System.out.println("Tekstifailis on väikseid a tähti: " + vastus);
        System.out.println("Tekstifailis on suuri A tähti: " + vastus2);
        System.out.println("______________________________");
        int vastus3 = 0;
        int kokku = (vastus + vastus2);
        int count1 = 1;
        int count2 = 2;
        int count3 = 3;
        int t2hti1 = 0;
        int t2hti2 = 0;
        int t2hti3 = 0;


        for (int i = 0; i <= words.length - 1; i++) {
            for (int j = 0; j <= words[i].length() - 1; j++) {
                if (words[i].toLowerCase().charAt(j) == 'a') {
                    vastus3++;

                }
            }
            if (vastus3 == count1) {
                t2hti1++;
            } else if (vastus3 == count2) {
                t2hti2++;
            } else if (vastus3 == count3) {
                t2hti3++;
            }
            System.out.println("Sõnas " + words[i] + " on a tähti: " + vastus3);
            vastus3 = 0;

        }

        System.out.println();
        System.out.println("Kokku on suuri ja väikseid a tähti: " + kokku);
        System.out.println("______________________________");
        System.out.println("Keskmiselt on sõnades " +  kokku/words.length + " a täht(e)");
        System.out.println("1 a täht on " + t2hti1 + " sõnas");
        System.out.println("2 a tähte on " + t2hti2 + " sõnas");
        System.out.println("3 a täht on " + t2hti3 + " sõnas");


    }
}
