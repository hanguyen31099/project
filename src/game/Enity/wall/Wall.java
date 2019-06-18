package game.Enity.wall;

import game.GameObject;
import game.Settings;
import game.player.items.ItemSummer;
import tklibs.Mathx;

public class Wall extends GameObject {
    public Wall() {
        key = "Wall";
        GameObject.addToHashMap(key,this);
        GameObject.addToHashMap(WallName,this);
    }
    @Override
    public void deactive() {
        super.deactive();
        int x = Mathx.random(1, Settings.Index*4);
        if(x%15==0){
            ItemSummer.CanItem = true;
            ItemSummer.ItemPosition(this.position);
        }
    }
}
