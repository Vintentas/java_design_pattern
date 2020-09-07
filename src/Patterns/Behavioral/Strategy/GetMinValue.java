package Patterns.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.Collections;

class GetMinValue implements GettingValue {
    ArrayList<Integer> list;

    GetMinValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        return Collections.min(list);
    }
}
