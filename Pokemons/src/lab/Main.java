package lab;

import lab.pokemons.*;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Boys Battle");
        theBoysBattle();
        System.out.println("Random Battle");
        randomBattle();
    }
    public static Accelgor pok = new Accelgor("pok", 24);
    public static void theBoysBattle(){
        Battle battle = new Battle();
        Accelgor accelgor = new Accelgor("Homelander", 24);
        Shelmet shelmet = new Shelmet("ATrain", 22);
        Slacking slacking = new Slacking("Black Noir", 63);
        Slakoth slakoth = new Slakoth("Butcher", 1);
        Throh throh = new Throh("Hughie", 1);
        Vigoroth vigoroth = new Vigoroth("Frenchi", 1);
        battle.addAlly(shelmet);
        battle.addAlly(accelgor);
        battle.addAlly(slacking);
        battle.addFoe(slakoth);
        battle.addFoe(throh);
        battle.addFoe(vigoroth);
        battle.go();
    }
    public static void randomBattle(){
        Battle battle = new Battle();
        Accelgor accelgor = new Accelgor("first", 24);
        Shelmet shelmet = new Shelmet("second", 22);
        Slacking slacking = new Slacking("third", 63);
        Slakoth slakoth = new Slakoth("forth", 36);
        Throh throh = new Throh("fifth", 81);
        Vigoroth vigoroth = new Vigoroth("sixth", 36);
        Pokemon[] pokemons = {accelgor, shelmet, slacking, slakoth, throh, vigoroth};
        List<Pokemon> list = Arrays.asList(pokemons);
        Collections.shuffle(list);
        battle.addAlly(list.get(0));
        battle.addAlly(list.get(1));
        battle.addAlly(list.get(2));
        battle.addFoe(list.get(3));
        battle.addFoe(list.get(4));
        battle.addFoe(list.get(5));
        battle.go();
    }

}
