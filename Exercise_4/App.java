public class App {
    
    public static void main(String[] args) throws Exception {
      Person friend = new Person("Shaira", 19);
      Myself me = new Myself("Kenji",  19); 

      
      me.addFriend(friend);

      Pet cat = new Pet("Charlie", friend);
      cat.showOwnerName();

      Car Car = new Car("Bugatti Chiron", me);
      Car.showOwnerName();

    }
} 
