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
import com.google.gwt.core.client.JsArrayString;

/**
 * The options that can be set on an Autocomplete. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#AutocompleteOptions"
 * > AutocompleteOptions API Doc</a>
 */
public class AutoCompleteOptions extends JsObject {

    public AutoCompleteOptions() {
        jsObj = JsoHelper.createObject();
    }

    public void setTypes(String... types) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : types) {
            values.push(s);
        }
        JsoHelper.setAttribute(jsObj, "types", values);
    }

    public void setBounds(LatLngBounds value) {
        JsoHelper.setAttribute(jsObj, "bounds", value.getJsObj());
    }

    public void setComponentRestrictions(ComponentRestrictions value) {
        JsoHelper.setAttribute(jsObj, "componentRestrictions", value.getJsObj());
    }
}
