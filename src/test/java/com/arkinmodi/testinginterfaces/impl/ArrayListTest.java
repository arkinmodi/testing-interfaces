package com.arkinmodi.testinginterfaces.impl;

import java.util.ArrayList;
import java.util.List;

import com.arkinmodi.testinginterfaces.contract.ListTestContract;

public class ArrayListTest implements ListTestContract {

    @Override
    public List<Integer> underTest() {
        return new ArrayList<>();
    }

}
