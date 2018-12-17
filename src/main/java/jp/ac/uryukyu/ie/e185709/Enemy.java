package jp.ac.uryukyu.ie.e185709;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
class Enemy extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    @Override
    void wounded(int damage){
        hitpointSetter(damage);
        if( hitpointGetter() < 0 ) {
            deadSetter(true);
            System.out.printf("モンスター%sは倒れた。\n", nameGetter());
        }
    }
}