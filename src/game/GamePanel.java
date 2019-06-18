package game;
import game.scene.SceneManager;
import game.scene.SceneWelcome;
import tklibs.AudioUtils;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Clip themeSound;
    public GamePanel() {
        SceneManager.signNewScene(new SceneWelcome());
        themeSound = AudioUtils.loadSound("assets/sound/theme.wav");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i=0;i<GameObject.objects.size();i++){
            GameObject object = GameObject.objects.get(i);
             if(object.active&&object.key!="Item") {
                 object.render(g);
             }
        }
        if(GameObject.hashMaparr.get("Item")!=null){
            for(int i=0;i<GameObject.hashMaparr.get("Item").size();i++){
                if(GameObject.hashMaparr.get("Item").get(i)!=null){
                    GameObject object = GameObject.objects.get(GameObject.hashMaparr.get("Item").get(i).Index);
                    // object ~ cls
                    if(object.active){
                        object.render(g);
                    }
                }
            }
        }

    }

    public void gameLoop() {
        long lastTime = 0;
        while (true) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTime > 1000 / 60) {
                // run logic
                this.runAll();
                // render
                this.repaint();
                lastTime = currentTime;
            }
        }
    }

    public void runAll() {
        for(int i=0;i<GameObject.objects.size();i++){
            GameObject object = GameObject.objects.get(i);
            if(object.active){
                AudioUtils.loopForever(themeSound);
                object.run();
            }
        }
    }
}
