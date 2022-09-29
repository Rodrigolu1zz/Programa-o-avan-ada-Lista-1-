import java.util.Scanner;

public class Lista44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];        

        double maior=0, menor, diferenca, totalImpares=0, mediaImpares=0, maiorPar=0, cont=0;

        System.out.println("Informe cinco valores");
        for(int i=0; i<vet.length; i++){
            vet[i] = sc.nextDouble();
        }
        sc.close();
       menor = vet[0];

        for(int i=0; i<vet.length; i++){
            if(i==0){
                maior = vet[i];
                menor = vet[i];
            }else{
                if((vet[i] > maior)){
                    maior = vet[i];
                }
                if(vet[i]<menor){
                    menor = vet[i];
                }
            }
        }
        diferenca = (maior - menor);

        for(int i=0; i<vet.length; i++){
            if(vet[i]%2==0){
                if((vet[i] > maiorPar)){
                    maiorPar = vet[i];
                }
            }
            if(vet[i]%2!=0){
                totalImpares += vet[i];
                cont++;
            }
        }
        mediaImpares = totalImpares/cont;

        System.out.println("Media de Ímpares = "+mediaImpares);
        System.out.println("Maior número Par = "+maiorPar);
        System.out.println("Diferença = "+diferenca);
    }
}
