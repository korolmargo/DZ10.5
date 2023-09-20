package org.example;


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStations;

    public Radio() {
        this.maxStations = 10;
    }

    public Radio(int maxStations) {
        if (maxStations > 0) {
            this.maxStations = maxStations;
        } else {
            this.maxStations = 10;
        }
    }
    public void next() {
        if (currentStation != maxStations - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStations - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < maxStations) {
            this.currentStation = currentStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) { 
            this.currentVolume = currentVolume;
        }
    }

}
