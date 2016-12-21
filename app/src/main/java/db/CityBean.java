package db;

import java.io.Serializable;

/**
 * @description: 城市
 * @Author zsj on 2016/12/17 16:53.
 */

public class CityBean implements Serializable {
    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    //构造方法
    public CityBean(int city_id, int province_id, String code, String name, String provincecode) {
        this.city_id = city_id;
        this.province_id = province_id;
        this.code = code;
        this.name = name;
        this.provincecode = provincecode;
    }

    private int city_id;
    private int province_id;
    private String code;
    private String name;
    private String provincecode;
}
