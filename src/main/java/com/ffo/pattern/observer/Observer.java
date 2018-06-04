package com.ffo.pattern.observer;

import com.ffo.pattern.observer.model.Data;

/**
 * @author: huchunhua
 * @create_time: 2018/6/4 10:50
 * @change_time:
 * @package: com.ffo.pattern.observer
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 观察者接口
 */
public interface Observer {
    void update(Data data);
}
