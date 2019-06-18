package game.Enity.bird;

import game.GameObject;
import game.Physics.BoxCollider;
import game.Settings;
import game.explosion.BirdExplosion;
import game.player.PlayerSummer;
import game.renderer.Renderer;
import game.scene.SceneEnd;
import game.scene.SceneManager;

public class Bird extends GameObject {
    public Bird(){
        key = "Bird";
        hitBox = new BoxCollider(this,45,45);
        GameObject.addToHashMap(key,this);
    }

    @Override
    public void deactive() {
        super.deactive();
        PlayerSummer.CanRun = false ;
        Settings.ISRUN = false;
    }
}
