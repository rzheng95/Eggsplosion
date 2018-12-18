package com.rzheng.eggsplosion;

public class EggSettings 
{
	private float power;
	private boolean onFire;
	
	public EggSettings()
	{
		this.power = 2;
		this.onFire = true;
	}
	
	public float getPower()
	{
		return this.power;
	}
	
	public boolean getOnFire()
	{
		return this.onFire;
	}
	
	public void setPower(float p)
	{
		this.power = p;
	}
	
	public void setOnFire(boolean b)
	{
		this.onFire = b;
	}
}
