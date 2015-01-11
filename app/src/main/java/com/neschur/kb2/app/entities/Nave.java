package com.neschur.kb2.app.entities;

import com.neschur.kb2.app.R;
import com.neschur.kb2.app.countries.Country;

public class Nave extends Entity implements Action{

	public Nave(Country country, int x, int y) {
		super(country, x, y);
	}

	@Override
	public int getID() {
		return R.drawable.nave;
	}

	public void action() {

	}

	public void move(int x,int y){
		this.x=x;
		this.y=y;
	}

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}