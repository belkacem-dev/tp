package interfaces_abstruct;
    public abstract class CustomWeapon {
      String modName;
      int damage;
       public CustomWeapon(String modName, int damage) {
        this.modName = modName;
        this.damage = damage;
       }
      public void showInfo() {
        System.out.println("Mod Weapon: " + modName + " | Damage: " + damage);
       }
      public abstract void fire();
}

    //we use it to create a base class for all custom weapons, allowing us to define common properties and 
    // methods that can be shared among different weapon types.