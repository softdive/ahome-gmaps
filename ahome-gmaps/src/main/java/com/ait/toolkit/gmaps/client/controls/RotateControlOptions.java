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
 * Options for the rendering of the map pan control.
 */
public class RotateControlOptions extends JsObject {

    public RotateControlOptions() {
        jsObj = JsoHelper.createObject();
    }

    public RotateControlOptions(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Position id. Used to specify the position of the control on the map. The
     * default position is TOP_RIGHT.
     * 
     * @return
     */
    public ControlPosition getPosition() {
        return ControlPosition.fromValue(_getPosition());
    }

    private String _getPosition() {
        return JsoHelper.getAttribute(jsObj, "position");
    }

    /**
     * Position id. Used to specify the position of the control on the map. The
     * default position is TOP_RIGHT.
     * 
     * @return
     */
    public void setPosition(ControlPosition position) {
        this.setPosition(position.getValue());
    }

    private void setPosition(String value) {
        JsoHelper.setAttribute(jsObj, "position", value);
    }
}
