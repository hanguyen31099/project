package game.scene.sceenIntro;

import game.GameObject;
import game.scene.Scene;

public class Introduce extends Scene {
    @Override
    public void init() {
        GameObject.recycle("Information",Information.class);
        GameObject.recycle("LoadingGame", LoadingGame.class);
    }

    @Override
    public void clear() {
        GameObject.ClearAll();
    }
}
