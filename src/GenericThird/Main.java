package GenericThird;

import GenericThird.FruitsAndVegetables.Apple;
import GenericThird.FruitsAndVegetables.Banana;
import GenericThird.FruitsAndVegetables.Cabbage;
import GenericThird.FruitsAndVegetables.Fruit;

public class Main {

    public static void main(String[] args) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();
        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();
        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

//        Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
//        cabbageBox.getObj().printClass();
//       ошибка возникла из-за того, что класс Box жестко привязан к классу Fruit, а класс Cabbage не является его (класса Fruit) наследником

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}
