public class ProduceMain {
    public static void main(String[] args) {
        Vegetable eggplant = new Vegetable("eggplant");
        Fruit grapefruit = new Fruit("grapefruit");
        eggplant.plant(2);
        grapefruit.plant();
        eggplant.harvest();
        eggplant.harvest();
        grapefruit.harvest();
        grapefruit.harvest();
    }
}
