package game.player.items;

import game.GameObject;
import game.renderer.Renderer;

public class ItemShield extends Item {
    public ItemShield(){
        key1 = "ItemShield";
        renderer = new Renderer("assets/images/Items/Shield.png");
        GameObject.addToHashMap(key1,this);
    }
}
