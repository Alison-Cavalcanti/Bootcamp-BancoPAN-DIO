import java.util.Scanner;

public class PrecoCarro {
    
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int porcentagemImpostos= scan.nextInt();


        double valorDistribuidor = custoFabrica * porcentagemDistribuidor / 100;
        double valorImpostos = custoFabrica * porcentagemImpostos / 100;


        double precoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println((int)precoFinal);










    scan.close();
        
    

    }
}
