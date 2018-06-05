package com.ffo.pattern.decorator;

/**
 * @author: huchunhua
 * @create_time: 2018/6/5 14:02
 * @change_time:
 * @package: com.ffo.pattern.decorator
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 巧克力装饰类
 */
public class ChocolatesDecorator extends Decorator {
    ChocolatesDecorator(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        //价格加4元
        return super.cost() + 4;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " added Chocolates";
    }
}
