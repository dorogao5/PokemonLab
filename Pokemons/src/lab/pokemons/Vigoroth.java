package lab.pokemons;


import lab.attack.FurySwipes;
import lab.attack.RockTomb;
import lab.attack.WorkUp;

import ru.ifmo.se.pokemon.Type;

public class Vigoroth extends Slakoth{
    public Vigoroth (String name, int level) {
        super(name, level);

        setType(Type.NORMAL );
        setStats(80,80,80,55,55,90);
        setMove(new WorkUp(), new RockTomb(), new FurySwipes());
    }
}

