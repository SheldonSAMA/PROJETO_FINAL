package Treinador;

import Pokemon.Pokemon;

public class Treinador {
    private String nickname;
    public String gen;
    Pokemon principal[];

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Treinador(){

        principal = new Pokemon[10];
    }
    boolean flagg = true;
    public void adicionarPokemon(Pokemon principal) {

        for (int i = 0; i < this.principal.length + 1; i++) {

            if (this.principal[i] == null && flagg == true) {
                this.principal[i] = principal;
                System.out.println("Pokemon adicionado");
                flagg = true;
                return;
            }
        }
        flagg = false;
        for (int i = 0; i < this.principal.length; i++) {

            if (this.principal[i] != null && flagg == false) {
                System.out.println("Cheio");
                return;
            }
        }
    }

        public void mostraInformacao() {
            System.out.println("Nome do treinador: " + getNickname());
            System.out.println("Genero: " + gen);
            for (int i = 0; i < principal.length; i++) {
                if (principal[i] != null) {
                    System.out.println("Posicao: " + i);
                    System.out.println("Nome do pokemon: " + principal[i].nome);
                    System.out.println("Genero: " + principal[i].gen);
                    System.out.println("Tipo primario: " + principal[i].tipoPrimario);
                    System.out.println("Tipo secundario: " + principal[i].tipoSecundario);
                }

            }
        }

}


