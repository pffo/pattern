package com.ffo.pattern.decorator;

/**
 * @author: huchunhua
 * @create_time: 2018/6/5 13:52
 * @change_time:
 * @package: com.ffo.pattern.decorator
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 装饰抽象类
 */
public abstract class Decorator implements  IIceCream{
    protected IIceCream iceCream;

    Decorator(IIceCream iceCream){
        this.iceCream = iceCream;
    }

    public double cost() {
        return iceCream.cost();
    }

    public String getDesc() {
        return iceCream.getDesc();
    }
}
