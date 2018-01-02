public class Item {
    private String name;
    public int weight;

     public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //getter method
    public int weight() {
         return this.weight;
    }

}
