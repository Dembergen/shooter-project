public class Player {
    private Weapon[] weaponSlots;

    public Player(){
        weaponSlots = new Weapon[]{
                new Pistol(),
                new BigGun(),
                new RPG(),
                new Slingshot(),
                new WaterPistol(),
                new Bomb()
        };
    }

    public int getSlotsCount(){
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot){
    Weapon weapon = weaponSlots[slot];
    weapon.shot();
    }

}