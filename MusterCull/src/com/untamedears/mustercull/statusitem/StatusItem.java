package com.untamedears.mustercull.statusitem;

import java.util.List;

import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Item;

/**
 * Stores information about players and surrounding mobs for status checks.
 * @author Celdecea
 *
 */
public class StatusItem {
	
	
	/**
	 * The entity which we are providing status information for.
	 */
	private HumanEntity entity = null;
	
	
	/**
	 * The number of surrounding entities for this player
	 */
	private int nearbyEntityCount = 0;
	
	/**
	 * The number of items surrounding for this player
	 */
	private int nearbyItemCount = 0;
	
	/**
	 * Constructor which sets the entity
	 */
	public StatusItem(HumanEntity entity) {
		this.entity = entity;
		
		if (this.entity != null) {
			List<Entity> entities = entity.getNearbyEntities(48, 256, 48);
			this.nearbyEntityCount = entities.size();
			for (Entity e: entities)
				if (e instanceof Item)
					nearbyItemCount++;
		}
	}
	
	
	/**
	 * Returns the Bukkit entity for which this object provides status for.
	 * @return The bukkit entity for which this object provides status for.
	 */
	public HumanEntity getEntity() {
		return this.entity;
	}
	
	/**
	 * Returns the number of nearby entities surrounding this entity
	 */
	public int getNearbyEntityCount() {
		return this.nearbyEntityCount;
	}
	
	/**
	 * Returns the number of nearby items surrounding this entity
	 */
	public int getNearbyItemCount(){
		return nearbyItemCount;
	}
}
