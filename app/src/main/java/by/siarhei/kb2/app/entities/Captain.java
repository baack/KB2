package by.siarhei.kb2.app.entities;

import by.siarhei.kb2.app.R;

import java.util.Random;

import by.siarhei.kb2.app.models.MapPoint;
import by.siarhei.kb2.app.models.Mover;
import by.siarhei.kb2.app.models.Player;
import by.siarhei.kb2.app.warriors.Warrior;
import by.siarhei.kb2.app.warriors.WarriorFactory;
import by.siarhei.kb2.app.warriors.WarriorSquad;

public class Captain extends EntityImpl implements Fighting, Moving {
    private static final int MAX_ARMY = 5;
    private final WarriorSquad[] warriors = new WarriorSquad[MAX_ARMY];
    private final Mover mover;
    private int authority;

    public Captain(MapPoint point) {
        super(point);
        mover = new Mover(point.getGlade());
    }

    @Override
    public int getID() {
        return R.drawable.captain_0;
    }

    @Override
    public int getID(Player player) {
        return player.isCaptainsActivated() ? R.drawable.captain : R.drawable.captain_0;
    }

    @Override
    public WarriorSquad getWarriorSquad(int n) {
        return warriors[n];
    }

    @Override
    public int getAuthority() {
        return authority;
    }

    @Override
    public void generateArmy(int authority, int group) {
        this.authority = authority;
        int squadCount = (new Random()).nextInt(MAX_ARMY) + 1;
        for (int i = 0; i < squadCount; i++) {
            Warrior warrior = WarriorFactory.createRandomFromGroup(group);
            WarriorSquad squad = new WarriorSquad(warrior, authority / warrior.getDefence());
            warriors[i] = squad;
        }
    }

    @Override
    public void defeat() {
        this.destroy();
    }

    @Override
    public void moveInDirection(MapPoint point) {
        mover.moveInDirection(this, point);
    }

    @Override
    public void moveInRandomDirection() {
        mover.moveInRandomDirection(this);
    }

    @Override
    public boolean canMoveTo(MapPoint point) {
        return mover.canMoveTo(point);
    }
}
