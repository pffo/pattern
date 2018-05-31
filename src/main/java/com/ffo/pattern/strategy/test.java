package com.ffo.pattern.strategy;


import com.ffo.pattern.strategy.base.Animals;
import com.ffo.pattern.strategy.eat.VegetarianEat;
import com.ffo.pattern.strategy.move.FlyMove;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:03
 * @change_time:
 * @package: com.com.ffo.pattern.strategy
 * @project: ffo
 * @mail: huachunhu@qq.com
 * @describe: c
 */
public class test {
    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals bird = new Bird();

        System.out.println("dog的进食方式:");
        dog.eat();
        System.out.println("bird的进食方式:");
        bird.eat();

        System.out.println("dog的行动方式:");
        dog.move();
        System.out.println("bird的行动方式:");
        bird.move();

        System.out.println("bird的改变了方式:");
        bird.setEatBehavior(new VegetarianEat());
        bird.eat();
        System.out.println("dog的进化了行动方式:");
        dog.setMoveBehavior(new FlyMove());
        dog.move();

    }
}
