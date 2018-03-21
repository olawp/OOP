package no.hiof.olawp.CoolGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    private PlayerCharacter playerCharacter;

    @BeforeEach
    public void init(){
        this.playerCharacter = new PlayerCharacter();
    }

    @Test
    public void shouldHaveDefaultNameGeneratedName(){
        PlayerCharacter playerCharacter = new PlayerCharacter();

        assertNotEquals("",playerCharacter.getName());
    }

    @Test
    public void shouldBeANoob(){
        PlayerCharacter playerCharacter = new PlayerCharacter();
        assertTrue(playerCharacter.isNoob(),"Kappa");
    }

    @Test
    public void tfwZeroDamage(){
        playerCharacter.setHealth(100);
        playerCharacter.takeDamage(1000);

        assertEquals(0,playerCharacter.getHealth());

    }

    @Test
    public void sleepHealthIncrease(){
       playerCharacter.setHealth(100);
       playerCharacter.sleep();

       assertTrue(100<playerCharacter.getHealth());
    }

}