package com.aae.envios.domain;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by gabriel on 31/05/16.
 */
public class Point {

    private Integer id;
    private String name;
    private Double latitude;
    private Double longitude;


    public Point(Integer id, String name, Double latitude, Double longitude) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }



    public LatLng getPosition() {
        return new LatLng(this.latitude, this.longitude);
    }

    @Override
    public String toString() {
        return this.name;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
