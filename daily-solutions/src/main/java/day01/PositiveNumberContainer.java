package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> dnumbers = new ArrayList<>();

    public void add(double n){
        dnumbers.add(n);
    }

    public List<Double> getDnumbers() {
        return dnumbers;
    }
}
