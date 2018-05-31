package com.ffo.pattern.strategy.move;


import com.ffo.pattern.strategy.base.MoveBehavior;

/**
 * @author: huchunhua
 * @create_time: 2018/5/31 14:15
 * @change_time:
 * @package: com.com.ffo.pattern.strategy.move
 * @project: ffo
 * @mail: huachunhu@qq.com
 * @describe: 步行动物行动方式实现类
 */
public class WalkMove implements MoveBehavior {
    public void move() {
        System.out.println("步行");
    }
}
