public class Weapon {
    String name;
    int damage;
    String rarity;

    public void AddDamage(int additionalDamage) {
         int newDamage = damage + additionalDamage;
         System.out.println("Damage increased from " + damage + " to " + newDamage);
         this.damage = newDamage;
    }
    public void Yoshimitsu(){
        System.out.println("Hello I am " + name);
    }

    public String showNameandRarity(){
        return this.name + " " + this.rarity;
    }
}

    