package org.example.radio.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int countStation = 10;
    private int minStation = 0;
    private int maxStation = countStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;


    @Generated
    public Radio() {
        this.maxStation = this.countStation - 1;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    @Generated
    public Radio(int currentStation, int currentVolume, int countStation, int minStation, int maxStation, int minVolume, int maxVolume) {
        this.maxStation = this.countStation - 1;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.countStation = countStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    @Generated
    public int getCurrentStation() {
        return this.currentStation;
    }

    @Generated
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    @Generated
    public int getCountStation() {
        return this.countStation;
    }

    @Generated
    public int getMinStation() {
        return this.minStation;
    }

    @Generated
    public int getMaxStation() {
        return this.maxStation;
    }

    @Generated
    public int getMinVolume() {
        return this.minVolume;
    }

    @Generated
    public int getMaxVolume() {
        return this.maxVolume;
    }

    @Generated
    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    @Generated
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    @Generated
    public void setCountStation(int countStation) {
        this.countStation = countStation;
    }

    @Generated
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    @Generated
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    @Generated
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    @Generated
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else if (this.getCountStation() != other.getCountStation()) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getMinVolume() != other.getMinVolume()) {
                return false;
            } else {
                return this.getMaxVolume() == other.getMaxVolume();
            }
        }
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    @Generated
    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getCountStation();
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getMinVolume();
        result = result * 59 + this.getMaxVolume();
        return result;
    }

    @Generated
    public String toString() {
        int var10000 = this.getCurrentStation();
        return "Radio(currentStation=" + var10000 + ", currentVolume=" + this.getCurrentVolume() + ", countStation=" + this.getCountStation() + ", minStation=" + this.getMinStation() + ", maxStation=" + this.getMaxStation() + ", minVolume=" + this.getMinVolume() + ", maxVolume=" + this.getMaxVolume() + ")";
    }
}

