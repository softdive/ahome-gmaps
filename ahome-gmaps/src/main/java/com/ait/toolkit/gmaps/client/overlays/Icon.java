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
import com.ait.toolkit.gmaps.client.geom.Size;
import com.google.gwt.core.client.JavaScriptObject;

public class Icon extends JsObject {

    public Icon() {
        jsObj = JsoHelper.createObject();
    }

    protected Icon(JavaScriptObject obj) {
        super(obj);
    }

    public native void setAnchor(Point value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.anchor = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setOrigin(Point value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.origin = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setScaledSize(Size value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scaledSize = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setSize(Size value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.size = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setUrl(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.url = value;
    }-*/;

}
