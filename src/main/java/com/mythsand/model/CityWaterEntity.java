package com.mythsand.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by mythsand on 02/03/2017.
 */
@Entity
@Table(name = "city_water", schema = "winter", catalog = "")
public class CityWaterEntity {
    private String province;
    private String city;
    private String longitude;
    private String latitude;
    private String waterPoint;
    private String pinyin;
//    private Collection<WaterEntity> watersByWaterPoint;
    private Collection<WaterEntity> WaterByPoint;

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

    @Id
    @Column(name = "water_point", nullable = false, length = 255)
    public String getWaterPoint() {
        return waterPoint;
    }

    public void setWaterPoint(String waterPoint) {
        this.waterPoint = waterPoint;
    }

    @Basic
    @Column(name = "pinyin", nullable = true, length = 255)
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

        CityWaterEntity that = (CityWaterEntity) o;

        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (waterPoint != null ? !waterPoint.equals(that.waterPoint) : that.waterPoint != null) return false;
        if (pinyin != null ? !pinyin.equals(that.pinyin) : that.pinyin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = province != null ? province.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (waterPoint != null ? waterPoint.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "cityWaterByWaterPoint")
//    public Collection<WaterEntity> getWatersByWaterPoint() {
//        return watersByWaterPoint;
//    }
//
//    public void setWatersByWaterPoint(Collection<WaterEntity> watersByWaterPoint) {
//        this.watersByWaterPoint = watersByWaterPoint;
//    }

    @OneToMany(mappedBy = "cityByPoint")
    public Collection<WaterEntity> getWaterByPoint() {
        return WaterByPoint;
    }

    public void setWaterByPoint(Collection<WaterEntity> waterByPoint) {
        WaterByPoint = waterByPoint;
    }
}
