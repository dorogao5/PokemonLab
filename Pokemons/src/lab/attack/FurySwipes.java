package lab.attack;

import java.util.Random;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 80);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Random random = new Random();
        int randomNum = random.nextInt(8);
        if(randomNum == 0 | randomNum == 1 | randomNum == 2){
            for(int i = 0; i < 2; i ++){
                p.setMod(Stat.HP, 36);
            }
        }
        if(randomNum == 3 | randomNum == 4 | randomNum == 5){
            for(int i = 0; i < 3; i ++){
                p.setMod(Stat.HP, 54);
            }
        }
        if(randomNum == 6){
            for(int i = 0; i < 4; i ++){
                p.setMod(Stat.HP, 72);
            }
        }
        if(randomNum == 7){
            for(int i = 0; i < 5; i ++){
                p.setMod(Stat.HP, 90);
            }
        }
    }

    @Override
    protected  String describe(){
        return "использовал Work Up";
    }
}
