package com.ffo.pattern.observer;

import com.ffo.pattern.observer.model.Data;

/**
 * @author: huchunhua
 * @create_time: 2018/6/4 11:12
 * @change_time:
 * @package: com.ffo.pattern.observer
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 一句话描述
 */
public class HumidityObserver implements Observer , DisplayOperation{
    private Data data;
    private Subject weatherData;

    HumidityObserver(){

    }

    HumidityObserver(Subject weatherData) {
        this.weatherData = weatherData;
        //观察者注册监听
        this.weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Humidity:" + data.getHumidity());
        //观察者取消注册
        weatherData.removeObserver(this);
    }

    public void update(Data data) {
        this.data = data;
        display();
    }
}
