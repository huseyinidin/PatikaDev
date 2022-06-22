public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int damagePower = 1;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        if (foe.isPower()) {
            System.out.println(this.name + " => " + foe.name + " " + this.damagePower + " had damaged.");
        }
        if (foe.isDodge()) {
            System.out.println(foe.name + " it prevented the damage from coming. ");
            return foe.health;
        }
        return Math.max(foe.health - damagePower, 0);
    }

    boolean isPower() {
        this.damagePower = (int) (Math.random() * 100);
        return this.damagePower <= this.damage;
    }

    boolean isDodge() {
        double randomNumber = (int) (Math.random() * 100);
        return randomNumber <= this.dodge;
    }

}
