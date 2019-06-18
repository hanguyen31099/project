package game.Enity.round;

import game.GameObject;
import game.renderer.Renderer;

public class Player2Win extends Round {
    public Player2Win(){
        key = "Player2Win";
        renderer = new Renderer("assets/images/Background/round/round1/Player2Win.png");
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
