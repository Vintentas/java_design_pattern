package Patterns.Behavioral.Strategy;

import java.util.ArrayList;

class GetAvgValue implements GettingValue {
    ArrayList<Integer> list;

    GetAvgValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum/(list.size());
    }
}
