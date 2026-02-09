import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args){

        System.out.println("se voce deseja ver o for cresente digite 1, se deseja ver o decresente digite 2...");

        Scanner sc = new Scanner(System.in);

        int decisao = sc.nextInt();

        if (decisao == 1){
            forCresente();
        } else if (decisao == 2){
            forDecresente();
        } else {
            System.out.println("Decisão invalida");
        }



    }

    public static void forCresente(){

        System.out.println("digite o numero maximo para ser contado de zero ate ele -1.");

       Scanner sc = new Scanner(System.in);
       int numeromaximo = sc.nextInt();

       sc.close();

        System.out.println("FOR CRESENTE:\n");
        for (int n1 = 0; n1 < numeromaximo; n1++){
            System.out.println("O contador esta em: " + n1);
            }
            System.out.println();
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


    }



