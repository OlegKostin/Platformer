package ru.olegkostin.game.screens.transitions;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by OlegK on 08.01.2017.
 */

public interface ScreenTransition {
    public float getDuration ();
    public void render (SpriteBatch batch, Texture currScreen,
                        Texture nextScreen, float alpha);
}
