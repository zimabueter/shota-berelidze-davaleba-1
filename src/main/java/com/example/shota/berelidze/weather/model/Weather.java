package com.example.shota.berelidze.weather.model;

public class Weather {

    private int temperature;
    private String cityName;
    private int windSpeed;
    private int humidity;
    private int pressure;


    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }



    public Weather() {
    }

    public Weather(int temperature, String cityName, int windSpeed,int humidity , int pressure) {
        this.temperature = temperature;
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.pressure = pressure;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }


    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", cityName='" + cityName + '\'' +
                ", windSpeed=" + windSpeed +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

}
