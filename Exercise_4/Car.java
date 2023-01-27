public class Car {
    String brand; 
    Myself owner; 
    
    Car(String carName, Myself me){
        this.brand = carName;
        this.owner = me;


 
    }
    void showOwnerName(){
        System.out.println("My car brand is " + this.brand + " My owner name is " + owner.name);
} 
}  

