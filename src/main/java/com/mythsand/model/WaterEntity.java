package com.mythsand.model;

import javax.persistence.*;

/**
 * Created by mythsand on 02/03/2017.
 */
@Entity
@Table(name = "water", schema = "winter", catalog = "")
public class WaterEntity {
    private int id;
    private Double ph;
    private Double dO;    //大写的O
    private Double cod;
    private Double nh3N;
    private String toWeek;
    private String preWeek;
//    private CityWaterEntity cityWaterByWaterPoint;
    private CityWaterEntity cityByPoint;
//    private Integer year;
//    private Integer week;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ph", nullable = true, precision = 0)
    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    @Basic
    @Column(name = "d_o", nullable = true, precision = 0)
    public Double getdO() {
        return dO;
    }

    public void setdO(Double dO) {
        this.dO = dO;
    }

    @Basic
    @Column(name = "cod", nullable = true, precision = 0)
    public Double getCod() {
        return cod;
    }

    public void setCod(Double cod) {
        this.cod = cod;
    }

    @Basic
    @Column(name = "nh3_n", nullable = true, precision = 0)
    public Double getNh3N() {
        return nh3N;
    }

    public void setNh3N(Double nh3N) {
        this.nh3N = nh3N;
    }

    @Basic
    @Column(name = "to_week", nullable = true, length = 4)
    public String getToWeek() {
        return toWeek;
    }

    public void setToWeek(String toWeek) {
        this.toWeek = toWeek;
    }

    @Basic
    @Column(name = "pre_week", nullable = true, length = 4)
    public String getPreWeek() {
        return preWeek;
    }

    public void setPreWeek(String preWeek) {
        this.preWeek = preWeek;
    }

//    @ManyToOne
//    @JoinColumn(name = "water_point", referencedColumnName = "water_point")
//    public CityWaterEntity getCityWaterByWaterPoint() {
//        return cityWaterByWaterPoint;
//    }
//
//    public void setCityWaterByWaterPoint(CityWaterEntity cityWaterByWaterPoint) {
//        this.cityWaterByWaterPoint = cityWaterByWaterPoint;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WaterEntity that = (WaterEntity) o;

        if (id != that.id) return false;
        if (ph != null ? !ph.equals(that.ph) : that.ph != null) return false;
        if (dO != null ? !dO.equals(that.dO) : that.dO != null) return false;
        if (cod != null ? !cod.equals(that.cod) : that.cod != null) return false;
        if (nh3N != null ? !nh3N.equals(that.nh3N) : that.nh3N != null) return false;
        if (toWeek != null ? !toWeek.equals(that.toWeek) : that.toWeek != null) return false;
        if (preWeek != null ? !preWeek.equals(that.preWeek) : that.preWeek != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ph != null ? ph.hashCode() : 0);
        result = 31 * result + (dO != null ? dO.hashCode() : 0);
        result = 31 * result + (cod != null ? cod.hashCode() : 0);
        result = 31 * result + (nh3N != null ? nh3N.hashCode() : 0);
        result = 31 * result + (toWeek != null ? toWeek.hashCode() : 0);
        result = 31 * result + (preWeek != null ? preWeek.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "water_point", referencedColumnName = "water_point")
    public CityWaterEntity getCityByPoint() {
        return cityByPoint;
    }

    public void setCityByPoint(CityWaterEntity cityByPoint) {
        this.cityByPoint = cityByPoint;
    }
//
//    @Basic
//    @Column(name = "year", nullable = true)
//    public Integer getYear() {
//        return year;
//    }
//
//    public void setYear(Integer year) {
//        this.year = year;
//    }
//
//    @Basic
//    @Column(name = "week", nullable = true)
//    public Integer getWeek() {
//        return week;
//    }
//
//    public void setWeek(Integer week) {
//        this.week = week;
//    }
}
