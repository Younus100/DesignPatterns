package wendingMachinDersign;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class WendingMAchine {
}

class Product{
    String name;
    int count;
    double price;
}
class Slot{
    int number;
    Product product;
}

class Machine{
    List<Slot> slots;
    double totalMoney;
    List<Button> numberButtons = List.of(new NumberButton(0),new NumberButton(1),new NumberButton(2),new NumberButton(3),
    new NumberButton(4),new NumberButton(5),new NumberButton(6),new NumberButton(7),new NumberButton(8),new NumberButton(9));

    MachineState machineState = new IdleState();

    void initializeMachine(int numberOfSlots){
        for(int i=0;i<numberOfSlots;i++){
            slots.add(new Slot());
        }
    }
    void addProuct(int slotNumber,Product product){
        slots.get(slotNumber).product = product;
    }

    void takeInput(int i){
        Button button = numberButtons.get(i);

    }
}
interface MachineState{
    Product dispenseProduct(int slotnumber);
    void takeMoney();
    void takeInput();
}
class IdleState implements MachineState{
    @Override
    public Product dispenseProduct(int slotnumber) {
        return null;
    }
    @Override
    public void takeMoney() {

    }
    @Override
    public void takeInput() {

    }
}
class InputTakenState implements MachineState{
    @Override
    public Product dispenseProduct(int slotnumber) {
        return null;
    }
    @Override
    public void takeMoney() {

    }
    @Override
    public void takeInput() {

    }
}
class MoneyTakenState implements MachineState{
    @Override
    public Product dispenseProduct(int slotnumber) {
        return null;
    }
    @Override
    public void takeMoney() {

    }
    @Override
    public void takeInput() {

    }
}
interface Button{
    void action();
}
class NumberButton implements Button{
    int number;
    NumberButton(int number){
        this.number = number;
    }
    Command command;

    @Override
    public void action() {

    }
}

class EnterButton implements Button{
    Command command;
    EnterButton(Command command){
        this.command = command;
    }
    @Override
    public void action() {

    }
}
class CancelButton implements Button{
    Command command;
    CancelButton(Command command){
        this.command = command;
    }
    @Override
    public void action() {

    }
}
class RefillButton implements Button{
    Command command;
    RefillButton(Command command){
        this.command = command;
    }
    @Override
    public void action() {

    }
}
class ResetAmmountButton implements Button{
    Command command;
    ResetAmmountButton(Command command){
        this.command = command;
    }
    @Override
    public void action() {

    }
}

interface Command{
    void execute();
}
class InsertMoneyCommand implements Command{
    @Override
    public void execute() {

    }
}
class TakeInputCommand implements Command{
    @Override
    public void execute() {

    }
}
class CancelCommand implements Command{
    @Override
    public void execute() {

    }
}


