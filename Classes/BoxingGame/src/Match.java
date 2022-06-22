public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {

        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (true) {
                System.out.println("-----------New Round-------------");
                int firstHit = (int) (Math.random() * 2);
                if (firstHit == 0) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) break;

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) break;
                }
                if (firstHit == 1) {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) break;

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) break;
                }
                System.out.println(this.f1.name + " Healthy :" + this.f1.health);
                System.out.println(this.f2.name + " Healthy :" + this.f2.health);
            }
        } else {
            System.out.println("The division of the athletes don't match.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Winner! ");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Winner! ");
            return true;
        }
        return false;
    }
}

