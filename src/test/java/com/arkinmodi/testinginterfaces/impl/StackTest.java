package com.arkinmodi.testinginterfaces.impl;

import java.util.List;
import java.util.Stack;

import com.arkinmodi.testinginterfaces.contract.ListTestContract;

public class StackTest implements ListTestContract {

    @Override
    public List<Integer> underTest() {
        return new Stack<>();
    }

}
