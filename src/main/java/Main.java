import java.util.Objects;
import java.util.Scanner;

import Pokeball.Pokebola;
import Pokeball.greatBall;
import Pokeball.ultraBall;
import Pokemon.Pokemon;
import Treinador.Treinador;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int escolha=0;
        boolean flag1 = false;
        Treinador principal = new Treinador();
        System.out.println("Digite seu nome de treinador: ");
        principal.setNickname(sc.nextLine());
        while(!flag1) {
            System.out.println("Digite seu genero (M para masculino e F para feminino): ");
            principal.gen = sc.nextLine();
            if (Objects.equals(principal.gen, "M")) {
                flag1 = true;
            } else if (Objects.equals(principal.gen, "F")) {
                flag1 = true;
            } else {
                System.out.println("Genero invalido, escreva novamente.");
            }
        }

        while(escolha!=10){
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Pokemon");
            System.out.println("2 - Dados do treinador e pokedex");
            System.out.println("3 - Pokebolas");
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
                        System.out.println("Genero invalido, adicione novamente.");
                        break;
                    }

                    System.out.print("Tipo do pokemon: ");
                    PN.tipoPrimario = sc.nextLine();

                    System.out.print("Possui tipo secundario ? - true para sim ou false para nao: ");
                    PN.subTipo= sc.nextBoolean();

                    if (PN.subTipo){
                        System.out.print("Escreva o segundo tipo do pokemon:");
                        sc.nextLine();
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
                    System.out.print("Escreva quantidade de pokebolas comuns:");
                    int P;
                    P = sc.nextInt();
                    Pokebola pok= new Pokebola(P);
                    System.out.print("Escreva quantidade de pokebolas great:");
                    int G;
                    G = sc.nextInt();
                    greatBall pok1= new greatBall(G);
                    System.out.print("Escreva quantidade de pokebolas ultra:");
                    int U;
                    U = sc.nextInt();
                    ultraBall pok2= new ultraBall(U);
                    pok.bolsa();
                    pok1.bolsa();
                    pok2.bolsa();
                    break;
                case 10:
                    break;
            }

        }

    }

}
