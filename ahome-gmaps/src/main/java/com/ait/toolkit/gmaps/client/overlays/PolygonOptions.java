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

package com.ait.toolkit.gmaps.client.overlays;

import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.MVCArray;
import com.google.gwt.core.client.JavaScriptObject;

public class PolygonOptions extends AbstractOption {

    public PolygonOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Indicates whether this Polyline handles click events. Defaults to true.
     * 
     * @param value
     */
    public native void setClickable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    public native boolean isClickable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

    /**
     * Render each edge as a geodesic (a segment of a "great circle"). A
     * geodesic is the shortest path between two points along the surface of the
     * Earth
     * 
     * @param value
     */
    public native void setGeodesic(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.geodesic = value;
    }-*/;

    public native boolean getGeodesic()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.geodesic;
    }-*/;

    /**
     * Sets the path for this Polygon.
     * 
     * @param value
     */
    public void setPaths(List<List<LatLng>> paths) {
        MVCArray array = new MVCArray();
        for (List<LatLng> latlngs : paths) {
            JavaScriptObject subArray = JsoHelper.createObject();
            for (int i = 0; i < latlngs.size(); i++) {
                JsoHelper.setArrayValue(subArray, i, latlngs.get(i).getJsObj());
            }
            array.push(subArray);
        }
        _setPaths(array);
    }

    private native void _setPaths(MVCArray value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setPaths(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * The stroke color. All CSS3 colors are supported except for extended named
     * colors.
     * 
     * @param value
     */
    public native void setStrokeColor(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeColor = value;
    }-*/;

    public native String getStrokeColor()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.strokeColor;
    }-*/;

    /**
     * The stroke opacity between 0.0 and 1.0
     * 
     * @param value
     */
    public native void setStrokeOpacity(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeOpacity = value;
    }-*/;

    public native double getStrokeOpacity()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.strokeOpacity;
    }-*/;

    /**
     * The stroke width in pixels.
     * 
     * @param value
     */
    public native void setStrokeWeight(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeWeight = value;
    }-*/;

    public native double getStrokeWeight()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.strokeWeight;
    }-*/;

    /**
     * The zIndex compared to other polys.
     * 
     * @param value
     */
    public native void setZIndex(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    public native double getZIndex()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.zIndex;
    }-*/;

    public native void setDraggable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.draggable = value;
    }-*/;

    public native void setEditable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.editable = value;
    }-*/;

    public native void setFillColor(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fillColor = value;
    }-*/;

    public native void setFillOpacity(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fillOpacity = value;
    }-*/;

    public native void setMap(GMap value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.map = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setVisible(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.visible = value;
    }-*/;

    public void setStrokePosition(StrokePosition position) {
        JsoHelper.setAttribute(jsObj, "strokePosition", position.getValue());
    }
}
