package lab.pokemons;

import lab.attack.Bulldoze;
import lab.attack.FocusBlast;
import lab.attack.Leer;
import lab.attack.StormThrow;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Throh extends Pokemon{
    public Throh(String name, int level){
        super(name, level);

        setType(Type.FIGHTING);
        setStats(120,100,85,30,85,45);
        setMove(new Leer(), new Bulldoze(), new StormThrow(), new FocusBlast());
    }

}
