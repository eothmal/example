package com.mycompany.c.custom.k.eleventh.readonly;

import com.mycompany.c.custom.k.eleventh.ReadOnly;

public class Main {
    public static void main(String[] args) {

        @NotNull ExtractTransformLoadJob etlJob = new @ReadOnly ExtractTransformLoadJob("sale_data");
        @NotNull WeeklyReportJob weeklyJob = new @ReadOnly WeeklyReportJob("trend_reports");

        System.out.println(etlJob);
        System.out.println(weeklyJob);

    }

}
