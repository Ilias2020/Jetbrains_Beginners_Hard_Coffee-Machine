import action.MachineCondition;
import static action.Action.action;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beens = 120;
        int cups = 9;
        int money = 550;
        MachineCondition condition = new MachineCondition(water, milk, beens, cups, money);

        action(condition);

    }

}
