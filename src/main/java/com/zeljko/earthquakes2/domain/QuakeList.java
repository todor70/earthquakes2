package com.zeljko.earthquakes2.domain;

import java.util.ArrayList;
import java.util.List;

public class QuakeList {

   private List<Quake> features;

    public QuakeList() {
        features = new ArrayList<>();
    }

    public List<Quake> getFeatures() {
        return features;
    }

    public void setFeatures(List<Quake> features) {
        this.features = features;
    }
}