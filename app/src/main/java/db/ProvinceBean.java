package db;

import java.io.Serializable;

/**
 * @description: 省份
 * @Author zsj on 2016/12/17 16:49.
 */

public class ProvinceBean implements Serializable {

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_code() {
        return pro_code;
    }

    public void setPro_code(String pro_code) {
        this.pro_code = pro_code;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_name2() {
        return pro_name2;
    }

    public void setPro_name2(String pro_name2) {
        this.pro_name2 = pro_name2;
    }

    public  ProvinceBean(int pro_id, String pro_code, String pro_name, String pro_name2) {
        this.pro_id = pro_id;
        this.pro_code = pro_code;
        this.pro_name = pro_name;
        this.pro_name2 = pro_name2;

    }

    private int pro_id;//省份id
    private String pro_code;//城市编码
    private String pro_name;//省份名称
    private String pro_name2;//省份别称
}
