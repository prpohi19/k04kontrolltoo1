package karpjavurrud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class KTylesanne {

    private void findSmallestAndHighest(int[] inputList) {
        Arrays.sort(inputList);
        System.out.println("--- Smallest --- value in this list is: " + inputList[0]);
        System.out.println("Value that is bigger than --- 25% --- of the others is: " + inputList[inputList.length / 4]);
        System.out.println("Value that is bigger than --- 50% --- of the others is: " + inputList[inputList.length / 2]);
        System.out.println("Value that is bigger than --- 75% --- of the others is: " + inputList[inputList.length - 1 - inputList.length / 2 / 2]);
        System.out.println(" ---Highest --- value in this list is: " + inputList[inputList.length - 1]);
    }

    private void drawBow() throws IOException {
        String st;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sHein\\IdeaProjects\\kontrolltöö_sander_heinsar\\src\\karpjavurrud\\sisendandmed"));
        String[] stringList = new String[0];
        while ((st = br.readLine()) != null) {
            for (int i = 0; i <= st.length() - 1; i++) {
                stringList = st.split(" ");
            }
        }
        int[] intList = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++) {
            intList[i] = Integer.parseInt(stringList[i]);
        }
        for (int i = 0; i<=intList.length-1; i++) {
            System.out.print(intList[i]);
        }
    }


        public static void main (String[]args) throws IOException {

            Random random = new Random();
            int[] testList = new int[random.nextInt(25)];
            if (testList.length >= 2) {
                for (int i = 0; i <= testList.length - 1; i++) {
                    testList[i] = random.nextInt(155);
                }
                KTylesanne test1 = new KTylesanne();
                test1.findSmallestAndHighest(testList);

            } else {
                System.out.println("List is too small...");
            }

            for (int i = 0; i <= testList.length - 1; i++) {
                System.out.print(testList[i] + ", ");
            }

            System.out.println();
            KTylesanne test2 = new KTylesanne();
            test2.drawBow();

        }
    }
