package com.ffo.pattern.observer.model;

/**
 * @author: huchunhua
 * @create_time: 2018/6/4 11:06
 * @change_time:
 * @package: com.ffo.pattern.observer.model
 * @project: pattern
 * @mail: huachunhu@qq.com
 * @describe: 一句话描述
 */
public class Data {
    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public Data setTemperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    public int getHumidity() {
        return humidity;
    }

    public Data setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }
}
