package game.scene;

import game.GameObject;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;
import java.util.Scanner;

public class SceneEnd extends Scene {
    @Override
    public void init() {
        GameObject.recycle("BackGroundEndGame",BackGroundEndGame.class);
        Clip music = AudioUtils.loadSound("assets/sound/gameover.wav");
        AudioUtils.replay(music);
    }

    @Override
    public void clear() {
        GameObject.ClearAll();
    }
}
