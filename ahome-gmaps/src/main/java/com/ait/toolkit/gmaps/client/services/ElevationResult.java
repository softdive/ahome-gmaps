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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The result of an ElevationService request, consisting of the set of elevation
 * coordinates and their elevation values. Note that a single request may
 * produce multiple ElevationResults.
 * 
 */
public class ElevationResult extends JsObject {

    public ElevationResult() {
        jsObj = JsoHelper.createObject();
    }

    public ElevationResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The location of this elevation result.
     * 
     * @param value
     */

    public final native void setLocation(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.location = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native LatLng geLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The elevation of this point on Earth, in meters above sea level.
     * 
     * @param value
     */
    public final native void setElevation(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.elevation = value;
    }-*/;

    public final native double getElevation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.elevation;
    }-*/;

}
