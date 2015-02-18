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
package com.ait.toolkit.gmaps.client.libraries.drawing;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.controls.ControlPosition;
import com.google.gwt.core.client.JsArrayString;

public class DrawingControlOptions extends JsObject {

    public DrawingControlOptions() {
        jsObj = JsoHelper.createObject();
    }

    public void setDrawingModes(OverlayType... overlayTypes) {
        assert overlayTypes != null;
        JsArrayString peers = JsArrayString.createArray().cast();

        for (OverlayType type : overlayTypes) {
            peers.push(type.value());
        }
        JsoHelper.setAttribute(jsObj, "drawingModes", peers);
    }

    public void setPosition(ControlPosition position) {
        JsoHelper.setAttribute(jsObj, "position", position.getValue());
    }
}
