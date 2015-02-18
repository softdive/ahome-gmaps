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

/**
 * A representation of distance as a numeric value and a display string.
 */
public class Distance extends JsObject {

    protected Distance(JavaScriptObject peer) {
        jsObj = peer;
    }

    public Distance() {
        jsObj = JsoHelper.createObject();
    }

    public void setText(String value) {
        JsoHelper.setAttribute(jsObj, "text", value);
    }

    public void setValue(double value) {
        JsoHelper.setAttribute(jsObj, "value", value);
    }

    public String getText() {
        return JsoHelper.getAttribute(jsObj, "text");
    }

    public double getValue() {
        return JsoHelper.getAttributeAsDouble(jsObj, "value");
    }
}
