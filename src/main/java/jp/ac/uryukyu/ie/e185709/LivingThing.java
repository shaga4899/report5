package jp.ac.uryukyu.ie.e185709;


class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    boolean isDead(){return dead;}
    String getName(){return name;}

    void attack(LivingThing opponent){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    void deadSetter(boolean set){
        dead = set;
    }

    void hitpointSetter(int hitpoint){
        this.hitPoint -= hitpoint;
    }

    int hitpointGetter(){
        return hitPoint;
    }

    String nameGetter(){
        return name;
    }

    void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}