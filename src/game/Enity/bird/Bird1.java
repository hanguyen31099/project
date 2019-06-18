package game.Enity.bird;

import game.Enity.round.Player1Win;
import game.Enity.round.Player2Win;
import game.GameObject;
import game.renderer.Renderer;

public class Bird1 extends Bird {
    public Bird1(){
        renderer = new Renderer("assets/images/brid/bird.png");
    }

    @Override
    public void deactive() {
        super.deactive();
        Player1Win player1Win = GameObject.recycle("Player1Win",Player1Win.class);
    }
}
