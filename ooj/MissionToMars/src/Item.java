public class Item {
    private String name;
    private int weight;

     public Item(String ItemName, int ItemWeight) {
        this.name = ItemName;
        this.weight = ItemWeight;
    }

    //helper methods

    public String getName() {
         return name;
    }

    public int getWeight() {
         return weight;
    }

    public String setName(String iName) {
         return name = iName;
    }

    public int setWeight(int iWeight) {
        return weight = iWeight;
    }


}
