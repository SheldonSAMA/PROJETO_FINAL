package Pokeball;

public class ultraBall extends Pokebola{
    public ultraBall(int quantidade){
        super(quantidade);
    }
    @Override
    public void bolsa() {
        System.out.println("Voce possui "+super.quantidade+" ultra balls.");
    }
}

