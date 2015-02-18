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
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class TransitLine extends JsObject {

    protected TransitLine(JavaScriptObject peer) {
        jsObj = peer;
    }

    public TransitLine() {
        jsObj = JsoHelper.createObject();
    }

    public void setColor(String value) {
        JsoHelper.setAttribute(jsObj, "color", value);
    }

    public String getColor() {
        return JsoHelper.getAttribute(jsObj, "color");
    }

    public void setIcon(String value) {
        JsoHelper.setAttribute(jsObj, "icon", value);
    }

    public String geIcon() {
        return JsoHelper.getAttribute(jsObj, "icon");
    }

    public void setName(String value) {
        JsoHelper.setAttribute(jsObj, "name", value);
    }

    public String getName() {
        return JsoHelper.getAttribute(jsObj, "name");
    }

    public void setShortName(String value) {
        JsoHelper.setAttribute(jsObj, "short_name", value);
    }

    public String getShortName() {
        return JsoHelper.getAttribute(jsObj, "short_name");
    }

    public void setTextColor(String value) {
        JsoHelper.setAttribute(jsObj, "text_color", value);
    }

    public String getTextColor() {
        return JsoHelper.getAttribute(jsObj, "text_color");
    }

    public void setUrl(String value) {
        JsoHelper.setAttribute(jsObj, "url", value);
    }

    public String getUrl() {
        return JsoHelper.getAttribute(jsObj, "url");
    }

    public void setVehicle(VehicleType type) {
        JsoHelper.setAttribute(jsObj, "vehicle", type.getValue());
    }

    public VehicleType getVehicle() {
        return VehicleType.fromValue(JsoHelper.getAttribute(jsObj, "vehicle"));
    }

    public void setAgencies(List<TransitAgency> agencies) {
        JavaScriptObject peers = JsoHelper.createJavaScriptArray().cast();
        for (int i = 0; i < agencies.size(); i++) {
            JsoHelper.setArrayValue(peers, i, agencies.get(i).getJsObj());
        }
        JsoHelper.setAttribute(peers, "agencies", peers);
    }

    public void setAgencies(TransitAgency... agencies) {
        setAgencies(Arrays.asList(agencies));
    }

    public List<TransitAgency> getAgencies() {
        List<TransitAgency> agencies = new ArrayList<TransitAgency>();
        JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "agencies");
        if (peers != null) {
            int size = JsoHelper.arrayLength(peers);
            for (int i = 0; i < size; i++) {
                agencies.add(new TransitAgency(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
            }
        }
        return agencies;
    }
}
