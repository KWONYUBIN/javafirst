package ch08.lecture;

public class p4sample {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("총을 획득합니다.");
        hero.setWeapon(new Gun());
        hero.attack();

        System.out.println("검을 획득합니다.");
        hero.setWeapon(new Sword());
        hero.attack();
    }
}

interface Weapon {
    void use();
}

class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("검을 휘두룹니다.");
    }
}

class Gun implements Weapon {
    @Override
    public void use() {
        System.out.println("총을 쏩니다.");
    }
}


class Hero {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }
}