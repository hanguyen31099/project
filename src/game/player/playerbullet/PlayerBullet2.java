package game.player.playerbullet;

import game.GameObject;
import game.player.Player1;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

public class PlayerBullet2 extends PlayerBullet {
    public PlayerBullet2(){
        this.damage = 3;
    }
    @Override
    public void run() {
        super.run();
        this.CheckPlayer1();
    }

    private void CheckPlayer1() {
        Player1 player1 = GameObject.findInterSects("Player1",this.hitBox,Player1.class,this);

        if(player1!=null){
            Clip fireToPlayerSound = AudioUtils.loadSound("assets/sound/BulletHitToEnemy.wav");
            AudioUtils.replay(fireToPlayerSound);
            player1.TakeDame(this.damage);
            this.deactive();
        }
    }
}
