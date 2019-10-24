package me.banjer_hd.plugins.FlamableTorches;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class onPlace implements Listener {
	
	@EventHandler
	public void onJoin(BlockPlaceEvent e) {
		
		if(e.getBlockPlaced().getType().equals(Material.TORCH) || e.getBlockPlaced().getType().equals(Material.WALL_TORCH)) {
			
			if(e.getBlockPlaced().getRelative(BlockFace.UP).getType() != Material.AIR && e.getBlockPlaced().getRelative(BlockFace.UP).getType().isBurnable()) {
				
				if(e.getBlockPlaced().getRelative(BlockFace.UP, 2).getType() == Material.AIR) {
					e.getBlockPlaced().getRelative(BlockFace.UP, 2).setType(Material.FIRE);
				}else if(e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getType() == Material.AIR) {
					e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).setType(Material.FIRE);
				} else if(e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getType() == Material.AIR) {
					e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.EAST).setType(Material.FIRE);
				} else if(e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getType() == Material.AIR) {
					e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).setType(Material.FIRE);
				} else if(e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getType() == Material.AIR) {
					e.getBlockPlaced().getRelative(BlockFace.UP).getRelative(BlockFace.WEST).setType(Material.FIRE);
				} else {
					e.getBlockPlaced().setType(Material.FIRE);
				}
				
				e.getBlockPlaced().getWorld().spawnParticle(Particle.LAVA, e.getBlockPlaced().getLocation(), 10);
				
				
			}
			
		}	
			
	}
			
}