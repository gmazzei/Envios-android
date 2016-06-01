package com.aae.envios.service;

import com.aae.envios.domain.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel on 31/05/16.
 */
public class PointService {

    //Singleton
    private static final PointService INSTANCE = new PointService();
    public static PointService getInstance() { return INSTANCE; }
    private PointService() {}

    public List<Point> getAll() {
        List<Point> pointList = new ArrayList<>();

        pointList.add(new Point(0, "Bynnon 2050", -34.792970, -58.380524));
        pointList.add(new Point(1, "Spiro 920", -34.799752, -58.393118));
        pointList.add(new Point(2, "Martin Rodriguez 800", -34.804247, -58.398591));
        pointList.add(new Point(3, "Segui 498", -34.801767, -58.399419));
        pointList.add(new Point(4, "Cordero 210", -34.796292, -58.399757));
        pointList.add(new Point(5, "J. de Kay 200", -34.802287, -58.405352));

        return pointList;
    }

}
