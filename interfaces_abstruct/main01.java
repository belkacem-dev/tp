package interfaces_abstruct;

import sevree.student;

public class main01 {
    
    public static void main(String[] args) {
        
        
        CustomWeapon myLaserGun = new lasergun();

        myLaserGun.showInfo(); 
        myLaserGun.fire();    

        lasergun laser = (lasergun) myLaserGun; 
        laser.upgradeMod();
        laser.enableGlow();

        System.out.println("-----------------------------------");

        CustomWeapon[] modWeapons = { 
            new lasergun(), 
        };

        for (CustomWeapon weapon : modWeapons) {
            weapon.fire();
        }
    }
        Student s1 = new Student("John", 20, "Computer Science");
}

