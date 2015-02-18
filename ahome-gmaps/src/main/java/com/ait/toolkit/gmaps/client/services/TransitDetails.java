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

public class TransitDetails extends JsObject {

    protected TransitDetails(JavaScriptObject peer) {
        jsObj = peer;
    }

    public TransitDetails() {
        jsObj = JsoHelper.createObject();
    }

    public void setHeadSign(String value) {
        JsoHelper.setAttribute(jsObj, "headsign", value);
    }

    public String getHeadSign() {
        return JsoHelper.getAttribute(jsObj, "headsign");
    }

    public void setArrivalStop(TransitStop value) {
        JsoHelper.setAttribute(jsObj, "arrival_stop", value.getJsObj());
    }

    public TransitStop getArrivalStop() {
        JavaScriptObject jso = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "arrival_stop");
        return new TransitStop(jso);
    }

    public void setArrivalTime(Time value) {
        JsoHelper.setAttribute(jsObj, "arrival_time", value.getJsObj());
    }

    public Time getArrivalTime() {
        JavaScriptObject jso = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "arrival_time");
        return new Time(jso);
    }

    public void setDepartureStop(TransitStop value) {
        JsoHelper.setAttribute(jsObj, "departure_stop", value.getJsObj());
    }

    public TransitStop getDepartureStop() {
        JavaScriptObject jso = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "departure_stop");
        return new TransitStop(jso);
    }

    public void setDepartureTime(Time value) {
        JsoHelper.setAttribute(jsObj, "departure_time", value.getJsObj());
    }

    public Time getDepartureTime() {
        JavaScriptObject jso = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "departure_time");
        return new Time(jso);
    }

    public void setHeadWay(double value) {
        JsoHelper.setAttribute(jsObj, "headway", value);
    }

    public double getHeadWay() {
        return JsoHelper.getAttributeAsDouble(jsObj, "headway");
    }

    public void setLine(TransitLine value) {
        JsoHelper.setAttribute(jsObj, "line", value.getJsObj());
    }

    public TransitLine getLine() {
        JavaScriptObject jso = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "line");
        return new TransitLine(jso);
    }

    public double getNumStops() {
        return JsoHelper.getAttributeAsDouble(jsObj, "num_stops");
    }

    public void setNumStops(TransitLine value) {
        JsoHelper.setAttribute(jsObj, "num_stops", value.getJsObj());
    }
}
