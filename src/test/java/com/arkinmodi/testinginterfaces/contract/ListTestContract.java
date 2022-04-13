package com.arkinmodi.testinginterfaces.contract;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
        assertThat(actual).isEqualTo(2);
    }

    @Test
    default void testListSize_EmptyList() {
        var actual = underTest().size();

        assertThat(actual).isEqualTo(0);
    }

    @Test
    default void testListGet() {
        var expected = 1;
        var underTest = underTest();
        underTest.add(expected);

        var actual = underTest.get(0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    default void testListGet_EmptyList() {
        assertThatThrownBy(() -> underTest().get(0)).isInstanceOf(IndexOutOfBoundsException.class);
    }

}
