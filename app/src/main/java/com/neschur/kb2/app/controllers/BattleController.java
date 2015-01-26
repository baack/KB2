package com.neschur.kb2.app.controllers;

import com.neschur.kb2.app.entities.Fighting;
import com.neschur.kb2.app.models.BattleField;
import com.neschur.kb2.app.models.Player;

public class BattleController {
    private BattleField battleField;
//    private Player player;
//    private Fighting fighting;

    public BattleController(Player player, Fighting fighting) {
//        this.player = player;
//        this.fighting = fighting;
        this.battleField = new BattleField(player, fighting);
    }

    public int[][] getIdsField() {
        int[][] map = new int[6][5];
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 5; y++) {
                map[x][y] = battleField.getMapPoint(x, y).getDrawable();
            }
        }
        return map;
    }

//    public MapPoint[][] getMap() {
//        return battleField.getMapPoint();
//    }
}
