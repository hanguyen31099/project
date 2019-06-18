package game.scene.sceenstage;

import game.Enity.round.Round;
import game.Enity.round.Round1;
import game.GameObject;
import game.maps.Map;
import game.maps.RandoomMap;
import game.player.PlayerSummer;
import game.player.items.ItemSummer;
import game.scene.Scene;

public class SceneStage1 extends Scene {
    @Override
    public void init() {
        PlayerSummer playerSummer = GameObject.recycle("PlayerSummer", PlayerSummer.class);
        Map map = Map.load(RandoomMap.Random());
        map.generate();
        Round1 round = GameObject.recycle("Round",Round1.class);
        ItemSummer Item = GameObject.recycle("ItemSummer",ItemSummer.class);
//        Clip music = AudioUtils.loadSound("assets/sound/Vessence-Ivory.wav");
//        AudioUtils.replay(music);
    }

    @Override
    public void clear() {
        GameObject.ClearAll();
    }
}
