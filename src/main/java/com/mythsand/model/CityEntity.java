package com.mythsand.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by mythsand on 02/03/2017.
 */
@Entity
@Table(name = "city", schema = "winter")
public class CityEntity implements Serializable {
    private String province;
    private String city;
    private String longitude;
    private String latitude;
    private String pinyin;
//    private Collection<EconomyEntity> economiesByCity;
//    private Collection<WeatherEntity> weathersByCity;
//    private Collection<EconomyEntity> EconomyByCity;
//    private Collection<WeatherEntity> WeatherByCity;
//    @OneToMany(mappedBy = "CityByCity")
//    public Collection<EconomyEntity> getEconomyByCity() {
//        return EconomyByCity;
//    }
//
//    public void setEconomyByCity(Collection<EconomyEntity> economyByCity) {
//        EconomyByCity = economyByCity;
//    }
//
//    @OneToMany(mappedBy = "CityByCity")
//    public Collection<WeatherEntity> getWeatherByCity() {
//        return WeatherByCity;
//    }
//
//    public void setWeatherByCity(Collection<WeatherEntity> weatherByCity) {
//        WeatherByCity = weatherByCity;
//    }
//    private WeatherEntity CityByWea;

    @Basic
    @Column(name = "province", nullable = true, length = 255)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 255)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "longitude", nullable = true, length = 255)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, length = 255)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Id
    @Column(name = "pinyin", nullable = false, length = 255)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (pinyin != null ? !pinyin.equals(that.pinyin) : that.pinyin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = province != null ? province.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "cityByCity")
//    public Collection<EconomyEntity> getEconomiesByCity() {
//        return economiesByCity;
//    }
//
//    public void setEconomiesByCity(Collection<EconomyEntity> economiesByCity) {
//        this.economiesByCity = economiesByCity;
//    }
//
//    @JsonIgnore
//    @OneToMany(mappedBy = "cityByCity")
//    public Collection<WeatherEntity> getWeathersByCity() {
//        return weathersByCity;
//    }
//
//    public void setWeathersByCity(Collection<WeatherEntity> weathersByCity) {
//        this.weathersByCity = weathersByCity;
//    }

//    @ManyToOne
//    @JoinColumn(name = "pinyin", referencedColumnName = "city")
//    public WeatherEntity getCityByWea() {
//        return CityByWea;
//    }
//
//    public void setCityByWea(WeatherEntity cityByWea) {
//        CityByWea = cityByWea;
//    }
}
