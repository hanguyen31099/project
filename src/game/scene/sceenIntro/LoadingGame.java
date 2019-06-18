package game.scene.sceenIntro;

import game.GameObject;
import game.KeyEventPress;
import game.Settings;
import game.renderer.Renderer;

public class LoadingGame extends GameObject {
    public LoadingGame(){
        key = "LoadingGame";
        renderer = new Renderer("assets/images/Background/loading");
        position.set(Settings.GAME_WIDTH/2,Settings.GAME_HEIGHT/2);
        GameObject.addToHashMap(key,this);
    }
}
