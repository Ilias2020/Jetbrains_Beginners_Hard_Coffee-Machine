package action;

public class MachineCondition {
    int water;
    int milk;
    int beens;
    int cups;
    int money;

    public void printMachine() {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", water, milk, beens, cups, money);
    }

    public MachineCondition(int water, int milk, int beens, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beens = beens;
        this.cups = cups;
        this.money = money;
    }

    public boolean check(int chWater, int chMilk, int chBeens, int chCups) {
        if (water < chWater) {
            System.out.printf("Sorry, not enough water!\n");
            return false;
        } else if (milk < chMilk) {
            System.out.printf("Sorry, not enough milk!\n");
            return false;
        } else if (beens < chBeens) {
            System.out.printf("Sorry, not enough beens!\n");
            return false;
        } else if (cups < chCups) {
            System.out.printf("Sorry, not enough cups!\n");
            return false;
        } else {
            System.out.printf("\nI have enough resources, making you a coffee!\n");
            return true;
        }
    }
}
