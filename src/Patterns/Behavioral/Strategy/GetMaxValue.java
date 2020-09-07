package Patterns.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.Collections;

class GetMaxValue implements GettingValue {
    ArrayList<Integer> list;

    GetMaxValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        return Collections.max(list);
    }
}
