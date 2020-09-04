package com.mycompany.c.custom.k.eleventh.readonly;

public class WeeklyReportJob {

    private String name;

    public WeeklyReportJob(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeeklyReportJob{" +
                "name='" + name + '\'' +
                '}';
    }
}
