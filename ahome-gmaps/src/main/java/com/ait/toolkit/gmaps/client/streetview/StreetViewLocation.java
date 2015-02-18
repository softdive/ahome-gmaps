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
package com.ait.toolkit.gmaps.client.streetview;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of a location in the Street View panorama
 * 
 * 
 */
public class StreetViewLocation extends JsObject {

    public StreetViewLocation() {
        jsObj = JsoHelper.createObject();
    }

    public StreetViewLocation(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A localized string describing the location.
     * 
     * @param value
     */
    public native void setDescription(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.description = value;
    }-*/;

    public native String getDescription()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.description;
    }-*/;

    /**
     * The latlng of the panorama.
     * 
     * @param value
     */
    public native void setLatLgn(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.latLgn = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native LatLng getLatLgn()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.latLgn;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * A unique identifier for the panorama. This is stable within a session but
     * unstable across sessions.
     * 
     * @param value
     */
    public native void setPano(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pano = value;
    }-*/;

    public native String getPano()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pano;
    }-*/;

}
