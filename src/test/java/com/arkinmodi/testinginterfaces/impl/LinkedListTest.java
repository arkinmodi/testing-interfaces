package com.arkinmodi.testinginterfaces.impl;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arkinmodi.testinginterfaces.contract.ListTestContract;

public class LinkedListTest implements ListTestContract {

    @Override
    public List<Integer> underTest() {

        // Insert implementation specific setup here

        return new LinkedList<>();
    }

    @BeforeEach
    public void setup() {
        // Insert implementation specific setup here
    }

    @Override
    @Test
    public void testListSize() {

        // Insert implementation specific setup here

        ListTestContract.super.testListSize();
    }

}
