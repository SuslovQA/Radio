package org.example.radio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();

        System.out.println(radio.getMaxStation());
    }

}

