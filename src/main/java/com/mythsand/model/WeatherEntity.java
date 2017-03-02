package com.mythsand.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by mythsand on 02/03/2017.
 */
@Entity
@Table(name = "weather", schema = "winter", catalog = "")
public class WeatherEntity {
    private int id;
    private Timestamp time;
    private String weather;
    private Double temperature;
    private String humidity;
    private String visibility;
    private Double windScale;
    private Double windDirDegree;
    private String cloudRate;
    private Double windSpeed;
    private Double windDir;
    private CityEntity cityByCity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "weather", nullable = true, length = 255)
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Basic
    @Column(name = "temperature", nullable = true, precision = 0)
    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "humidity", nullable = true, length = 255)
    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Basic
    @Column(name = "visibility", nullable = true, length = 255)
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Basic
    @Column(name = "wind_scale", nullable = true, precision = 0)
    public Double getWindScale() {
        return windScale;
    }

    public void setWindScale(Double windScale) {
        this.windScale = windScale;
    }

    @Basic
    @Column(name = "wind_dir_degree", nullable = true, precision = 0)
    public Double getWindDirDegree() {
        return windDirDegree;
    }

    public void setWindDirDegree(Double windDirDegree) {
        this.windDirDegree = windDirDegree;
    }

    @Basic
    @Column(name = "cloud_rate", nullable = true, length = 255)
    public String getCloudRate() {
        return cloudRate;
    }

    public void setCloudRate(String cloudRate) {
        this.cloudRate = cloudRate;
    }

    @Basic
    @Column(name = "wind_speed", nullable = true, precision = 0)
    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Basic
    @Column(name = "wind_dir", nullable = true, precision = 0)
    public Double getWindDir() {
        return windDir;
    }

    public void setWindDir(Double windDir) {
        this.windDir = windDir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherEntity that = (WeatherEntity) o;

        if (id != that.id) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (weather != null ? !weather.equals(that.weather) : that.weather != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (humidity != null ? !humidity.equals(that.humidity) : that.humidity != null) return false;
        if (visibility != null ? !visibility.equals(that.visibility) : that.visibility != null) return false;
        if (windScale != null ? !windScale.equals(that.windScale) : that.windScale != null) return false;
        if (windDirDegree != null ? !windDirDegree.equals(that.windDirDegree) : that.windDirDegree != null)
            return false;
        if (cloudRate != null ? !cloudRate.equals(that.cloudRate) : that.cloudRate != null) return false;
        if (windSpeed != null ? !windSpeed.equals(that.windSpeed) : that.windSpeed != null) return false;
        if (windDir != null ? !windDir.equals(that.windDir) : that.windDir != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (weather != null ? weather.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (humidity != null ? humidity.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (windScale != null ? windScale.hashCode() : 0);
        result = 31 * result + (windDirDegree != null ? windDirDegree.hashCode() : 0);
        result = 31 * result + (cloudRate != null ? cloudRate.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        result = 31 * result + (windDir != null ? windDir.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "city", referencedColumnName = "city")
    public CityEntity getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(CityEntity cityByCity) {
        this.cityByCity = cityByCity;
    }
}
