package _7_Abstract_Class_and_Interface.TH_1_Lop_Animal_and_interface_Edible.animal;

import _7_Abstract_Class_and_Interface.TH_1_Lop_Animal_and_interface_Edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
