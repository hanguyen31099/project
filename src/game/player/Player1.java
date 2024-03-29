package game.player;

import game.GameObject;
import game.KeyEventPress;
import game.Physics.BoxCollider;
import game.Settings;
import game.player.playerbullet.PlayerBullet1;
import game.renderer.player.Player1Render;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

public class Player1 extends Player {
    public int hp;
    public Player1(){
        key = "Player1";
        Find = "Player2";
        this.renderer = new Player1Render(this);
        hitBox = new BoxCollider(this,Settings.PLAYER_WIDTH,Settings.PLAYER_HEIGHT);
        dame = 3;
        GameObject.addToHashMap(key,this);
    }
    int count = 0; // dem so khung hinh

    @Override
    public void run() {
        if(Settings.ISRUN){
            super.run();
            this.move();
            this.fire();
        }
    }

    private void fire() {
        count++;
        if(KeyEventPress.isPlayer1FirePress&&((count>= 30||isFrist))){
            isFrist = false;
            count = 0;
            PlayerBullet1 bullet = GameObject.recycle("PlayerBullet1",PlayerBullet1.class);
            bullet.isresus = true;
            Clip fireSound = AudioUtils.loadSound("assets/sound/PlayerFire.wav");
            AudioUtils.replay(fireSound);
            //bullet.Find = "Player2";
            if(isGoing=="Up"){
                bullet.velocity.set(0,-5);
                bullet.position.set(this.position.x,this.position.y);
            }
            if(isGoing=="Down"){
                bullet.velocity.set(0,5);
                bullet.position.set(this.position.x,this.position.y);
            }
            if(isGoing=="Left"){
                bullet.velocity.set(-5,0);
                bullet.position.set(this.position.x,this.position.y);
            }
            if(isGoing=="Right"){
                bullet.velocity.set(5,0);
                bullet.position.set(this.position.x,this.position.y);
            }
        }
    }

    private void move() {
        if(KeyEventPress.isPlayer1UpPress) {
            Go.set(0,-2);
            isGoing = "Up";
        }
        if(KeyEventPress.isPlayer1DownPress) {
            Go.set(0,2);
            isGoing = "Down";
        }
        if(KeyEventPress.isPlayer1LeftPress) {
            Go.set(-2,0);
            isGoing = "Left";
        }
        if(KeyEventPress.isPlayer1RightPress) {
            Go.set(2,0);
            isGoing = "Right";
        }
    }

    @Override
    public void deactive() {
        super.deactive();
        Settings.Player1active =  false;
    }
}
