package Pokemon;

import java.util.Objects;
import java.util.Scanner;

public class Pokemon {
    public String nome;
    public String gen;
    public String tipoPrimario;
    public boolean subTipo;
    public String tipoSecundario;
    Scanner sc = new Scanner(System.in);
    boolean flag2 = false;
    public void adicionaPokemon() {


        Pokemon PN = new Pokemon();
        System.out.print("Nome do pokemon: ");
        sc.nextLine();
        PN.nome = sc.nextLine();

        while(!flag2) {
            System.out.println("Digite o genero (M para macho e F para femea): ");
            gen = sc.nextLine();
            if (Objects.equals(gen, "M")) {
                flag2 = true;
            } else if (Objects.equals(gen, "F")) {
                flag2 = true;
            } else {
                System.out.println("Genero inválido, escreva novamente.");
            }
        }

        System.out.print("Tipo do pokemon: ");
        PN.tipoPrimario = sc.nextLine();

        System.out.print("Possui tipo secundario ? - true para sim ou false para nao: ");
        PN.subTipo = sc.nextBoolean();

        if (PN.subTipo) {
            System.out.print("Escreva o segundo tipo do pokemon:");
            sc.nextLine();
            PN.tipoSecundario = sc.nextLine();
        } else {
            PN.tipoSecundario = "Nao possui";
        }
        return ;
    }
}
