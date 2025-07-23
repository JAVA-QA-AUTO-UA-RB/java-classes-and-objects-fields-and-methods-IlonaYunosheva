public class SuperHero {
        public String name;
        public int attackPower;
        public int defensePower;
        public int health;

    public SuperHero(String name, int attackPower, int defensePower) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.health = 100;
    }
    public void attack(SuperHero opponent) {
        int damage = this.attackPower - opponent.defensePower;
        System.out.println(this.name + " атакує " + opponent.name + " і завдає " + damage + " ушкоджень.");
        opponent.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " має залишок здоров'я: " + this.health + ".");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void showStats() {
        System.out.println("Герой: " + name + ", Атака: " + attackPower + ", Захист: " + defensePower + ", Здоров'я: " + health);
    }
}

        // Тут мають бути властивості і поведінка Супергероя

