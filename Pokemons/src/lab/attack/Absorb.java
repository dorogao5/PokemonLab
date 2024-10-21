package lab.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        String type = p.getClass().toString();
        if (type.equals("Shelmet")) {
            p.setMod(Stat.HP, (int) (p.getHP() + (50 - p.getHP() / 2)));
        }
        if (type.equals("Accelgor")) {
            p.setMod(Stat.HP, (int) (p.getHP() + (80 - p.getHP() / 2)));
        }

    }

    @Override
    protected String describe() {
        return "использовал Absorb";
    }
}
