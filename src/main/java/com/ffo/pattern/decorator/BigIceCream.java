package com.ffo.pattern.decorator;

/**
 * @author: huchunhua
 * @create_time: 2018/6/5 13:58
 * @change_time:
 * @package: com.ffo.pattern.decorator
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 被装饰者
 */
public class BigIceCream implements IIceCream {
    public double cost() {
        return 5;
    }

    public String getDesc() {
        return "this is a big ice cream";
    }
}
