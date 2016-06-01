package com.aae.envios;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.aae.envios.domain.Point;
import com.aae.envios.service.PointService;
import com.aae.envios.util.MapUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        activateMyLocationLayer();
        setPositionAndZoom(MapUtils.getDefaultPosition(), MapUtils.getDefaultZoom());

        PointService pointService = PointService.getInstance();
        List<Point> points = pointService.getAll();
        draw(points);
    }

    private void activateMyLocationLayer() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }
    }

    private void setPositionAndZoom(LatLng position, Integer zoom) {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, zoom));
    }


    public void draw(List<Point> points) {
        for (Point point : points) {
            MarkerOptions options = new MarkerOptions()
                    .title(point.getName())
                    .position(point.getPosition());

            mMap.addMarker(options);
        }
    }



}
