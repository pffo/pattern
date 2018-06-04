package com.ffo.pattern.observer;

import com.ffo.pattern.observer.model.Data;

/**
 * @author: huchunhua
 * @create_time: 2018/6/4 10:49
 * @change_time:
 * @package: com.ffo.pattern.observer
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 被观察者接口
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void removeAll();

    void setChange();

    void notifyObservers();

    void notifyObserver(Observer observer);

    void notifyObserver(Observer observer, Object args);

    void setData(Data data);
}
