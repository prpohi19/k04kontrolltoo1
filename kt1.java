import java.util.Scanner;
  public class kt1 {
      public static void main(Integer[] arg){
        int length = 0;
        int l6pparv = 0;
        int l6pplength = 0;
        int i;
        Scanner reader = new Scanner(System.in);
        System.out.println("Sisesta esimene arv ");
        int arv1 = reader.nextInt();
         length ++;
        System.out.println("Sisesta teine arv ");
        int arv2 = reader.nextInt();
        length ++;
        System.out.println("Sisesta kolmas arv ");
        int arv3 = reader.nextInt();
        length ++;

        l6pparv = (arv1 + arv2 + arv3);
        l6pplength = (l6pparv / length);

      System.out.println("Arvude aritmeetiline keskmine on: "+l6pplength);
      }

  }
