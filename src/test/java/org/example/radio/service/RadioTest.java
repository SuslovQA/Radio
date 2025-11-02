package org.example.radio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    //    VolumeTests
    @Test
    public void shouldSetToMaxVolume() {

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {

        radio.setVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToIncreaseVolume() {

        radio.setVolume(17);
        radio.increaseVolume();

        int expected = 18;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotToIncreaseVolumeAboveMax() {

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToDecreaseVolume() {

        radio.setVolume(77);
        radio.decreaseVolume();

        int expected = 76;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {

        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //StationTests
    @Test
    public void shouldSetStation() {

        radio.setStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMinValue() {

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxValue() {

        radio.setStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelow0() {

        radio.setStation(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {

        radio.setStation(7);
        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationAbove9() {

        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStation() {

        radio.setStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationBelow0() {

        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCountStationInConstructor() {
        Radio radio = new Radio(1000);

        radio.setStation(997);

        int expected = 997;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor() {

        radio.setStation(9);
        radio.setVolume(99);
        radio.nextStation();
        radio.increaseVolume();

        System.out.println(radio.getCurrentStation());
        System.out.println(radio.getCurrentVolume());

    }

}

