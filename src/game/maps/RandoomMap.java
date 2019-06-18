package game.maps;

import tklibs.Mathx;

public class RandoomMap {

    public static String Random() {
        int random = Mathx.random(1, 3);
        switch (random) {
            case 1:
                return "assets/images/Map/map1/map.json";
            case 2:
                return "assets/images/Map/map2/map.json";
            case 3:
                return "assets/images/Map/map3/map.json";
        }
        return null;
    }
}
