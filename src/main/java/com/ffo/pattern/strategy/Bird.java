package com.ffo.pattern.strategy;


import com.ffo.pattern.strategy.base.Animals;
import com.ffo.pattern.strategy.eat.VegetarianEat;
import com.ffo.pattern.strategy.move.FlyMove;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:27
 * @change_time:
 * @package: com.com.ffo.pattern.strategy
 * @project: ffo
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class Bird extends Animals {
    Bird(){
        eatBehavior = new VegetarianEat();
        moveBehavior = new FlyMove();
    }

    public void function(){
        System.out.println("鸟儿所独有的属性方法");
    }
}
