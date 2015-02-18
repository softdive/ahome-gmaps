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

import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.gmaps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class Spherical {

    private Spherical() {

    }

    public static double computeArea(List<LatLng> paths) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _computeArea(peers);
    }

    public static double computeArea(List<LatLng> paths, double radius) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _computeArea(peers, radius);
    }

    public static double computeArea(LatLng... paths) {
        return computeArea(Arrays.asList(paths));
    }

    public static double computeArea(double radius, LatLng... paths) {
        return computeArea(Arrays.asList(paths), radius);
    }

    public static double computeSignedArea(List<LatLng> paths) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _computeSignedArea(peers);
    }

    public static double computeSignedArea(List<LatLng> paths, double radius) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _computeSignedArea(peers, radius);
    }

    public static double computeSignedArea(LatLng... paths) {
        return computeSignedArea(Arrays.asList(paths));
    }

    public static double computeSignedArea(double radius, LatLng... paths) {
        return computeSignedArea(Arrays.asList(paths), radius);
    }

    public static double computeLength(List<LatLng> paths) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _computeLength(peers);
    }

    public static double computeLength(List<LatLng> paths, double radius) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _computeLength(peers, radius);
    }

    public static double computeLength(double radius, LatLng... paths) {
        return computeLength(Arrays.asList(paths), radius);
    }

    public static native double computeDistanceBetween(LatLng from, LatLng to)/*-{
		return $wnd.google.maps.geometry.spherical
				.computeDistanceBetween(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						to.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public static native double computeHeading(LatLng from, LatLng to)/*-{
		return $wnd.google.maps.geometry.spherical
				.computeHeading(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						to.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public static native double computeDistanceBetween(LatLng from, LatLng to, double radius)/*-{
		return $wnd.google.maps.geometry.spherical
				.computeDistanceBetween(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						to.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						radius);
    }-*/;

    public static native LatLng computeOffset(LatLng from, double distance, double heading)/*-{
		var obj = $wnd.google.maps.geometry.spherical
				.computeOffset(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						distance, heading);
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native LatLng computeOffset(LatLng from, double distance, double heading, double radius)/*-{
		var obj = $wnd.google.maps.geometry.spherical
				.computeOffset(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						distance, heading, radius);
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native LatLng computeOffsetOrigin(LatLng from, double distance, double heading)/*-{
		var obj = $wnd.google.maps.geometry.spherical
				.computeOffsetOrigin(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						distance, heading);
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native LatLng computeOffsetOrigin(LatLng from, double distance, double heading, double radius)/*-{
		var obj = $wnd.google.maps.geometry.spherical
				.computeOffsetOrigin(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						distance, heading, radius);
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native LatLng interpolate(LatLng from, LatLng to, double fraction)/*-{
		var obj = $wnd.google.maps.geometry.spherical
				.interpolate(
						from.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						to.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						fraction);
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native double _computeArea(JavaScriptObject paths)/*-{
		return $wnd.google.maps.geometry.spherical.computeArea(paths);
    }-*/;

    private static native double _computeArea(JavaScriptObject paths, double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computeArea(paths, radius);
    }-*/;

    private static native double _computeLength(JavaScriptObject paths, double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computelength(paths, radius);
    }-*/;

    private static native double _computeLength(JavaScriptObject paths)/*-{
		return $wnd.google.maps.geometry.spherical.computelength(paths);
    }-*/;

    private static native double _computeSignedArea(JavaScriptObject paths)/*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(paths);
    }-*/;

    private static native double _computeSignedArea(JavaScriptObject paths, double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(paths,
				radius);
    }-*/;

}
