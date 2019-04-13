import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Tidy {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("bla.txt"));
        String row = bufferedReader.readLine();
        String[] massif;
        List<String> words = new ArrayList<>();

        while (row != null){
            massif = row.
                    replaceAll("\\.", "").
                    replaceAll(",", "").
                    split(" ");
            row = bufferedReader.readLine();

            for (String word : massif){
                if (word.length() > 0) {
                    words.add(word);
                }
            }
        }

        int aCounter = 0; // a tähti
        int allACombined = 0; // köik a tähed kokku
        int allWordsWithA = 0; // sönad, kus on a tähed
        int wordLengthCombined = 0; // sönade pikkused kokku
        int wordCounter = 0;
        double aPerWord = 0;

        int wordMaxLength = 0;
        int wordMinLength = 100;

        int[] wordsWithAs = new int[5]; // massiiv kogumaks a tähti
        String[] wordsWithAsList = new String[5]; // massiiv kogumaks a tähtedega tähti

        String containsAllAs; // abi string

        for (String word : words){
            wordCounter += 1;
            wordLengthCombined += word.length();

            if (word.length() > wordMaxLength){
                wordMaxLength = word.length();
            } else if (word.length() < wordMinLength){
                wordMinLength = word.length();
            }

            for (int i = 0; i < word.length(); i++){
                String character = Character.toString(word.charAt(i));
                if (character.matches("[aA]")){ // oli a|A
                    aCounter += 1;
                    allACombined += 1;
                }
            }

            containsAllAs = word + " ";

            if (aCounter > 0){
                aPerWord += (double)aCounter / word.length();
                allWordsWithA += 1;

                wordsWithAs[aCounter-1] += 1;
                wordsWithAsList[aCounter-1] += containsAllAs;
            }

            aCounter = 0;
        }

        double suhtarv = (double)allACombined/wordLengthCombined*100;
        double howManyWordsHaveA = (double)allWordsWithA/wordCounter*100;

        System.out.print("Words: " + wordCounter +
                "\nAll word lengths combined: " + wordLengthCombined +
                "\nAll a or A's combined: " + allACombined +
                "\nAll words with a or A: " + allWordsWithA +
                "\nHow many A or a out of all letters: " + allACombined + "/" + wordLengthCombined);
        System.out.printf(" protsent: %.2f", suhtarv);
        System.out.print("%\nHow many of words have a or A " + allWordsWithA + "/" + words.size());
        System.out.printf(" protsent: %.2f", howManyWordsHaveA);
        System.out.print("%\n");
        System.out.println("A's on average " + aPerWord/wordCounter + "\n");

        for (int i = 0; i < wordsWithAs.length; i++){
            if (wordsWithAsList[i] != null) {
                System.out.format("%d %2d %s \n", i+1, wordsWithAs[i], wordsWithAsList[i].substring(4));
            }
        }



        int countALetters = 0;
        String[] listOfWords = new String[wordMaxLength+1]; // massiiv kogumaks a tähtedega tähti +1

        for (int i = wordMinLength; i <= wordMaxLength; i++) { //
            //System.out.print(i + " ");
            System.out.format("%2d ", i);
            for (String word : words){
                if (word.length() == i){
                    for (int j = 0; j < word.length(); j++){
                        String character = Character.toString(word.charAt(j));
                        if (character.matches("[aA]")){ // oli a|A
                            countALetters += 1;
                            //System.out.print(character + " " + countALetters + " ");
                        }
                    }
                    if (word.contains("a") || word.contains("A")){
                        listOfWords[i] += word + " ";
                    }
                }
            }
            //System.out.print(countALetters + " ");
            System.out.format("%2d ", countALetters);
            if (listOfWords[i] != null){
                System.out.print(listOfWords[i].replaceAll("null", "") + "\n");
            } else {
                System.out.print(" \n");
            }
            //System.out.println("");
            countALetters = 0;
        }
    }
}
