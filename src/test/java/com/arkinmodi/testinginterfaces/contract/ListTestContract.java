package com.arkinmodi.testinginterfaces.contract;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public interface ListTestContract {

    List<Integer> underTest();

    @Test
    default void testListSize() {
        // Given
        var underTest = underTest();
        underTest.add(1);
        underTest.add(2);

        // When
        var actual = underTest.size();

        // Then
        assertEquals(2, actual);
    }

    @Test
    default void testListSize_EmptyList() {
        var actual = underTest().size();

        assertEquals(0, actual);
    }

    @Test
    default void testListGet() {
        var expected = 1;
        var underTest = underTest();
        underTest.add(expected);

        var actual = underTest.get(0);

        assertEquals(expected, actual);
    }

    @Test
    default void testListGet_EmptyList() {
        assertThrows(IndexOutOfBoundsException.class, () -> underTest().get(0));
    }

}
