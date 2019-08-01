package org.nz.springall_start_demo.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;
    private String sno;
    private String sname;
    private String ssex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
