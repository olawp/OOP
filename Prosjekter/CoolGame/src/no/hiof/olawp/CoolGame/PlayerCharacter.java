package no.hiof.olawp.CoolGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * PLayerCharacter represents a playable character in our game.
 *
 * @author Ola W.Petersen
 */
public class PlayerCharacter {
    private String name,nickname;
    private int health;
    private boolean isNoob;
    private ArrayList<String> weapons;


    public PlayerCharacter() {
        this.name = generateName();
        this.isNoob = true;
        weapons = generateStartingWeapons();
    }

    private String generateName(){
        String[] names = new String[] {
          "Johan",
          "Mario",
          "Ori",
          "Krieg",
          "Gaige"
        };



        int valgtNavn = new Random().nextInt(names.length);
        return names[valgtNavn];
    }

    /**
     * Increases the health with a random value between 0 and 100.
     */
    public void sleep(){
        Random random = new Random();
        health += random.nextInt(100);
    }

    /**
     * Calculates damage taken. Players health cant go under 0.
     * @param damage The damage the players character takes.
     */
    public void takeDamage(int damage){
        health = Math.max(0,health-=damage);
    }

    /**
     * Generates a list of starting weapons.
     * @return the list of starting weapons.
     */
    private ArrayList<String> generateStartingWeapons(){
        ArrayList<String> startingWeapons = new ArrayList<>();
        startingWeapons.add("Kokiri sword");
        startingWeapons.add("Shitty gun");
        startingWeapons.add("Shitty shield");
        startingWeapons.add("Double penetrating Unkempt Harold");

        return startingWeapons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname.contains("Penis"))
            throw new ProfanityException(nickname + " is not allowed. Miss me with dat gay shit");
        this.nickname = nickname;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isNoob() {
        return isNoob;
    }

    public void setNoob(boolean noob) {
        isNoob = noob;
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<String> weapons) {
        this.weapons = weapons;
    }
}
