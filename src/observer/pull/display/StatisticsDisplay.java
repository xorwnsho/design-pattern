package observer.pull.display;

import observer.pull.DisplayElement;
import observer.pull.Observer;
import observer.pull.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200f; // 처음에 갱신되기 쉽게 높은 값으로 초기화
    private float tempSum = 0.0f;
    private int numReadings = 0;  // 측정 횟수
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
