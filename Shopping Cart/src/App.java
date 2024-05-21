public class App {
    LinkedList item;
    public App(){
        this.item = new LinkedList();
    }
    public void addItems(String itemName){
        this.item.append(itemName);
    }
    public void removeItems(String itemName){
        this.item.remove(itemName);
    }
    public void displayItems(){
        this.item.listIterator();
    }

    public static void main(String[] args) {
        App shoppingCart = new App();
        shoppingCart.addItems("Shirt");
        shoppingCart.addItems("Jeans");
        shoppingCart.addItems("Jackets");
        shoppingCart.displayItems();
        shoppingCart.removeItems("Jackets");
        shoppingCart.displayItems();
    }
}
