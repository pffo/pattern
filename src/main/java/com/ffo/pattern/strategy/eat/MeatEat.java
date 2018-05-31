package com.ffo.pattern.strategy.eat;


import com.ffo.pattern.strategy.base.EatBehavior;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:14
 * @change_time:
 * @package: com.com.ffo.pattern.strategy.eat
 * @project: ffo
 * @mail: huachunhu@qq.com
 * @describe: 肉食动物进食实现类
 */
public class MeatEat implements EatBehavior {
    public void eat() {
        System.out.println("肉食");
    }
}
