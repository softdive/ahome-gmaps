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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.geom.Point;
import com.google.gwt.core.client.JavaScriptObject;

public class Symbol extends JsObject {

    public Symbol() {
        jsObj = JsoHelper.createObject();
    }

    protected Symbol(JavaScriptObject obj) {
        super(obj);
    }

    public native void setAnchor(Point value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.anchor = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setFillColor(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fillColor = value;
    }-*/;

    public native void setFillOpacity(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fillOpacity = value;
    }-*/;

    public native void setPath(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.path = value;
    }-*/;

    public void setPath(SymbolPath path) {
        setPath(path.getValue());
    }

    public native void setRotation(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rotation = value;
    }-*/;

    public native void setScale(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scale = value;
    }-*/;

    public native void setStrockeColor(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strockeColor = value;
    }-*/;

    public native void setStrokeOpacity(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeOpacitiy = value;
    }-*/;

    public native void setStrokeWeight(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeWeight = value;
    }-*/;

}
