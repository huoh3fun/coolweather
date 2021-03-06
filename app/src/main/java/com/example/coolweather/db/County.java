package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hp on 2020/5/19.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int countyCode;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public int getCityId() {
        return cityId;
    }
}
