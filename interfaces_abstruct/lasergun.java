package interfaces_abstruct;
public class lasergun extends CustomWeapon implements interfaces.Upgradable, interfaces.GlowEffect {

    public lasergun() {
        super("Cyber Laser", 80);
    }

    @Override
    public void fire() {
        System.out.println("Pew Pew! Laser firing...");
    }

    @Override
    public void upgradeMod() {
        System.out.println("Laser upgraded to Level 2!");
    }

    @Override
    public void enableGlow() {
        System.out.println("Neon glow activated on the gun!");
    }
}
