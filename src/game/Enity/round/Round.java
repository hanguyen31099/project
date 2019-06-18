package game.Enity.round;

import game.GameObject;
import game.Settings;
import game.player.PlayerSummer;
import game.renderer.Renderer;

public class Round extends GameObject {
    public boolean isOnce = true;
    public Round(){
        key = "Round";
//        renderer = new Renderer("assets/images/Background/round-1.png");
        this.position.set(Settings.GAME_WIDTH/2,1000);
        GameObject.addToHashMap(key,this);
    }
    int count = 0;
    @Override
    public void run() {
        if(this.position.y>= Settings.GAME_HEIGHT/3){
            this.position.y-=10;
        }
        if(this.position.y<=Settings.GAME_HEIGHT/3){
            count++;
        }
        if(count>=25){
            count = 0;
            this.deactive();
        }
    }

    @Override
    public void deactive() {
        super.deactive();
        Settings.ISRUN = true;
        PlayerSummer.CanRun = true;
    }
}
