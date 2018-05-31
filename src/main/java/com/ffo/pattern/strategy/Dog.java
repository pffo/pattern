package com.ffo.pattern.strategy;


import com.ffo.pattern.strategy.base.Animals;
import com.ffo.pattern.strategy.eat.MeatEat;
import com.ffo.pattern.strategy.move.WalkMove;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:23
 * @change_time:
 * @package: com.com.ffo.pattern.strategy
 * @project: ffo
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class Dog extends Animals {
    Dog(){
        eatBehavior = new MeatEat();
        moveBehavior = new WalkMove();
    }

    public void function(){
        System.out.println("狗狗所独有的方法实现");
    }
}
