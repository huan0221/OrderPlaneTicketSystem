package cn.edu.hcnu.bean;

import java.util.Set;

public class Order {
        private String id;
        private float jpjg;//机票价格
        private  float airPortTax;//机场税
        private float ryf;//燃油费
        private float hkzhx;//航空综合险
        private float jpgtx;//机票改退险
        private float yhj;//优惠券
        private float hszj;//含税总价
        private Set<Customer> customers;//乘客人数


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJpgtx() {
        return jpgtx;
    }

    public void setJpgtx(float jpgtx) {
        this.jpgtx = jpgtx;
    }

    public float getYhj() {
        return yhj;
    }

    public void setYhj(float yhj) {
        this.yhj = yhj;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
