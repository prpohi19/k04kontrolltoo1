import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Kui suur massiivi soovite teha ? ");
    Scanner reader = new Scanner(System.in);
    int suurus = reader.nextInt();
    //System.out.println(suurus);
    int[] arvud = new int[suurus+5];
    arvud[0] = 7;
    arvud[1] = 6;
    arvud[2] = 15;
    arvud[3] = 9;
    arvud[4] = 1;
    arvud[5] = 2;
    //arvud[suurus+1] = 0;
    //arvud[suurus+2]= 0;
    //int v2him = arvud[0];
    arvud = j2rjestaja(arvud,suurus);


    System.out.println("Masiivi järjestatult on ");
    for (int i=0; i< suurus;i++){
      System.out.println(arvud[i]);
    }
    System.out.println("Väikseim on "+arvud[suurus]);
    System.out.println("Suurim arv masiivis on "+arvud[suurus+1]);
    System.out.println("arv millest 25% on väiksemad on "+arvud[suurus+2]);
    System.out.println("arv millest 50% on väiksemad on "+arvud[suurus+3]);
    System.out.println("arv millest 75% on väiksemad on "+arvud[suurus+4]);

  }

  public static int[] j2rjestaja(int[] arvud, int suurus){

    int v2ike = arvud[0];
    int suur = 0;
    int vahetusi = 1;
    while(vahetusi ==1){
      vahetusi = 0;
      for(int i=0; i < suurus-1;i++){
        if(arvud[i]>arvud[i+1]){
          int abi = arvud[i];
          arvud[i] = arvud[i+1];
          arvud[i+1] = abi;
          vahetusi=1;
        }
      if(v2ike>arvud[i]){v2ike=arvud[i];}
      if(suur<arvud[i]){suur=arvud[i];/*System.out.println("Suur arv on "+arvud[i]);*/}

    }
  }
  int veerand = (int)Math.ceil((suurus/100.00)*25);
  int pool = (int)Math.ceil((suurus/100.00)*50);
  int kolmveera = (int)Math.ceil((suurus/100.00)*75);
  System.out.println("v"+veerand+" p"+pool+" k"+kolmveera);
  arvud[suurus+2] = arvud[veerand-1];
  arvud[suurus+3] = arvud[pool-1];
  arvud[suurus+4] = arvud[kolmveera-1];

    arvud[suurus] = v2ike;
    arvud[suurus+1] = suur;
    //System.out.println("Suurim arv on "+arvud[suurus-1]);
    return arvud;
  }
}
