package com.deeep.mblobber.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by E on 12/6/2014.
 */
public class Entity {
    public float x, y;

    public Entity() {
        x = 0;
        y = 0;
    }

    public Entity(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void update(float deltaT) {
    }

    public void draw(SpriteBatch spriteBatch) {

    }

}
