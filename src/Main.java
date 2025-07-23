public class Main {
    public static void main(String[] args) {
                SuperHero hero1 = new SuperHero("Флеш", 30, 5);
                SuperHero hero2 = new SuperHero("Залізна Людина", 25, 10);

                int round = 1;
                while (hero1.isAlive() && hero2.isAlive()) {
                    System.out.println("Раунд " + round + ":");
                    hero1.attack(hero2);
                    if (!hero2.isAlive()) break;

                    hero2.attack(hero1);
                    if (!hero1.isAlive()) break;

                    round++;
                    System.out.println();
                }

                if (hero1.isAlive() && !hero2.isAlive()) {
                    System.out.println("Переможець: " + hero1.name + "!");
                } else if (!hero1.isAlive() && hero2.isAlive()) {
                    System.out.println("Переможець: " + hero2.name + "!");
                } else {
                    System.out.println("Нічия!");
                }
            }
        }
        // Тут має розгортатися епічна битва між Супергероями

