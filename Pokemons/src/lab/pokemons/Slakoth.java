package lab.pokemons;

import lab.attack.RockTomb;
import lab.attack.WorkUp;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth (String name, int level) {
        super(name, level);
        setType(Type.NORMAL );
        setStats(60,60,60,35,35,30);
        setMove(new WorkUp(), new RockTomb());
    }

}
