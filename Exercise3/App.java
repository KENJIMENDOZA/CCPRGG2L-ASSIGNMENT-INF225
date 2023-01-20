public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        Weapon Sword = new Weapon();

        Sword.name = "Yoshimitsu";
        Sword.damage = 999;
        Sword.rarity = "Legendary ";
        Sword.Yoshimitsu();
        Sword.AddDamage(1000);
       
        System.out.print(Sword.showNameandRarity());

        Character Roamer = new Character();

        Roamer.name = "Yoshimitsu";
        Roamer.attack();
    }
        
}
