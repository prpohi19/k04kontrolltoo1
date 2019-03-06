import java.io.*;
import java.util.*;

public class kkh2{

    static double kkh(int grade[], int EAP[], int n) {
        int EAPTotal = 0, numWeight = 0;

        for (int i = 0; i < n; i++) {
            numWeight += grade[i] * EAP[i];
            EAPTotal += EAP[i];
        }
        return (double)(numWeight) / EAPTotal;
    }

    public static void main(String args[]) {
        int A = 5;
        int B = 4;
        int C = 3;
        int D = 2;
        int E = 1;
        int F = 0;
        int grade[] = {A, B, A, C, A};
        int EAP[] = {6, 5, 4, 3, 5};

        int n = grade.length;

        System.out.println(String.format("%.2f", kkh(grade, EAP, n)));
    }
  }
