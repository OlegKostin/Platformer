package ru.olegkostin.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

import ru.olegkostin.PlatformerTest;


public class DesktopLauncher {
    private static boolean rebuildAtlas = false;
    private static boolean drawDebugOutline = false;


    public static void main (String[] arg) {
        if(rebuildAtlas){
            Settings settings = new Settings();
            settings.maxWidth = 1024;
            settings.maxHeight = 1024;
            settings.duplicatePadding = false;
            settings.debug = drawDebugOutline;
      TexturePacker.process(settings, "assets-raw/images", "images", "canyonbunny.pack");
            TexturePacker.process(settings, "assets-raw/images-ui",
                    "images",
                    "canyonbunny-ui.pack");

        }

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width= 800;
		config.height = 480;
		new LwjglApplication(new PlatformerTest(), config);
	}
}
