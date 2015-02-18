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
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.overlays.CircleOptions;
import com.ait.toolkit.gmaps.client.overlays.MarkerOptions;
import com.ait.toolkit.gmaps.client.overlays.PolygonOptions;
import com.ait.toolkit.gmaps.client.overlays.PolylineOptions;
import com.ait.toolkit.gmaps.client.overlays.RectangleOptions;

public class DrawingManagerOptions extends JsObject {

    public DrawingManagerOptions() {
        jsObj = JsoHelper.createObject();
    }

    public void setCircleOptions(CircleOptions value) {
        JsoHelper.setAttribute(jsObj, "circleOptions", value.getJsObj());
    }

    public void setDrawingControl(boolean value) {
        JsoHelper.setAttribute(jsObj, "drawingControl", value);
    }

    public void setDrawingControlOptions(DrawingControlOptions value) {
        JsoHelper.setAttribute(jsObj, "drawingControlOptions", value.getJsObj());
    }

    public void setDrawingMode(OverlayType value) {
        JsoHelper.setAttribute(jsObj, "drawingMode", value.value());
    }

    public void setMap(GMap value) {
        JsoHelper.setAttribute(jsObj, "map", value.getJsObj());
    }

    public void setMarkerOptions(MarkerOptions value) {
        JsoHelper.setAttribute(jsObj, "markerOptions", value.getJsObj());
    }

    public void setPolygonOptions(PolygonOptions value) {
        JsoHelper.setAttribute(jsObj, "polygonOptions", value.getJsObj());
    }

    public void setPolylineOptions(PolylineOptions value) {
        JsoHelper.setAttribute(jsObj, "polylineOptions", value.getJsObj());
    }

    public void setRectangleOptions(RectangleOptions value) {
        JsoHelper.setAttribute(jsObj, "rectangleOptions", value.getJsObj());
    }
}
