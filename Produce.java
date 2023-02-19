// Simulate a garden where fruits and vegetables can be planted and harvested
abstract class Produce {
    // ATTRIBUTES
    // Static: shared by all produce
    // Final: value cannot change
    // Private: cannot be directly accessed
    private static final boolean edible = true;
    private String color;
    private String name;
    private int numPlanted = 0;

    // SETTERS
    public void setName(String Name) {
        name = Name;
    }
    public void setNumPlanted(int Num) {
        numPlanted = Num;
    }
    public void setColor(String Color) {
        color = Color;
    }
    
    // GETTERS
    public String getName() {
        return name;
    }
    public int getNumPlanted() {
        return numPlanted;
    }
    public String getColor() {
        return color;
    }
    
    // METHODS
    public void plant() {
        String Name = getName();
        int numPlanted = getNumPlanted();
        setNumPlanted(numPlanted + 1);
        System.out.println("Planting a single " + Name);
        System.out.println("Now we have " + getNumPlanted());
    }
    public void plant(int Num) {
        String Name = getName();
        int numPlanted = getNumPlanted();
        setNumPlanted(numPlanted + Num);
        System.out.println("Planting " + Num + " of " + Name);
        System.out.println("Now we have " + getNumPlanted());
    }
    public void harvest() {
        String Name = getName();
        int numPlanted = getNumPlanted();
        if (numPlanted > 0) {
            setNumPlanted(numPlanted - 1);
            System.out.println("Harvesting a single " + Name);
            System.out.println("Now we have " + getNumPlanted());
        } else {
            System.out.println("We don't have enough " + Name + "for that. There are only " + numPlanted + " left");
        }
    }
    public void harvest(int Num) {
        String Name = getName();
        int numPlanted = getNumPlanted();
        if (numPlanted > Num) {
            setNumPlanted(numPlanted - Num);
            System.out.println("Harvesting a single " + Name);
            System.out.println("Now we have " + getNumPlanted());
        } else {
            System.out.println("We don't have enough " + Name + "for that. There are only " + numPlanted + " left");
        }
    }
}

class Fruit extends Produce {
    // CONSTRUCTORS
    public Fruit() {
    
    }
    public Fruit(String Name) {
        setName(Name);
    }
    public Fruit(String Name, String Color) {
        setName(Name);
        setColor(Color);
    }
    public Fruit(String Name, String Color, int Num) {
        setName(Name);
        setColor(Color);
        setNumPlanted(Num);
    }
    public Fruit(String Name, int Num) {
        setName(Name);
        setNumPlanted(Num);
    }
}

class Vegetable extends Produce {
    // CONSTRUCTORS
    public Vegetable() {
    
    }
    public Vegetable(String Name) {
        setName(Name);
    }
    public Vegetable(String Name, String Color) {
        setName(Name);
        setColor(Color);
    }
    public Vegetable(String Name, String Color, int Num) {
        setName(Name);
        setColor(Color);
        setNumPlanted(Num);
    }
    public Vegetable(String Name, int Num) {
        setName(Name);
        setNumPlanted(Num);
    }
}