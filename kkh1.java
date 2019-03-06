public class kkh1 {

    public static double kkh(double EAP1, double grade1, double EAP2, double grade2){
        double average = 0;
        average = ((EAP1*grade1+EAP2*grade2)/(EAP1+EAP2));
        return average;
    }

    public static void main(String [ ] args){

        System.out.println(String.format("%.2f", kkh(3,3,6,3)));
    }
}
