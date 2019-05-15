import java.io.*;
import java.util.*;

class kesk2
{
   public static void main(String args[])  throws IOException{
 
    int i;
 
    System.out.println("Enter number of subjects");
 
    Scanner sc=new Scanner(System.in);
 
    int n=sc.nextInt();
 
    int[] a=new int[n];
 
    double avg=0;
 
    System.out.println("Enter marks");
 
    for( i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
 
    for( i=0;i<n;i++)
    {
      avg=avg+a[i];
    }
 
    System.out.print("Average of (");
 
    for(i=0;i<n-1;i++)
    {
      System.out.print(a[i]+",");
    }
    System.out.println(a[i]+") ="+avg/n);
	
	PrintWriter kirjutaja=new PrintWriter(new FileWriter("kesk2_val.txt"));
	System.out.print("Average of (");
	    for(i=0;i<n-1;i++){
			kirjutaja.println(avg/n);
		}
		kirjutaja.close();
  }
}
