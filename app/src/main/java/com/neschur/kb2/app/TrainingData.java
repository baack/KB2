package com.neschur.kb2.app;

public class TrainingData {
    private boolean step1 = false;
    private boolean step2 = true;
    private boolean cities = true;

    public boolean step1Did() {
        return step1;
    }

    public void doneStep1() {
        this.step1 = true;
        this.step2 = false;
    }

    public boolean step2Did() {
        return step2;
    }

    public void doneStep2() {
        this.step2 = true;
        this.cities = false;
    }

    public boolean citiesDid() {
        return cities;
    }

    public void doneCities() {
        this.cities = true;
    }
}