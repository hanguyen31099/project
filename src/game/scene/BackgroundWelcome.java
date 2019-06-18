package game.scene;

import game.GameObject;
import game.KeyEventPress;
import game.Settings;
import game.renderer.Renderer;
import game.scene.sceenIntro.Introduce;

public class BackgroundWelcome extends GameObject {
    public BackgroundWelcome(){
        key = "BackgroundWelcome";
        renderer = new Renderer("assets/images/Background/Background-begin.png");
       // renderer = new Renderer("assets/images/Background/Background-intro.png");
        position.set(Settings.GAME_WIDTH/2,Settings.GAME_HEIGHT/2);
        GameObject.addToHashMap(key,this);
    }

    @Override
    public void run() {
        if(KeyEventPress.isKeyPress){
         //   SceneManager.signNewScene(new SceneStage1());
            SceneManager.signNewScene(new Introduce());
        }
    }
}
