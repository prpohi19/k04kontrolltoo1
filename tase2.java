package kontrolltöö;

import java.util.Arrays;

public class tase2 {

    void ylesanne(int[] arr) {
        Arrays.sort(arr);
        int arrayLength = arr.length;
        int veerand = arrayLength/4;
        int pool = arrayLength/2;
        int kolmveerand = arrayLength-veerand;
        System.out.println("Kõike väiksem number on: " + arr[0]);
        System.out.println("Number millest 25 protsenti on väiksemad: " + arr[veerand-1]);
        System.out.println("Number millest 50 protsenti on väiksemad: " + arr[pool-1]);
        System.out.println("Number millest 75 protsenti on väiksemad: " + arr[kolmveerand-1]);
        System.out.println("Kõige suurem number on: " + arr[arr.length-1]);
    }

    public static void main(String[] args) {
        tase2 main = new tase2();
        int[] arr = new int[8];
        arr[0] = 105;
        arr[1] = 1;
        arr[2] = 202;
        arr[3] = 402;
        arr[4] = 910;
        arr[5] = 123;
        arr[6] = 843;
        arr[7] = 578;
        main.ylesanne(arr);
    }
}