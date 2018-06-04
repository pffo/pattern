package com.ffo.pattern.observer;

import com.ffo.pattern.observer.model.Data;

/**
 * @author: huchunhua
 * @create_time: 2018/6/4 11:15
 * @change_time:
 * @package: com.ffo.pattern.observer
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 一句话描述
 */
public class Test {
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        new TemperatureObserver(weatherData);
        new HumidityObserver(weatherData);
        //以上方式让观察者持有被观察者的引用，让观察者自身可对注册/移除进行操作
//        weatherData.registerObserver(new TemperatureObserver());
//        weatherData.registerObserver(new HumidityObserver());


        //模拟数据的改变
        weatherData.setData(new Data().setTemperature(12).setHumidity(21));
        weatherData.setChange();
        //通知所有观察者新的数据
        weatherData.notifyObservers();

    }
}
