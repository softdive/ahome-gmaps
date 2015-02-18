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

/**
 * The specification for a geocoding request to be sent to the Geocoder.
 * 
 */
public class GeocoderRequest extends JsObject {

    public GeocoderRequest() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Address. Optional.
     * 
     * @param value
     */
    public native void setAddress(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.address = value;
    }-*/;

    public native String getAddress()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.address;
    }-*/;

    /**
     * LatLngBounds within which to search. Optional.
     * 
     * @return
     */
    public native LatLngBounds getBounds()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.ait.toolkit.gmaps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setBounds(LatLngBounds value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bounds = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * LatLng about which to search. Optional.
     * 
     * @return
     */
    public native LatLng getLocation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLocation(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.location = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Country code top-level domain within which to search. Optional.
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

}
