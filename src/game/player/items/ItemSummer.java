package game.player.items;

import game.GameObject;
import game.Settings;
import game.Vector2D;
import tklibs.Mathx;

public class ItemSummer extends GameObject {
    public static boolean CanItem = true;
    public static boolean CanbornItem = true;
    public ItemSummer() {
        key = "ItemSummer";
        GameObject.addToHashMap(key,this);
    }
    public static void ItemPosition(Vector2D position){
        if(CanbornItem){
            CanbornItem = false;
            int itemType = Mathx.random(1, 2);
            switch (itemType) {
                case 1: {
                    ItemHp item = GameObject.recycle("ItemHp", ItemHp.class);
                    item.position.set(position);
                    break;
                }
                case 2: {
                    ItemShield item = GameObject.recycle("ItemShield", ItemShield.class);
                    item.position.set(position);
                    break;
                }
            }
        }
    }
    int count = 0;
    @Override
    public void run() {
        super.run();
        if(CanItem) count++;
        summorItem();
    }
    private void summorItem() {
        if (count > 100) {
            CanItem = false;
            CanbornItem = true;
            count = 0;
        }
        if(count>300){
            RandomItem();
        }
    }

    private static void RandomItem() {
        Vector2D random = new Vector2D();
        random.set(Mathx.random(12, Settings.GAME_WIDTH-50), Mathx.random(12, Settings.GAME_HEIGHT-50));
        ItemSummer.ItemPosition(random);
    }
}
