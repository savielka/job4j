package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int max1_2 = ((first > second) ? first : second);
        return ((max1_2 > third) ? max1_2 : third);
    }
}