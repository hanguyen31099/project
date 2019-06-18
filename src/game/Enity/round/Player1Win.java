package game.Enity.round;

import game.GameObject;
import game.player.Player;
import game.renderer.Renderer;

public class Player1Win extends Round {
    public Player1Win(){
        key = "Player1Win";
        renderer = new Renderer("assets/images/Background/round/round1/Player1Win.png");
        GameObject.addToHashMap(key,this);
    }

    @Override
    public void deactive() {
        if(isOnce){
            isOnce = false;
            Playagain playagain = GameObject.recycle("Playagain",Playagain.class);
        }
    }
}
