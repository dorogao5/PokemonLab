package lab.attack;

import ru.ifmo.se.pokemon.*;

public final class StormThrow extends PhysicalMove {
    public StormThrow(){super(Type.FIGHTING, 60, 100);}

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 90);
    }
    @Override
    protected String describe() {
        return "использовал  Storm Throw";
    }
}
