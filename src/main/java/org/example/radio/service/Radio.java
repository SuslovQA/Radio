package org.example.radio.service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int countStation = 10;
    private int minStation = 0;
    private int maxStation = countStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int countStation) {
        this.countStation = countStation;
        this.maxStation = countStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }


    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}

