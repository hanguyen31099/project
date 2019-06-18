package game.scene.sceenIntro;

import game.GameObject;
import game.Settings;
import game.renderer.Renderer;
import game.scene.SceneManager;
import game.scene.sceenstage.SceneStage1;

public class Information extends GameObject {
    public Information(){
        key = "Information";
        renderer = new Renderer("assets/images/Background/Background-intro.png");
        position.set(Settings.GAME_WIDTH/2,Settings.GAME_HEIGHT/2);
        GameObject.addToHashMap(key,this);
    }
    int dem = 0;
    @Override
    public void run() {
        dem++;
        if(dem>=300){
            SceneManager.signNewScene(new SceneStage1());
        }
    }
}
