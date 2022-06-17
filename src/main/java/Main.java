import java.util.Objects;
import java.util.Scanner;

import Pokemon.Pokemon;
import Treinador.Treinador;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int escolha=0;
        int escolheCarro;
        String nome;
        String gen;
        String tipoPrimario;
        boolean subTipo;
        Treinador principal = new Treinador();
        System.out.println("Digite seu nome de treinador: ");
        principal.nome = sc.nextLine();
        System.out.println("Digite seu genero (M para masculino e F para feminino): ");
        principal.gen = sc.nextLine();

        while(escolha!=10){
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Pokemon");
            System.out.println("2 - Pokedex");
            System.out.println("3 - :");
            System.out.println("10 - Sair");
            System.out.println("-----------------------------------");
            escolha = sc.nextInt();

            switch (escolha){

                case 1:

                    Pokemon PN = new Pokemon();
                    System.out.print("Nome do pokemon: ");
                    sc.nextLine();
                    PN.nome = sc.nextLine();

                    System.out.print("Genero do pokemon (M para macho e F para femea): ");
                    PN.gen = sc.nextLine();
                    if (Objects.equals(PN.gen, "M")){
                        PN.gen = "Macho";
                    } else if (Objects.equals(PN.gen, "F")) {
                        PN.gen = "Femea";
                    } else {
                        System.out.println("Genero inválido, adicione novamente.");
                        break;
                    }

                    System.out.print("Tipo do pokemon: ");
                    PN.tipoPrimario = sc.nextLine();

                    System.out.print("Possui tipo secundario ? - true para sim ou false para nao: ");
                    PN.subTipo= sc.nextBoolean();

                    if (PN.subTipo){
                        System.out.print("Escreva o segundo tipo do pokemon:");
                        PN.tipoSecundario = sc.nextLine();
                    }else {
                        PN.tipoSecundario = "Nao possui";
                    }

                    principal.adicionarPokemon(PN);

                    break;

                case 2:
                    principal.mostraInformacao();
                    break;

                case 3:
                    break;
                case 10:
                    break;


            }

        }

    }

}
