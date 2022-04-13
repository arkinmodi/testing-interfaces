package com.arkinmodi.testinginterfaces.impl;

import java.util.LinkedList;
import java.util.List;

import com.arkinmodi.testinginterfaces.contract.ListTestContract;

public class LinkedListTest implements ListTestContract {

    @Override
    public List<Integer> underTest() {
        return new LinkedList<>();
    }

}
