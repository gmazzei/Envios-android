package com.aae.envios.util;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by gabriel on 31/05/16.
 */
public class MapUtils {

    public static LatLng getDefaultPosition() {
        return new LatLng(-34.797388, -58.388984);
    }

    public static Integer getDefaultZoom() {
        return 12;
    }

}
