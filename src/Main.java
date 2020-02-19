import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int choice = 0;
    static int playerHP = 10;
    static int monsterHP = 15;
    static Random rd = new Random();
    static Scanner ms = new Scanner(System.in);

    public static void main(String[] args) {
        // if playerHP > 0 then you can attack
        attack();
    }
    public static void attack() {
        // player attacks and creates damage
        // if monster still alive it attacks back
        int playerDamage = rd.nextInt(playerHP);
        System.out.println("You will attack with "+playerDamage);
        // if damage
        monsterHP = monsterHP - playerDamage;
        if (monsterHP < 1) {
            win("Monster is dead");
            // you win

        } else {
            // monster will fightback
            int monsterDamage = rd.nextInt(monsterHP);
            System.out.println("Monster will fight back  with "+ monsterDamage);
            playerHP = playerHP - monsterDamage;
            if (playerHP < 1) {
                dead("You are dead");
            }
        }
        System.out.println("Do you want to fight again?");
        choice = ms.nextInt();
        if (choice == 1) {
            attack();
        } else {
            goToGate("done fighting");
        }
    }
    public static void win(String msg) {
        System.out.println(msg);
    }
    public static void dead(String msg) {
        System.out.println(msg);
    }
    public static void goToGate(String msg) {
        System.out.println(msg);
    }
}
