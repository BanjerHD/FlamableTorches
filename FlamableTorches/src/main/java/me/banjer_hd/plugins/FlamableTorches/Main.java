package me.banjer_hd.plugins.FlamableTorches;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new onPlace(), this);
	}
	
}
