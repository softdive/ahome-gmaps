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

public class TransitVehicle extends JsObject {

    protected TransitVehicle(JavaScriptObject peer) {
        jsObj = peer;
    }

    public TransitVehicle() {
        jsObj = JsoHelper.createObject();
    }

    public void setIcon(String value) {
        JsoHelper.setAttribute(jsObj, "icon", value);
    }

    public String getIcon() {
        return JsoHelper.getAttribute(jsObj, "icon");
    }

    public void setLocalIcon(String value) {
        JsoHelper.setAttribute(jsObj, "local_icon", value);
    }

    public String getLocalIcon() {
        return JsoHelper.getAttribute(jsObj, "local_icon");
    }

    public void setName(String value) {
        JsoHelper.setAttribute(jsObj, "name", value);
    }

    public String getName() {
        return JsoHelper.getAttribute(jsObj, "name");
    }

    public void setType(VehicleType type) {
        JsoHelper.setAttribute(jsObj, "type", type.getValue());
    }

    public VehicleType getType() {
        return VehicleType.fromValue(JsoHelper.getAttribute(jsObj, "type"));
    }
}
