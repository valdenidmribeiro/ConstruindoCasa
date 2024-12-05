package ConstruindoCasa;

import java.util.Scanner;

public class Casa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Criando objeto casa
        PlantaCasa casa = new PlantaCasa();

//        Iniciando os atributos(variaveis)
        System.out.print("Entre com o numero de banheiros: ");
        casa.numeroBanheiros = sc.nextInt();
        System.out.print("Entre com o numero de quartos: ");
        casa.numeroQuartos = sc.nextInt();
        System.out.print("Qual o material sera usado: ");
        casa.material = sc.next();
        System.out.print("Qual a metragem da casa: ");
        casa.metragem = sc.nextInt();
        System.out.print("Qual a cor da casa: ");
        casa.cor = sc.next();

        System.out.println("\nConstruindo casa: ");
        casa.construir();
        System.out.println("\nPintando a casa: ");
        casa.pintar();

        sc.close();
    }
}
