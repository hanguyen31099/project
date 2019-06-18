package game.player.items;

import game.GameObject;
import game.renderer.Renderer;

public class ItemHp extends Item {
    public ItemHp(){
        key1 = "ItemHp";
        renderer = new Renderer("assets/images/Items/Hp.png");
        GameObject.addToHashMap(key1,this);
    }

}
