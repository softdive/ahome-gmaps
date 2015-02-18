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
package com.ait.toolkit.gmaps.client.libraries.geometry;

import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.overlays.Polygon;
import com.ait.toolkit.gmaps.client.overlays.Polyline;

/**
 * Utility functions for computations involving polygons and polylines.
 * 
 */
public class Poly {

    private Poly() {

    }

    /**
     * Computes whether the given point lies inside the specified polygon.
     */
    public static native boolean containsLocation(LatLng point, Polygon polygon)/*-{
		return $wnd.google.maps.geometry.poly
				.containsLocation(
						point.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						polygon.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Computes whether the given point lies on or near to a polyline, or the
     * edge of a polygon, within a specified tolerance. Returns true when the
     * difference between the latitude and longitude of the supplied point, and
     * the closest point on the edge, is less than the tolerance. The tolerance
     * defaults to 10-9 degrees.
     */
    public static native boolean isLocationOnEdge(LatLng point, Polygon polygon)/*-{
		return $wnd.google.maps.geometry.poly
				.isLocationOnEdge(
						point.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						polygon.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Computes whether the given point lies on or near to a polyline, or the
     * edge of a polygon, within a specified tolerance. Returns true when the
     * difference between the latitude and longitude of the supplied point, and
     * the closest point on the edge, is less than the tolerance. The tolerance
     * defaults to 10-9 degrees.
     */
    public static native boolean isLocationOnEdge(LatLng point, Polygon polygon, double tolerance)/*-{
		return $wnd.google.maps.geometry.poly
				.isLocationOnEdge(
						point.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						polygon.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						tolerance);
    }-*/;

    /**
     * Computes whether the given point lies on or near to a polyline, or the
     * edge of a polygon, within a specified tolerance. Returns true when the
     * difference between the latitude and longitude of the supplied point, and
     * the closest point on the edge, is less than the tolerance. The tolerance
     * defaults to 10-9 degrees.
     */
    public static native boolean isLocationOnEdge(LatLng point, Polyline polyline)/*-{
		return $wnd.google.maps.geometry.poly
				.isLocationOnEdge(
						point.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						polyline.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Computes whether the given point lies on or near to a polyline, or the
     * edge of a polygon, within a specified tolerance. Returns true when the
     * difference between the latitude and longitude of the supplied point, and
     * the closest point on the edge, is less than the tolerance. The tolerance
     * defaults to 10-9 degrees.
     */
    public static native boolean isLocationOnEdge(LatLng point, Polyline polyline, double tolerance)/*-{
		return $wnd.google.maps.geometry.poly
				.isLocationOnEdge(
						point.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						polyline.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						tolerance);
    }-*/;

}
