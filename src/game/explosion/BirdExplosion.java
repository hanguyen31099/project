package game.explosion;

import game.GameObject;
import game.renderer.Renderer;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

public class BirdExplosion extends GameObject {
    public BirdExplosion(){
        key = "BirdExplosion";
        renderer = new Renderer("assets/images/Explosion/TankExplosion",true);
        GameObject.addToHashMap(key,this);
        Clip birdExplosion = AudioUtils.loadSound("assets/sound/EnemyExplosion.wav");
        AudioUtils.replay(birdExplosion);

    }
}
