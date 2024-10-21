package lab.pokemons;

import lab.attack.Absorb;
import lab.attack.Agility;
import lab.attack.LeechLife;
import lab.attack.SludgeBomb;

import ru.ifmo.se.pokemon.Type;

public final class Accelgor extends Shelmet {
    public Accelgor(String name, int level){
        super(name, level);

        setType(Type.BUG);
        setStats(80, 70, 40, 100, 60, 145);
        setMove(new Absorb(), new LeechLife(), new SludgeBomb(), new Agility());
    }

}
