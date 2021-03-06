package ru.olegkostin.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.olegkostin.game.AbstractGameObject;
import ru.olegkostin.game.Assets;

/**
 * Created by OlegK on 19.12.2016.
 */

public class Feather extends AbstractGameObject {
    private TextureRegion regFeather;
    public boolean collected;
    public Feather () {
        init();
    }
    private void init () {
        dimension.set(0.5f, 0.5f);
        regFeather = Assets.instance.feather.feather;
// Set bounding box for collision detection
        bounds.set(0, 0, dimension.x, dimension.y);
        collected = false;
    }
    @Override
    public void render(SpriteBatch batch) {
        if (collected) return;
        TextureRegion reg = null;
        reg = regFeather;
        batch.draw(reg.getTexture(), position.x, position.y,
                origin.x, origin.y, dimension.x, dimension.y, scale.x, scale.y,
                rotation, reg.getRegionX(), reg.getRegionY(),
                reg.getRegionWidth(), reg.getRegionHeight(), false, false);
    }
    public int getScore() {
        return 250;
    }
}
