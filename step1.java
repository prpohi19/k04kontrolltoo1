public class step1 {

    public static double wAvg(double p1, double m1, double p2, double m2){
        double avg = 0;
        avg = ((p1*m1+p2*m2)/(p1+p2));
        return avg;
    }

    public static void main(String [ ] args){

        System.out.println(wAvg(4,5,6,3));
    }
}
