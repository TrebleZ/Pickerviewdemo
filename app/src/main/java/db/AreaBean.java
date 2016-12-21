package db;

import java.io.Serializable;

/**
 * @description:地区
 * @Author zsj on 2016/12/17 16:56.
 */

public class AreaBean implements Serializable {
    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public AreaBean(int areaid, int cityid, String name, String citycode) {
        this.areaid = areaid;
        this.citycode = citycode;
        this.cityid = cityid;
        this.name = name;
    }

    private int areaid;//地区id
    private int cityid;//城市id
    private String name;//名称
    private String citycode;//城市编码
}
