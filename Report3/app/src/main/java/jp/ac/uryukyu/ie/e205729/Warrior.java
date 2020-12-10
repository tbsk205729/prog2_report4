package jp.ac.uryukyu.ie.e205729;

public class Warrior extends Hero{
    
    public Warrior(String name, int maximumHP, int attack){
        super(name,maximumHP,attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if (dead == true ){
            return;
        }else{
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    
}
