package com.mycompany.c.custom.k.eleventh.notnull;

public class Main {
    public static void main(String[] args) {

        @NotNull ExtractTransformLoadJob etlJob = new ExtractTransformLoadJob("sale_data");
        @NotNull WeeklyReportJob weeklyJob = new WeeklyReportJob("trend_reports");

        System.out.println(etlJob);
        System.out.println(weeklyJob);

    }

}
