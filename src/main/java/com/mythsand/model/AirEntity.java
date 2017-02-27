package com.mythsand.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mythsand on 25/02/2017.
 */
@Entity
@Table(name = "air", schema = "winter", catalog = "")
public class AirEntity {
    private String id;
    private String location;
    private Timestamp time;
    private Double aqi;
    private String rank;
    private Double pm25;
    private Double pm10;
    private Double co;
    private Double no2;
    private Double o3;
    private Double so2;
    private String mainPollutant;

    @Basic
    @Id
    @Column(name = "id", nullable = true, length = 255)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 255)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    @Column(name = "aqi", nullable = true, precision = 0)
    public Double getAqi() {
        return aqi;
    }

    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }

    @Basic
    @Column(name = "rank", nullable = true, length = 255)
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "pm25", nullable = true, precision = 0)
    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    @Basic
    @Column(name = "pm10", nullable = true, precision = 0)
    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    @Basic
    @Column(name = "co", nullable = true, precision = 0)
    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    @Basic
    @Column(name = "no2", nullable = true, precision = 0)
    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    @Basic
    @Column(name = "o3", nullable = true, precision = 0)
    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    @Basic
    @Column(name = "so2", nullable = true, precision = 0)
    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    @Basic
    @Column(name = "main_pollutant", nullable = true, length = 255)
    public String getMainPollutant() {
        return mainPollutant;
    }

    public void setMainPollutant(String mainPollutant) {
        this.mainPollutant = mainPollutant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirEntity airEntity = (AirEntity) o;

        if (id != null ? !id.equals(airEntity.id) : airEntity.id != null) return false;
        if (location != null ? !location.equals(airEntity.location) : airEntity.location != null) return false;
        if (time != null ? !time.equals(airEntity.time) : airEntity.time != null) return false;
        if (aqi != null ? !aqi.equals(airEntity.aqi) : airEntity.aqi != null) return false;
        if (rank != null ? !rank.equals(airEntity.rank) : airEntity.rank != null) return false;
        if (pm25 != null ? !pm25.equals(airEntity.pm25) : airEntity.pm25 != null) return false;
        if (pm10 != null ? !pm10.equals(airEntity.pm10) : airEntity.pm10 != null) return false;
        if (co != null ? !co.equals(airEntity.co) : airEntity.co != null) return false;
        if (no2 != null ? !no2.equals(airEntity.no2) : airEntity.no2 != null) return false;
        if (o3 != null ? !o3.equals(airEntity.o3) : airEntity.o3 != null) return false;
        if (so2 != null ? !so2.equals(airEntity.so2) : airEntity.so2 != null) return false;
        if (mainPollutant != null ? !mainPollutant.equals(airEntity.mainPollutant) : airEntity.mainPollutant != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (aqi != null ? aqi.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (pm25 != null ? pm25.hashCode() : 0);
        result = 31 * result + (pm10 != null ? pm10.hashCode() : 0);
        result = 31 * result + (co != null ? co.hashCode() : 0);
        result = 31 * result + (no2 != null ? no2.hashCode() : 0);
        result = 31 * result + (o3 != null ? o3.hashCode() : 0);
        result = 31 * result + (so2 != null ? so2.hashCode() : 0);
        result = 31 * result + (mainPollutant != null ? mainPollutant.hashCode() : 0);
        return result;
    }
}
