import javax.swing.event.ChangeEvent;

public class App {
    public static void main(String[] args) throws Exception {
    
        GroceryItem item1 = new GroceryItem();
        item1.name = "Chikulet";
        item1.showItemName();
        
        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.showItemName();

        GroceryItem item3 = new Toothpaste();
        item3.name = "Close up";
        item3.showItemName();

        Cashier c1 = new Cashier();
        c1.checkOut(item2);
        c1.checkOut(item3);

        Cashier c1 = new Cashier();
        c1.showPrice(item2);
        c1.showPrice(item3);

        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        for (int i = 0; i <  itemArray.length; i++) { 
            itemArray[i].showItemName();
        }
   
        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();
    }

}
