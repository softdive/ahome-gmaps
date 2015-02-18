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

public class TransitStop extends JsObject {

    protected TransitStop(JavaScriptObject peer) {
        jsObj = peer;
    }

    public TransitStop() {
        jsObj = JsoHelper.createObject();
    }

    public void setName(String value) {
        JsoHelper.setAttribute(jsObj, "name", value);
    }

    public String getName() {
        return JsoHelper.getAttribute(jsObj, "name");
    }

    public void setLocation(LatLng value) {
        JsoHelper.setAttribute(jsObj, "location", value.getJsObj());
    }

    public LatLng getLocation() {
        JavaScriptObject jso = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "location");
        return new LatLng(jso);
    }
}
