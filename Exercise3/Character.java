public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;
   
    public void sayMyName() {
        System.out.println("I am " + name);
    }
    
    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }
    void attack(){
        System.out.println("I am attacking");
    }
}
