package action;

import java.util.Scanner;
public class Action {

    public static void action(MachineCondition other) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.printf("\nWrite action (buy, fill, take, remaining, exit): \n");
            String input = sc.nextLine();

            switch (input) {
                case "buy":
                    buy(other);
                    break;
                case "fill":
                    fill(other);
                    break;
                case "take":
                    take(other);
                    break;
                case "remaining":
                    other.printMachine();
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }
    public static void buy(MachineCondition other) {
        System.out.printf("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
        int choice = 0;
        try {
            choice = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            choice = 0;
        }
        switch (choice) {
            case 0:
                break;
            case 1:
                if (other.check(250, 0, 16, 1) == true) {
                    other.water -= 250;
                    other.beens -= 16;
                    other.money += 4;
                    other.cups -= 1;
                }
                break;
            case 2:
                if (other.check(350, 75, 20, 1) == true) {
                    other.water -= 350;
                    other.milk -= 75;
                    other.beens -= 20;
                    other.money += 7;
                    other.cups -= 1;
                }
                break;
            case 3:
                if (other.check(200, 100, 12, 1) == true) {
                    other.water -= 200;
                    other.milk -= 100;
                    other.beens -= 12;
                    other.money += 6;
                    other.cups -= 1;
                }
                break;
        }
    }

    public static void fill(MachineCondition other) {
        System.out.printf("Write how many ml of water you want to add:\n");
        Scanner scanner = new Scanner(System.in);
        other.water += scanner.nextInt();
        System.out.printf("Write how many ml of milk you want to add:\n ");
        other.milk += scanner.nextInt();
        System.out.printf("Write how many grams of coffee beans you want to add:\n");
        other.beens += scanner.nextInt();
        System.out.printf("Write how many disposable cups you want to add: \n");
        other.cups += scanner.nextInt();

    }

    public static void take(MachineCondition other) {
        System.out.printf("I gave you $%d\n", other.money);
        other.money -= other.money;

    }
}
