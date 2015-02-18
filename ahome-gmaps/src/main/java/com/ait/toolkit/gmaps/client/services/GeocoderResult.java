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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * A single geocoder result retrieved from the geocode server. A geocode request
 * may return multiple result objects. Note that though jso result is
 * "JSON-like," it is not strictly JSON, as it indirectly includes a LatLng
 * object.
 * 
 */
public class GeocoderResult extends JsObject {

    public GeocoderResult() {
        jsObj = JsoHelper.createObject();
    }

    public GeocoderResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ArrayList<GeocoderAddressComponent> getAddressComponents() {
        ArrayList<GeocoderAddressComponent> result = new ArrayList<GeocoderAddressComponent>();
        JsArray<JavaScriptObject> array = _getAddressComponents();
        for (int i = 0; i < array.length(); i++) {
            result.add(new GeocoderAddressComponent(array.get(i)));
        }
        return result;

    }

    private native JsArray<JavaScriptObject> _getAddressComponents()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.address_components;
    }-*/;

    /**
     * A string containing the human-readable address of jso location.
     * 
     * @return
     */
    public native String getFormattedAdrress()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.formatted_adrress;
    }-*/;

    /**
     * 
     * @return
     */
    public native GeocoderGeometry getGeometry()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.geometry;
		var toReturn = @com.ait.toolkit.gmaps.client.services.GeocoderGeometry::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * An array of strings denoting the type of the returned geocoded element. A
     * type consists of a unique string identifying the geocode result. (For
     * example, "administrative_area_level_1", "country", etc.)
     * 
     * @return
     */
    public native JsArrayString getTypes()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.types;
    }-*/;

}
