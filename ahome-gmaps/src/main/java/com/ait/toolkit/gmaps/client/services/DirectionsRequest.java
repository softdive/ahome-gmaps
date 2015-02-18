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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A directions query to be sent to the DirectionsService.
 * 
 */
public class DirectionsRequest extends JsObject {

    public DirectionsRequest() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * If true, instructs the Directions service to avoid highways where
     * possible. Optional.
     * 
     * @param value
     */
    public native void setAvoidHighways(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.avoidHighways = value;
    }-*/;

    public native boolean isAvoidHighways()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.avoidHighways;
    }-*/;

    /**
     * If true, instructs the Directions service to avoid toll roads where
     * possible. Optional.
     * 
     * @param value
     */
    public native void setAvoidTolls(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.avoidTolls = value;
    }-*/;

    public native boolean isAvoidTolls()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.avoidTolls;
    }-*/;

    /**
     * Location of destination. Required.
     * 
     * @param value
     */
    public native void setDestination(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.destination = value;
    }-*/;

    /**
     * Location of destination.Required.
     * 
     * @param value
     */
    public native void setDestination(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.destination = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native LatLng getDestination()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.destination;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Whether or not route alternatives should be provided. Optional.
     * 
     * @param value
     */
    public native void setProvideRouteAlternatives(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.provideRouteAlternatives = value;
    }-*/;

    public native boolean providesRouteAlternatives()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.provideRouteAlternatives;
    }-*/;

    /**
     * If set to true, the DirectionService will attempt to re-order the
     * supplied intermediate waypoints to minimize overall cost of the route. If
     * waypoints are optimized, inspect DirectionsRoute.getWaypointOrder() in
     * the response to determine the new ordering.
     * 
     * @param value
     */
    public native void setOptimizeWaypoints(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.optimizeWaypoints = value;
    }-*/;

    public native boolean optimizeWaypoints()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.optimizeWaypoints;
    }-*/;

    /**
     * Origin of destination. Required.
     * 
     * @param value
     */
    public native void setOrigin(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.origin = value;
    }-*/;

    /**
     * Location of destination.Required.
     * 
     * @param value
     */
    public native void setOrigin(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.origin = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    public native LatLng getOrigin()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.origin;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Region code used as a bias for geocoding requests. Optional.
     * 
     * @param value
     */
    public native void setRegion(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.region = value;
    }-*/;

    public native String getRegion()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.region;
    }-*/;

    public void setTransitionOptions(TransitOptions options) {
        JsoHelper.setAttribute(jsObj, "transitOption", options.getJsObj());
    }

    public native TransitOptions getTransitOptions()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.transitOptons;
		return @com.ait.toolkit.gmaps.client.services.TransitOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * AnimationType of routing requested. Required.
     * 
     * @param mode
     */
    public void setTravelMode(TravelMode mode) {
        setTravelMode(mode.getValue());
    }

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

    /**
     * Preferred unit system to use when displaying distance. Defaults to the
     * unit system used in the country of origin.
     * 
     * @param system
     */

    public void setUnitSystem(UnitSystem system) {
        setUnitSystem(system.getValue());
    }

    private native void setUnitSystem(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.unitSystem = value;
    }-*/;

    public UnitSystem getUnitSystem() {
        return UnitSystem.fromValue(_getUnitSystem());
    }

    private native String _getUnitSystem()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.unitSystem;
    }-*/;

    /**
     * Array of intermediate waypoints. Directions will be calculated from the
     * origin to the destination by way of each waypoint in this array.
     * Optional.
     * 
     * @param wayPoints
     */
    public void setWayPoints(ArrayList<DirectionsWaypoint> wayPoints) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsWaypoint wayPoint : wayPoints) {
            values.push(wayPoint.getJsObj());
        }
        _setWayPoints(values);
    }

    public void setWayPoints(DirectionsWaypoint... wayPoints) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsWaypoint wayPoint : wayPoints) {
            values.push(wayPoint.getJsObj());
        }
        _setWayPoints(values);
    }

    private native void _setWayPoints(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.wayPoints = values;
    }-*/;

    public ArrayList<DirectionsWaypoint> getWayPoints() {
        ArrayList<DirectionsWaypoint> result = new ArrayList<DirectionsWaypoint>();
        JsArray<JavaScriptObject> values = _getWayPoints();
        for (int i = 0; i < values.length(); i++) {
            result.add(new DirectionsWaypoint(values.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getWayPoints()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.wayPoints;
    }-*/;

}
