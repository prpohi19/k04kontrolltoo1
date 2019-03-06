import java.util.Scanner;

public class kt1geomeetrilinekeskmine {
    public static void main(String[] args) {
      System.out.println("Geomeetriline keskmine");
      Scanner scan=new Scanner(System.in);
      System.out.println("Mitu arvu sisestad? (vähemalt 2) ");
      int mitu=scan.nextInt();
      if(mitu>=2){
        int list[]=new int[mitu];
        double vastand=1/(double)mitu;
        int kokku=1;

        System.out.println("Sisesta arvud: ");
        for(int i = 0; i<mitu; i++){
            list[i]=scan.nextInt();
            kokku*=list[i];
        }
        double vastus=Math.pow(kokku,vastand);
        if(kokku>=0){
          if(mitu==2){
          System.out.println("Ruutjuur nende arvude korrutisest ehk geom. keskmine on "+vastus);
          }else{
          System.out.println(mitu+". juur nende arvude korrutisest ehk geom. keskmine on "+vastus);
          }
        }else{
          if(mitu==2){
          System.out.println("Ruutjuurt nende arvude korrutisest pole võimalik võtta");
          }else{
          System.out.println(mitu+". juurt nende arvude korrutisest pole võimalik võtta");
          }
        }
      }else{
        System.out.println("Sisesta vähemalt 2 arvu");
      }

      /* 1.OSA
      System.out.println("Sisesta 1. arv:");
      String vastus=scan.nextLine();
      int arv1=Integer.parseInt(vastus);
      System.out.println("Sisesta 2. arv:");
      String vastus2=scan.nextLine();
      int arv2=Integer.parseInt(vastus2);
      double ruutjuur=Math.sqrt(arv1*arv2);
      if(ruutjuur>=0){
        System.out.println("Ruutjuur on "+ruutjuur);
      }else{
        System.out.println("Ruutjuurt pole võimalik võtta");
      }
      */
    }
}
