package com.ffo.pattern.observer;

import com.ffo.pattern.observer.model.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huchunhua
 * @create_time: 2018/6/4 10:48
 * @change_time:
 * @package: com.ffo.pattern.observer
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 一句话描述
 */
public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private List<Observer> observersCopy = new ArrayList<Observer>();
    private Boolean isChange = false;
    private Data data;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }

    }

    public void removeAll() {
        observers.clear();
    }

    public void setChange() {
        isChange = true;
    }

    public void notifyObservers() {
        if (isChange) {
            observersCopy.addAll(observers);
            for (int i = 0; i <= observersCopy.size() -1 ; i++) {
                observersCopy.get(i).update(data);
            }
            isChange = false;
        }
    }

    public void notifyObserver(Observer observer) {
        if (isChange) {
            int index = observers.indexOf(observer);
            if (index >= 0) {
                observers.get(index).update(data);
            }
        }
    }

    public void notifyObserver(Observer observer, Object args) {
        if (isChange) {
            //TOOD:VIP，专属订制观察者
        }
    }

    public void setData(Data data) {
        this.data = data;
    }
}
