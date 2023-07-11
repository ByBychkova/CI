package ru.netology.stat;

import ru.netology.statistic.StatisticsService;

public class Main {
    public static void main(String[] args) {
        StatisticsService service= new StatisticsService();

        long currentMax = service.findMax(incomes);
        System.out.println(currentMax);
    }
}