package cn.edu.hcnu.bean;

import java.util.*;
public class Flight {
    private String id;
    private String flightId;
    private String planetype;//飞机类型
    private int dangqianSeatsNum;//当前座位数
    private String form;//出发地
    private String to;//目的地
    private String formtime;//起飞时间


    public Flight(String flightId, String planetype, int dangqianSeatsNum, String form, String to, String formtime) {
        this.flightId = flightId;
        this.planetype = planetype;
        this.dangqianSeatsNum = dangqianSeatsNum;
        this.form = form;
        this.to = to;
        this.formtime = formtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlanetype() {
        return planetype;
    }

    public void setPlanetype(String planetype) {
        this.planetype = planetype;
    }

    public int getDangqianSeatsNum() {
        return dangqianSeatsNum;
    }

    public void setDangqianSeatsNum(int dangqianSeatsNum) {
        this.dangqianSeatsNum = dangqianSeatsNum;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


    public String getFormtime() {
        return formtime;
    }

    public void setFormtime(String formtime) {
        this.formtime = formtime;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", planetype='" + planetype + '\'' +
                ", dangqianSeatsNum=" + dangqianSeatsNum +
                ", form='" + form + '\'' +
                ", to='" + to + '\'' +
                ", formtime='" + formtime + '\'' +
                '}';
    }
}
