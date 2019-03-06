import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class KaalutudKeskmine
{
    public static double kaalutudKeskmine(ArrayList <Integer> kaalud, ArrayList <Integer> numbrilised_hinded)
    {
        double vastus = 0;
        switch (numbrilised_hinded.size())
        {
            case 0:
                break;

            case 1:
                vastus = numbrilised_hinded.get(0);
                break;

            default:
                int lugeja = 0;
                int nimetaja = 0;
        
                for (byte i=0; i < numbrilised_hinded.size(); i++)
                {
                    lugeja += numbrilised_hinded.get(i) * kaalud.get(i);
                    nimetaja += kaalud.get(i);
                }
        
                vastus = ((double)lugeja / (double)nimetaja);
        }

        return vastus;
    }

    public static void main(String [] argumendid)
    {
        Scanner sisend;
        String fiktiivmuutuja;  // dummy
        ArrayList <String> tahelised_hinded     = new ArrayList <String>();
        ArrayList <Integer> numbrilised_hinded  = new ArrayList <Integer>();
        ArrayList <Integer> kaalud              = new ArrayList <Integer>();

        try
        {
        	sisend = new Scanner(new FileReader("hinded.txt"));
        	while(sisend.hasNext()) 
					{
    				fiktiivmuutuja = sisend.next();
    				tahelised_hinded.add(sisend.next());
    				kaalud.add(sisend.nextInt());
					}            

            for (String hinne : tahelised_hinded)
            {
                switch (hinne)
                {
                    case "A":
                        numbrilised_hinded.add(5);
                        break;
                    case "B":
                        numbrilised_hinded.add(4);
                        break;
                    case "C":
                        numbrilised_hinded.add(3);
                        break;
                    case "D":
                        numbrilised_hinded.add(2);
                        break;
                    case "E":
                        numbrilised_hinded.add(1);
                        break;
                    case "F":
                        numbrilised_hinded.add(0);
                        break;
                }
            }
            //System.out.println(KaalutudKeskmine.kaalutudKeskmine(kaalud, numbrilised_hinded));

            PrintWriter valjund = null;
            try
            {
                valjund = new PrintWriter("kaalutud_keskmine.txt", "UTF-8");
 
                valjund.println(KaalutudKeskmine.kaalutudKeskmine(kaalud, numbrilised_hinded));
                //valjund.close();
            }
            catch (Exception e)
            {}
            finally
            {
                if (valjund != null) 
                {
                    try 
                    {
                        valjund.close();
                    } 
                    catch (Exception h) 
                    {
                        h.printStackTrace();
                    }
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Ei leia faili hinded.txt");
        }
        catch (Exception u)
        {}
        finally
        {}
    }
}
