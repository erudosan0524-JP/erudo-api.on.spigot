package com.github.jp.erudo.erudoapi;

import com.github.jp.erudo.erudoapi.event.listeners.OnInteract;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    protected static String plugin_name = Main.class.getPackage().getImplementationTitle();
    protected static String plugin_version = Main.class.getPackage().getImplementationVersion();


    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        getLogger().info(Main.plugin_name  + "is Enabled");

        //Listeners
        new OnInteract(this);
    }
}
