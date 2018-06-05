package com.ffo.pattern.decorator;

/**
 * @author: huchunhua
 * @create_time: 2018/6/5 13:49
 * @change_time:
 * @package: com.ffo.pattern.decorator
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 具体角色类
 */
public interface IIceCream {
    /**
     * 价格
     *
     * @return
     */
    double cost();

    /**
     * 详情描述
     *
     * @return
     */
    String getDesc();
}
