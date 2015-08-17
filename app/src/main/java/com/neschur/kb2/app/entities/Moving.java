package com.neschur.kb2.app.entities;

import com.neschur.kb2.app.models.MapPoint;

public interface Moving {
    void moveInDirection(MapPoint point);

    void moveInRandomDirection();

    boolean canMoveTo(MapPoint point);
}
