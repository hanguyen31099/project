package game.Enity.bird;

import game.Enity.round.Player1Win;
import game.Enity.round.Player2Win;
import game.GameObject;
import game.renderer.Renderer;

public class Bird2 extends Bird {
    public Bird2(){
        renderer = new Renderer("assets/images/brid/bird-down.png");
    }

    @Override
    public void deactive() {
        super.deactive();
        Player2Win player2Win = GameObject.recycle("Player2Win",Player2Win.class);
    }
}
