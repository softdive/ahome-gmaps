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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A single address component within a GeocoderResult. A full address may
 * consist of multiple address components
 */
public class GeocoderAddressComponent extends JsObject {

    public GeocoderAddressComponent() {
        jsObj = JsoHelper.createObject();
    }

    public GeocoderAddressComponent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The full text of the address component
     * 
     * @return
     */
    public native String getLongName()/*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.long_name;
    }-*/;

    /**
     * The abbreviated, short text of the given address component
     * 
     * @return
     */
    public native String getShortName()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.short_name;
    }-*/;

    /**
     * An array of strings denoting the type of jso address component
     * 
     * @return
     */
    public native JsArrayString getTypes()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.types;
    }-*/;

}
