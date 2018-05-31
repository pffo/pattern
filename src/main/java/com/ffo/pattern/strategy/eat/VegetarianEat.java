package com.ffo.pattern.strategy.eat;


import com.ffo.pattern.strategy.base.EatBehavior;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:12
 * @change_time:
 * @package: com.com.ffo.pattern.strategy.eat
 * @project: ffo
 * @mail: huachunhu@qq.com
 * @describe: 素食动物进食实现类
 */
public class VegetarianEat implements EatBehavior {

    public void eat() {
        System.out.println("素食");
    }
}
