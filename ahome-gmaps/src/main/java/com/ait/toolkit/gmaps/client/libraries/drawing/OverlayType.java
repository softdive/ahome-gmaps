/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.gmaps.client.libraries.drawing;

public enum OverlayType {

    /**
     * Specifies that the DrawingManager creates circles, and that the overlay
     * given in the overlaycomplete event is a circle.
     */
    CIRCLE,

    /**
     * Specifies that the DrawingManager creates markers, and that the overlay
     * given in the overlaycomplete event is a marker.
     */
    MARKER,

    /**
     * Specifies that the DrawingManager creates polygons, and that the overlay
     * given in the overlaycomplete event is a polygon.
     */
    POLYGON,

    /**
     * Specifies that the DrawingManager creates polylines, and that the overlay
     * given in the overlaycomplete event is a polyline.
     */
    POLYLINE,

    /**
     * Specifies that the DrawingManager creates rectangles, and that the
     * overlay given in the overlaycomplete event is a rectangle.
     */
    RECTANGLE;

    public String value() {
        return name().toLowerCase();
    }

    public static OverlayType fromValue(String type) {
        return valueOf(type.toUpperCase());
    }

    public String toString() {
        return name();
    }

}
