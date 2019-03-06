public class Polygon {

    private double[] xCoords;
    private double[] yCoords;

    public Polygon(double[] xCoords, double[] yCoords) throws Exception {
        if (xCoords.length != yCoords.length) {
            throw new Exception("Different amount of x and y coordinates");
        }
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    /*
        Kontrollib, kas hulknurk on võrdkülgne
    */
    public boolean isEquilateral() {
        return isEquilateral(3);
    }

    /*
        Kontrollib, kas hulknurk on võrdkülgne, valikulise täpsusega
    */
    public boolean isEquilateral(int roundToDecimalPlaces) {
        double[] sides = getSides();
        double mult = Math.pow(10, roundToDecimalPlaces);

        for (int i = 0; i < sides.length; i++) {
            if (i > 0) {
                if (Math.round(sides[i-1] * mult) != Math.round(sides[i] * mult)) {
                    return false;
                }
            }
        }

        return true;
    }

    /*
        Kontrollib, kas hulknurga tipud on samal kaugusel keskkohast, valikulise täpsusega
    */
    public boolean isSameDistanceFromCenter(double roundToDecimalPlaces) {
        double[] center = getCentroid();
        double mult = Math.pow(10, roundToDecimalPlaces);
        double distance = 0;
        for (int i = 0; i < xCoords.length; i++) {
            if (i == 0) {
                // Salvesta esimese elemendi kaugus muutujasse, et hiljem sellega võrrelda
                distance = Math.round(getDistance(center[0], center[1], xCoords[i], yCoords[i]) * mult);
            } 
            else if (distance != Math.round(getDistance(center[0], center[1], xCoords[i], yCoords[i]) * mult)) {
                return false;
            }
        }
        return true;
    }

    /*
        Arvutab külgede pikkused
    */
    private double[] getSides() {
        double[] sides = new double[xCoords.length];
        for (int i = 0; i < xCoords.length; i++) {
            if (i == xCoords.length - 1) {
                sides[i] = getDistance(xCoords[i], yCoords[i], xCoords[0], yCoords[0]);
            } 
            else {
                sides[i] = getDistance(xCoords[i], yCoords[i], xCoords[i+1], yCoords[i+1]);
            }
        }
        return sides;
    }

    /*
        Arvutab pikkuse kahe punkti vahel
    */
    private double getDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    /*
        Leiab keskpunkti
    */
    private double[] getCentroid() {
        double sumX = 0;
        double sumY = 0;
        int count = xCoords.length;
        for (int i = 0; i < count; i++) {
            sumX += xCoords[i];
            sumY += yCoords[i];
        }
        return new double[] {sumX / count, sumY / count};
    }

    /*
        Prindib välja hulknurga tippude koordinaadid
    */
    @Override
    public String toString() {
        String result = "Hulknurk: ";

        for(int i = 0; i < xCoords.length; i++) {
            result += "(" + xCoords[i] + ";" + yCoords[i] + ") ";
        }

        return result;
    }    

}