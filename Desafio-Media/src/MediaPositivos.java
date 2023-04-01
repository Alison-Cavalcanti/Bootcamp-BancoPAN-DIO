import java.util.Locale;
import java.util.Scanner;

public class MediaPositivos {
	
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      int cont = 0;
      double media = 0;
      double x;
 
      
         for (int i = 0; i < 6; i++) {
             x = sc.nextDouble();
             if (x > 0) {
                 cont++;
                 media += x;
             }
         }
         
         media /= cont;
         System.out.println(cont + " valores positivos");
         System.out.println(String.format(Locale.US,"%.1f", media));
         sc.close();
     }
    
 }