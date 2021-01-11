import java.util.*;
public class Flight {
    private String id;
    private String form;//出发地
    private String to;//目的地
    private Date formdate;//出发日期
    private String formtime;//起飞时间
    private String totime;//到达时间
    private String planetype;//飞机类型
    private String customertype;//乘客类型：成人，儿童，婴儿

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getFormdate() {
        return formdate;
    }

    public void setFormdate(Date formdate) {
        this.formdate = formdate;
    }

    public String getFormtime() {
        return formtime;
    }

    public void setFormtime(String formtime) {
        this.formtime = formtime;
    }

    public String getTotime() {
        return totime;
    }

    public void setTotime(String totime) {
        this.totime = totime;
    }

    public String getPlanetype() {
        return planetype;
    }

    public void setPlanetype(String planetype) {
        this.planetype = planetype;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }
}
