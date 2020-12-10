package jp.ac.uryukyu.ie.e205729;


public class LivingThing {
    /**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int maximumHP, int attack){

        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public int getHitPoint(){
        return hitPoint;
    }


    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (dead == true ){
            return;
        }else{
        opponent.wounded(damage);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n",name);
        }

    }

    
    
}
