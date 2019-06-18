package game.scene;

import game.GameObject;
import game.KeyEventPress;
import game.Settings;
import game.renderer.Renderer;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;

public class BackGroundEndGame extends GameObject {
    Clip music;

    public BackGroundEndGame(){
        key = "BackgroundEndGame";
        renderer = new Renderer("assets/images/Background/BackGround-EndGame.png");
        position.set(Settings.GAME_WIDTH/2,Settings.GAME_HEIGHT/2);
        GameObject.addToHashMap(key,this);
        music = AudioUtils.loadSound("assets/sound/gameover.wav");
        AudioUtils.replay(music);

    }

//    @Override
//    public void run() {
//        if(KeyEventPress.isKeyPress){
//            SceneManager.signNewScene(new SceneStage1());
//        }
//    }
}
