package com.ffo.pattern.decorator;

/**
 * @author: huchunhua
 * @create_time: 2018/6/5 14:00
 * @change_time:
 * @package: com.ffo.pattern.decorator
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 牛奶装饰类
 */
public class MilkDecorator extends Decorator{
    MilkDecorator(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        //价格加2元
        return super.cost() + 2;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " added milk";
    }
}
