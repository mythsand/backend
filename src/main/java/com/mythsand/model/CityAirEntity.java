package com.mythsand.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by mythsand on 02/03/2017.
 */
@Entity
@Table(name = "city_air", schema = "winter", catalog = "")
public class CityAirEntity {
    private String province;
    private String city;
    private String longitude;
    private String latitude;
    private String pinyin;
    private String airPoint;
    private Collection<AirEntity> AirByPoint;
//    private Collection<AirEntity> airsByAirPoint;

    @Basic
    @Column(name = "province", nullable = true, length = 255)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 255)
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

    @Basic
    @Column(name = "pinyin", nullable = true, length = 255)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Id
    @Column(name = "air_point", nullable = false, length = 255)
    public String getAirPoint() {
        return airPoint;
    }

    public void setAirPoint(String airPoint) {
        this.airPoint = airPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityAirEntity that = (CityAirEntity) o;

        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (pinyin != null ? !pinyin.equals(that.pinyin) : that.pinyin != null) return false;
        if (airPoint != null ? !airPoint.equals(that.airPoint) : that.airPoint != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = province != null ? province.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        result = 31 * result + (airPoint != null ? airPoint.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cityByPoint")
    public Collection<AirEntity> getAirByPoint() {
        return AirByPoint;
    }

    public void setAirByPoint(Collection<AirEntity> airByPoint) {
        AirByPoint = airByPoint;
    }

//    @OneToMany(mappedBy = "cityAirByAirPoint")
//    public Collection<AirEntity> getAirsByAirPoint() {
//        return airsByAirPoint;
//    }
//
//    public void setAirsByAirPoint(Collection<AirEntity> airsByAirPoint) {
//        this.airsByAirPoint = airsByAirPoint;
//    }
}
