package com.trolltech.games.model;

/**
 * Created by jbouvard on 13/04/2017.
 */
public class WorldCoordinates {

    public WorldCoordinates(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    private int x;
    private int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
}
