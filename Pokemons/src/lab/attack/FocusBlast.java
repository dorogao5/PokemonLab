package lab.attack;

import java.util.Random;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class FocusBlast extends SpecialMove {
    public FocusBlast(){super(Type.FIGHTING, 120, 70);}

    @Override
    protected void applyOppEffects(Pokemon p){
        Random random = new Random();
        boolean probability = random.nextInt(10) == 0;
        if (probability == true){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "использовал  Focus Blast";
    }
}
