package lab.pokemons;

import lab.attack.Absorb;
import lab.attack.LeechLife;
import lab.attack.SludgeBomb;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shelmet extends Pokemon {
    public Shelmet(String name, int level){
        super(name, level);

        setType(Type.BUG);
        setStats(50, 40, 85, 40, 65, 25);
        setMove(new Absorb(), new LeechLife(), new SludgeBomb());

    }

}
