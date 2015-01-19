package com.neschur.kb2.app.entities;

import com.neschur.kb2.app.R;
import com.neschur.kb2.app.countries.Country;
import com.neschur.kb2.app.warriors.Warrior;
import com.neschur.kb2.app.warriors.WarriorFactory;

public class ArmyShop extends Entity {
    private Warrior warrior;

    public ArmyShop(Country country, int x, int y, int group) {
        super(country, x, y);
        warrior = WarriorFactory.createRandomFromGroup(group);
    }

    @Override
    public int getID() {
        return R.drawable.army_shop;
    }

    public Warrior getWarrior() {
        return warrior;
    }
}
