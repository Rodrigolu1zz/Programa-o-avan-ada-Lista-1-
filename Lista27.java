import java.util.Scanner;

public class Lista27 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int soma = 0;
      double media;
      int[] gli = new int[4];
      System.out.println("Informe 4 medições ao longo do dia para verificar a sua glicose");
      for (int i = 0; i < gli.length; i++){
        System.out.println("informe a " + (i+1) + " aferição");
        gli[i] = sc.nextInt();
      }
      sc.close();  
      
      for(int k = 0; k < gli.length; k++){
        soma += gli[k];
      }
      for (int j = 0; j < gli.length; j++){
        String msg = "0";
        if (gli[j] < 110){
          msg = " NORMAL";
        }
        else if (gli[j] <= 100 || gli[j] < 125){
          msg = " ALTERADA";
        }
        else if (gli[j] > 125){
          msg = " MUITO ALTA";
        }
        System.out.print(gli[j]);
        System.out.println(msg);
      }
      media = soma/gli.length;
      System.out.println("A média é " + media);
    }
    
}
