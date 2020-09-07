package Patterns.Behavioral.Strategy;

import java.util.ArrayList;

class GetSumValue implements GettingValue {
    ArrayList<Integer> list;

    GetSumValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
