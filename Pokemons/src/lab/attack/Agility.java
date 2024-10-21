package lab.attack;


import static lab.Main.pok;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Agility extends StatusMove {
    public Agility(){
        super(Type.PSYCHIC, 0, 0);
    }


    // super, @override, static, блоки инициализщации, конструкторы
    Pokemon p = pok;
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "использовал Agility";
    }
}

