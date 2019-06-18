package game.explosion;

import game.GameObject;
import game.renderer.Renderer;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

public class BulletExplosion extends GameObject {
    public BulletExplosion() {
        key = "BulletExplosion";
        renderer = new Renderer("assets/images/Explosion/TankExplosion", true);
        GameObject.addToHashMap(key, this);
//        Clip bulletSound = AudioUtils.loadSound("assets/sound/EnemyExplosion.wav");
//        AudioUtils.replay(bulletSound);
    }
}

