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
import com.google.gwt.core.client.JsDate;

/**
 * The TransitOptions object to be included in a DirectionsRequest when the
 * travel mode is set to TRANSIT.
 */
public class TransitOptions extends JsObject {

    protected TransitOptions(JavaScriptObject peer) {
        jsObj = peer;
    }

    public TransitOptions() {
        jsObj = JsoHelper.createObject();
    }

    public void setArrivalTime(JsDate value) {
        JsoHelper.setAttribute(jsObj, "arrivalTime", value);
    }

    public void setDepartureTime(JsDate value) {
        JsoHelper.setAttribute(jsObj, "departureTime", value);
    }

    public JsDate getArrivalTime() {
        return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "arrivalTime").cast();
    }

    public JsDate getDepartureTime() {
        return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "departureTime").cast();
    }
}
