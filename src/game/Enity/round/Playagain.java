package game.Enity.round;

import game.GameObject;
import game.KeyEventPress;
import game.Settings;
import game.player.PlayerSummer;
import game.renderer.Renderer;
import game.scene.Scene;
import game.scene.SceneManager;
import game.scene.sceenIntro.Introduce;
import game.scene.sceenstage.SceneStage1;

import java.awt.event.KeyEvent;

public class Playagain extends Round {
    public Playagain(){
        key = "Playagain";
        this.position.set(Settings.GAME_WIDTH/2,Settings.GAME_HEIGHT);
        renderer = new Renderer("assets/images/Background/text play again");
        GameObject.addToHashMap(key,this);
    }

    @Override
    public void run() {
        super.run();
        if(KeyEventPress.isKeyPress) this.deactive();
    }

    @Override
    public void deactive() {
        if(KeyEventPress.isKeyPress){
            Settings.ISRUN = true;
            PlayerSummer.CanRun = true;
            SceneManager.signNewScene(new Introduce());
        }
    }
}
