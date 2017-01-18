package ru.olegkostin;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;

import ru.olegkostin.game.Assets;
import ru.olegkostin.game.screens.DirectedGame;
import ru.olegkostin.game.screens.MenuScreen;
import ru.olegkostin.util.AudioManager;
import ru.olegkostin.util.GamePreferences;

public class PlatformerTest extends DirectedGame {
    @Override
    public void create () {
// Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
// Load assets
        Assets.instance.init(new AssetManager());
        // Load preferences for audio settings and start playing music
        GamePreferences.instance.load();
        AudioManager.instance.play(Assets.instance.music.song01);
// Start game at menu screen
        setScreen(new MenuScreen(this));
    }
}