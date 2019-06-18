package game.explosion;

import game.GameObject;
import game.Settings;
import game.renderer.Renderer;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

public class Explosion extends GameObject {
    Clip explosionSound;

    public Explosion() {
        key ="Explosion";
        renderer = new Renderer("assets/images/Explosion/explosion", true);
        GameObject.addToHashMap(key,this);

    }
}
