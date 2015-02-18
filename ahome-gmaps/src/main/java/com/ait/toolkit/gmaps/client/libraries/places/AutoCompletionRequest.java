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
package com.ait.toolkit.gmaps.client.libraries.places;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.core.LatLngBounds;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class AutoCompletionRequest extends JsObject {

    public AutoCompletionRequest() {
        jsObj = JsoHelper.createObject();
    }

    protected AutoCompletionRequest(JavaScriptObject peer) {
        jsObj = peer;
    }

    public void setBounds(LatLngBounds value) {
        JsoHelper.setAttribute(jsObj, "bounds", value.getJsObj());
    }

    public void setComponentRestrictions(ComponentRestrictions value) {
        JsoHelper.setAttribute(jsObj, "componentRestrictons", value.getJsObj());
    }

    public void setInput(String value) {
        JsoHelper.setAttribute(jsObj, "input", value);
    }

    public void setOffset(double value) {
        JsoHelper.setAttribute(jsObj, "offset", value);
    }

    public void setTypes(String... types) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : types) {
            values.push(s);
        }
        JsoHelper.setAttribute(jsObj, "types", values);
    }

    public void setRadius(double value) {
        JsoHelper.setAttribute(jsObj, "radius", value);
    }
}
