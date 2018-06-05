package com.ffo.pattern.decorator;

import java.io.*;

/**
 * @author: huchunhua
 * @create_time: 2018/6/5 14:03
 * @change_time:
 * @package: com.ffo.pattern.decorator
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 一句话描述
 */
public class Test {
    public static void main(String[] args) {
        IIceCream iceCream = new BigIceCream();
        iceCream = new MilkDecorator(iceCream);
        iceCream = new ChocolatesDecorator(iceCream);

        System.out.println("price：" + iceCream.cost() + " //  desc: " + iceCream.getDesc());
    }
}
