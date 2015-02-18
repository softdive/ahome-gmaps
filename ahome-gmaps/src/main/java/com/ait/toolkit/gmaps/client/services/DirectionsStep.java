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
package com.ait.toolkit.gmaps.client.services;

import java.util.ArrayList;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.Distance;
import com.ait.toolkit.gmaps.client.core.Duration;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A single DirectionsStep in a DirectionsResult. Some fields may be undefined.
 * Note that though this object is "JSON-like," it is not strictly JSON, as it
 * directly includes LatLng objects.
 * 
 * 
 */
public class DirectionsStep extends JsObject {

    public DirectionsStep() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionsStep(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The total distance covered by this step. This property may be undefined
     * as the distance may be unknown.
     * 
     * @param value
     */
    public native void setDistance(Distance value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.distance = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    public native Distance getDistance()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.distance;
		var toReturn = @com.ait.toolkit.gmaps.client.core.Distance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The total duration of this step. This property may be undefined as the
     * duration may be unknown.
     * 
     * @param value
     */
    public native void setDuration(Duration value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.duration = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    public native Duration getDuration()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.duration;
		var toReturn = @com.ait.toolkit.gmaps.client.core.Duration::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The ending location of this step.
     * 
     * @param value
     */
    public native void setEndLocation(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this.end_location = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native LatLng getEndLocation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.end_location;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Instructions for this step.
     * 
     * @param value
     */
    public native void setInstructions(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.instructions = value;
    }-*/;

    public native String getInstructions()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.instructions;
    }-*/;

    /**
     * A sequence of LatLngs describing the course of this step.
     * 
     * @param points
     */
    public void setPath(ArrayList<LatLng> points) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : points) {
            values.push(latLgn.getJsObj());
        }
        _setPath(values);
    }

    public void _setPath(LatLng... points) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : points) {
            values.push(latLgn.getJsObj());
        }
        _setPath(values);
    }

    private native void _setViaWaypoints(JsArray<JavaScriptObject> values)/*-{
		this.via_waypoints = values;
    }-*/;

    public ArrayList<LatLng> getPath() {
        ArrayList<LatLng> points = new ArrayList<LatLng>();
        JsArray<JavaScriptObject> array = _getPath();
        for (int i = 0; i < array.length(); i++) {
            points.add(new LatLng(array.get(i)));
        }
        return points;
    }

    private native void _setPath(JsArray<JavaScriptObject> value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.path = value;
    }-*/;

    private native JsArray<JavaScriptObject> _getPath()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.path;
    }-*/;

    /**
     * The starting location of this step.
     * 
     * @param value
     */
    public native void setStartLocation(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.start_location = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    public native LatLng getStartLocation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.start_location;
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The mode of travel used in this step.
     * 
     * @param mode
     */
    public void setTravelMode(TravelMode mode) {
        setTravelMode(mode.getValue());
    }

    public native void setSteps(DirectionsStep value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.steps = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native DirectionsStep getSteps()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.steps;
		return @com.ait.toolkit.gmaps.client.services.DirectionsStep::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setTransit(TransitDetails value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transit = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native TransitDetails getTransit()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.transit;
		return @com.ait.toolkit.gmaps.client.services.TransitDetails::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private native void setTravelMode(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.travelMode = value;
    }-*/;

    public TravelMode getTravelMode() {
        return TravelMode.fromValue(_getTravelMode());
    }

    private native String _getTravelMode()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.travelMode;
    }-*/;

}
