import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args){

      MenuIMC();

    }



    public static void MenuIMC(){

        int DecisaoDoUsuario = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Voce deseja calcular o IMC?\n1: SIM\n2: NÃO");


            DecisaoDoUsuario = sc.nextInt();

            if (DecisaoDoUsuario == 1) {
                CalculoIMC();
            }
            else if (DecisaoDoUsuario != 2) {
                DecisaoDoUsuario = 1;
                System.out.println("Voce digitou uma opção invalida.\n\n");
                continue;
            }
        } while (DecisaoDoUsuario == 1);
        sc.close();
    }




    public static void CalculoIMC(){

        System.out.println("Bem-vindo(a) ao calculo de IMC.\n\n");
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("A qualquer momento digite 0  ou um numero negativo para sair.\n\nDigite seu peso:");
            double peso = sc.nextDouble();

            if (peso <= 0){
                break;
            }

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

            if (altura <= 0){
                break;
            }

            double IMC = peso / (altura * altura);
            System.out.println("Seu IMC é: " + IMC);
        }
//        sc.close();
        System.out.println("voce saiu.");


    }

    public static void forCresente() {

        System.out.println("digite o numero maximo para ser contado de zero ate ele -1.");

        Scanner sc = new Scanner(System.in);
        int numeromaximo = sc.nextInt();

        sc.close();

        if (numeromaximo > 0) {
            System.out.println("FOR CRESENTE:\n");
            for (int n1 = 0; n1 < numeromaximo; n1++) {
                System.out.println("O contador esta em: " + n1);
            }
            System.out.println();
        } else {
            System.out.println("Voce digitou um numero menor do que 1, NAO PODE");
        }
    }


    public static void forDecresente(){

        System.out.println("Digite o numero inicial para ser contado ate um.");

        Scanner sc = new Scanner(System.in);
        int numeroInicial = sc.nextInt();

        sc.close();

        if (numeroInicial > 0){

            System.out.println("FOR DECRESENTE:\n");
            for (int n1 = numeroInicial; n1 > 0; n1--){
                System.out.println("O contador esta em: " + n1);
            }
            System.out.println();
        } else {
            System.out.println("você digitou um numero menor do que 1, NÃO PODE" );
        }
    }

}







