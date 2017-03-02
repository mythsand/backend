package com.mythsand.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mythsand on 02/03/2017.
 */
@Entity
@Table(name = "economy", schema = "winter", catalog = "")
public class EconomyEntity {
    private int id;
    private Timestamp time;
    private String gdp;
    private String nationalIn;
    private String industryPr;
    private String tertiaryIn;
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
    @Column(name = "gdp", nullable = true, length = 255)
    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

    @Basic
    @Column(name = "NationalIn", nullable = true, length = 255)
    public String getNationalIn() {
        return nationalIn;
    }

    public void setNationalIn(String nationalIn) {
        this.nationalIn = nationalIn;
    }

    @Basic
    @Column(name = "IndustryPr", nullable = true, length = 255)
    public String getIndustryPr() {
        return industryPr;
    }

    public void setIndustryPr(String industryPr) {
        this.industryPr = industryPr;
    }

    @Basic
    @Column(name = "TertiaryIn", nullable = true, length = 255)
    public String getTertiaryIn() {
        return tertiaryIn;
    }

    public void setTertiaryIn(String tertiaryIn) {
        this.tertiaryIn = tertiaryIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EconomyEntity that = (EconomyEntity) o;

        if (id != that.id) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (gdp != null ? !gdp.equals(that.gdp) : that.gdp != null) return false;
        if (nationalIn != null ? !nationalIn.equals(that.nationalIn) : that.nationalIn != null) return false;
        if (industryPr != null ? !industryPr.equals(that.industryPr) : that.industryPr != null) return false;
        if (tertiaryIn != null ? !tertiaryIn.equals(that.tertiaryIn) : that.tertiaryIn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (gdp != null ? gdp.hashCode() : 0);
        result = 31 * result + (nationalIn != null ? nationalIn.hashCode() : 0);
        result = 31 * result + (industryPr != null ? industryPr.hashCode() : 0);
        result = 31 * result + (tertiaryIn != null ? tertiaryIn.hashCode() : 0);
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
