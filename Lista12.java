import java.util.Scanner;

public class Lista12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String reino = "", tipo = "", alimentacao = "", animal = " ";

        System.out.println("Informe se é vertebrado ou invertebrado:");
        reino = sc.nextLine();
        System.out.println("Informe se é mamífero, ave, inseto ou anelídeo: ");
        tipo = sc.nextLine();
        System.out.println("Informe o habito alimentar: Se é: carnívoro, onívoro, herbívoro, hematofago ou onívoro. ");
        alimentacao = sc.nextLine();
        sc.close();

        char ch = reino.charAt(0);
        switch (ch){
            case 'v':
                if((tipo.equalsIgnoreCase("mamífero"))|| (tipo.equalsIgnoreCase("mamifero"))){
                    if((alimentacao.equalsIgnoreCase("onivoro") )||(alimentacao.equalsIgnoreCase("onívoro"))){
                        animal = "Homem";
                        System.out.println(animal);
                    }else if(alimentacao.equalsIgnoreCase("herbivoro")|| alimentacao.equalsIgnoreCase("herbívoro")){
                        animal = "Vaca";
                        System.out.println(animal);
                    }
                }else if(tipo.equalsIgnoreCase("ave")){
                    if((alimentacao.equalsIgnoreCase("carnívoro"))||( alimentacao.equalsIgnoreCase("carnivoro"))){
                        System.out.println("Águia");
                    }else if((alimentacao.equalsIgnoreCase("onivoro"))||( alimentacao.equalsIgnoreCase("onívoro"))){
                        System.out.println("Pomba");
                    }
                }
            break;
            case 'i':
            if(tipo.equalsIgnoreCase("inseto")){
                if(alimentacao.equalsIgnoreCase("hematofago")){
                    System.out.println("Pulga");
                }else if(alimentacao.equalsIgnoreCase("herbivoro") || alimentacao.equalsIgnoreCase("herbívoro")){
                    System.out.println("Largata");
                }
            }else if(tipo.equalsIgnoreCase("anelídeo") || tipo.equalsIgnoreCase("anelideo")){
                if(alimentacao == "hematofago"){
                    System.out.println("Sanguessuga");
                }else if(alimentacao.equalsIgnoreCase("onivoro") || alimentacao.equalsIgnoreCase("onívoro")){
                    System.out.println("Minhoca");
                }
            }
                break;
            default:
            System.out.println("Escolha um opção válida.");
        }
    }
}