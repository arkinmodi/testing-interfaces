package com.arkinmodi.testinginterfaces.impl;

import java.util.List;
import java.util.Vector;

import com.arkinmodi.testinginterfaces.contract.ListTestContract;

public class VectorTest implements ListTestContract {

    @Override
    public List<Integer> underTest() {
        return new Vector<>();
    }

}
