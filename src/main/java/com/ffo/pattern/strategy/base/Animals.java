package com.ffo.pattern.strategy.base;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:05
 * @change_time:
 * @package: com.com.ffo.pattern.strategy.base
 * @project: ffo
 * @mail: huachunhu@qq.com
 * @describe: 动物基类
 */
public class Animals {
    //抽象出去的两个会变化行为：进食，行动
    protected EatBehavior eatBehavior;
    protected MoveBehavior moveBehavior;

    public void eat(){
        eatBehavior.eat();
    }

    public void move(){
        moveBehavior.move();
    }

    /**
     * 公共行为属性
     */
    public void smile(){
        System.out.println("微笑，say:hello word");
    }

    public void setEatBehavior(EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
}
