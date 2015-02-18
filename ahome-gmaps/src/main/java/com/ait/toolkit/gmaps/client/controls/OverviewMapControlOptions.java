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

package com.ait.toolkit.gmaps.client.controls;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the Overview Map control.
 * 
 */
public class OverviewMapControlOptions extends JsObject {

    public OverviewMapControlOptions() {
        jsObj = JsoHelper.createObject();
    }

    public OverviewMapControlOptions(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Whether the control should display in opened mode or collapsed
     * (minimized) mode. By default, the control is closed.
     * 
     * @param value
     */
    public void setOpened(boolean value) {
        JsoHelper.setAttribute(jsObj, "opened", value);
    }

    /**
     * Whether the control displays in opened mode or collapsed (minimized)
     * mode. By default, the control is closed.
     * 
     */
    public boolean isOpened() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "opened");
    }

}
