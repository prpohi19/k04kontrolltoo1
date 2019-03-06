public class step2 {
    static Double[] EAP = {4.0,6.0};
    static Double marks[] = {5.0,3.0};

    public static double wAvg(){
        int len = EAP.length;
        double calc1 = 0;
        double calc2 = 0;
        double calc3 = 0;

        for(int i = 0; i < len; i++){
            calc1 += EAP[i]*marks[i];
            calc2 += EAP[i];
        }
        calc3 = calc1/calc2;

        return calc3;
    }
    public static void main(String [ ] args){
        System.out.println("Kaalutud keskmine on: " + wAvg());
    }
}
