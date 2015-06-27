package com.untamedears.mustercull.configurations;

import com.untamedears.mustercull.culltypes.CullType;

/**
 * Represents a mob spawn limit from the configuration file.
 * @author Celdecea
 *
 */
public class ConfigurationLimit {

	/**
	 * Whether or not data has changed in this pair.
	 */
	private boolean dirty = false;
	
	
	/**
	 * Max number of specific mob types to spawn in an area.
	 */
	private int limit = 0;
	
	
	/**
	 * Stores the method used to cull the mobs by this particular Configuration_Limit instance.
	 */
	private CullType culling = CullType.SPAWN;
	
	/**
	 * The maximum range to check from the spawn.
	 */
	private int range = 0;
	
	/**
	 * The number of entities that needs to spawn before the entity will actually spawn.
	 */
	private int spawnDelay = 0;
	
	/**
	 * Multiplier for drops of merged mobs.
	 */
	private double multiplier = 0;
	
	/**
	 * multiplier limit for the multiplier of drops of merged mobs. 
	 */
	private double multiplierLimit = 0;
	
	/**
	 * Constructor which sets all properties of this class.
	 * @param limit The maximum number of mobs of a specific type to allow
	 * @param culling The method used to cull the mob.
	 * @param range The range to check
	 * @param spawnDelay The amount of entities that needs to spawn before the entity will actually spawn.
	 * @param multiplier The multiplier for drops of merged mobs.
	 */

	public ConfigurationLimit(int limit, CullType culling, int range, int spawnDelay, double multiplier, double multiplierLimit) {
		this.setLimit(limit);
		this.setCulling(culling);
		this.setRange(range);
		this.setSpawnDelay(spawnDelay);
		this.setMultiplier(multiplier);
		this.setMultiplierLimit(multiplierLimit);
	}
	
	/**
	 * Sets the max number of specific mob types to spawn in an area.
	 * @param limit The max number of specific mob types to spawn in an area.
	 */
	public void setLimit(int limit) {
		this.limit = limit;
		this.dirty = true;
	}

	/**
	 * Returns the max number of specific mob types to spawn in an area.
	 * @return The max number of specific mob types to spawn in an area.
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * Sets the method used to cull the mobs by this particular Configuration_Limit instance.
	 * @param culling The method used to cull the mobs by this particular Configuration_Limit instance.
	 */
	public void setCulling(CullType culling) {
		this.culling = culling;
		this.dirty = true;
	}

	/**
	 * Returns the method used to cull the mobs by this particular Configuration_Limit instance.
	 * @return The method used to cull the mobs by this particular Configuration_Limit instance.
	 */
	public CullType getCulling() {
		return culling;
	}

	/**
	 * Sets the maximum range to check from the spawn.
	 * @param range The maximum range to check from the spawn.
	 */
	public void setRange(int range) {
		
		if (range <= 0) {
			throw new IllegalArgumentException("Range must be greater than zero.");
		}
		
		this.range = range;
		this.dirty = true;
	}

	/**
	 * Returns the maximum range to check from the spawn.
	 * @return The maximum range to check from the spawn.
	 */
	public int getRange() {
		return range;
	}
	
	public void setSpawnDelay(int spawnDelay) {
		this.spawnDelay = spawnDelay;
		this.dirty = true;
	}
	
	public int getSpawnDelay(){
		return spawnDelay;
	}
	
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
		this.dirty = true;
	}
	
	public double getMultiplier(){
		return multiplier;
	}
	
	public void setMultiplierLimit(double multiplierLimit) {
		this.multiplierLimit = multiplierLimit;
		this.dirty = true;
	}
	
	public double getMultiplierLimit(){
		return multiplierLimit;
	}
	
	/**
	 * Returns whether or not data in this object has changed.
	 * @return The value of the encapsulated dirty property.
	 */
	public boolean isDirty() {
		return dirty;
	}
	
	/**
	 * Clears the dirty flag for this object.
	 */
	public void clearDirty() {
		this.dirty = false;
	}
}
