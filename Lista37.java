import java.util.Scanner;
public class Lista37 {
    String NomeJogador, tipo;
    int num=0;

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int  soma = 0;
       Lista37[] lista = new Lista37[2];

       for(int i = 0; i < lista.length; i++){
        lista[i] = new Lista37();
        System.out.println("Informe o nome do jogador ");
        lista[i].NomeJogador = sc.next();
        System.out.println("Informe se Par ou Ímpar");
        lista[i].tipo = sc.next();
        System.out.println("Informe o número do jogador ");
        lista[i].num = sc.nextInt();
       }
       sc.close();

        for(int i = 0; i < lista.length; i++){
            soma += lista[i].num; 
        }

        if(soma%2 == 0){
            for(int i=0; i<lista.length; i++){
                if (lista[i].tipo.equalsIgnoreCase("par")){
                    System.out.println(lista[i].NomeJogador);
                }
            }
        }



    }
}