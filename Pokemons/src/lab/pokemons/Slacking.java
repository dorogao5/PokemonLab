package lab.pokemons;

import lab.attack.FurySwipes;
import lab.attack.HammerArm;
import lab.attack.RockTomb;
import lab.attack.WorkUp;

import ru.ifmo.se.pokemon.Type;

public final class Slacking extends Vigoroth{
    public Slacking(String name, int level) {
        super(name, level);

        setType(Type.NORMAL );
        setStats(150,160,100,95,65,100);
        setMove(new WorkUp(), new RockTomb(), new FurySwipes(), new HammerArm());
    }
}
