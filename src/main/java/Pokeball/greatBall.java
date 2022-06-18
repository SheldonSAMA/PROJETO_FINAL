package Pokeball;

public class greatBall extends Pokebola {
    public greatBall(int quantidade) {
        super(quantidade);
    }

    @Override
    public void bolsa() {
        System.out.println("Voce possui "+super.quantidade+" great balls.");
    }
}
