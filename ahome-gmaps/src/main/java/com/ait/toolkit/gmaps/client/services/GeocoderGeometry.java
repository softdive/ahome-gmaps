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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.LatLngBounds;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Geometry information about this GeocoderResult
 * 
 */
public class GeocoderGeometry extends JsObject {

    public GeocoderGeometry() {
        jsObj = JsoHelper.createObject();
    }

    public GeocoderGeometry(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The precise bounds of this GeocodeResult, if applicable
     * 
     * @return
     */
    public native LatLngBounds getBounds()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.ait.toolkit.gmaps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The latitude/longitude coordinates of this result
     * 
     * @return
     */
    public native LatLng getLocation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The type of location returned in location
     * 
     * @return
     */
    public GeocoderLocationType getLocationType() {
        return GeocoderLocationType.fromValue(_getLocationType());
    }

    private native String _getLocationType()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.location_type;
    }-*/;

    /**
     * The bounds of the recommended viewport for displaying this GeocodeResult
     * 
     * @return
     */
    public native LatLngBounds getViewport()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.viewport;
		var toReturn = @com.ait.toolkit.gmaps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
