public class ProduceMain {
    public static void main(String[] args) {
        Vegetable eggplant = new Vegetable("eggplant", "purple", 4);
        Fruit grapefruit = new Fruit("grapefruit", "red");
        eggplant.plant(2);
        grapefruit.plant();
        eggplant.harvest();
        eggplant.harvest();
        grapefruit.harvest();
        grapefruit.harvest();
        System.out.println("We ended up with " + eggplant.getNumPlanted() + " " + eggplant.getColor() + " eggplants");
        System.out.println("We ended up with " + grapefruit.getNumPlanted() + " " + grapefruit.getColor() + " grapefruits");
    }
}
