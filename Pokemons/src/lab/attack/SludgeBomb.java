package lab.attack;

import java.util.Random;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class SludgeBomb extends SpecialMove {
    public SludgeBomb(){super(Type.POISON, 90, 100);}

    @Override
    protected void applyOppEffects(Pokemon p){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean probability = randomNumber == 0 | randomNumber == 1 | randomNumber == 2;
        if (probability == true){
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "использовал Sludge Bomb";
    }
}
