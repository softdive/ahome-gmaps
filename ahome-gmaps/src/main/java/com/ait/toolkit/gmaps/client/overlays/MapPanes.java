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
package com.ait.toolkit.gmaps.client.overlays;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class MapPanes extends JsObject {

    public MapPanes() {
        jsObj = JsoHelper.createObject();
    }

    protected MapPanes(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * sets This pane contains the info window. It is above all map overlays.
     * (Pane 6).
     * 
     * @param floatPane
     */
    public final native void setFloatPane(Element floatPane) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.floatPane = floatPane;
    }-*/;

    /**
     * gets This pane contains the info window. It is above all map overlays.
     * (Pane 6).
     */
    public final native Element getFloatPane() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.floatPane;
    }-*/;

    /**
     * sets This pane contains the info window shadow. It is above the
     * overlayImage, so that markers can be in the shadow of the info window.
     * (Pane 4).
     * 
     * @param floatShadow
     */
    public final native void setFloatShadow(Element floatShadow) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.floatShadow = floatShadow;
    }-*/;

    /**
     * gets This pane contains the info window shadow. It is above the
     * overlayImage, so that markers can be in the shadow of the info window.
     * (Pane 4).
     */
    public final native Element getFloatShadow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.floatShadow;
    }-*/;

    /**
     * sets This pane is the lowest pane and is above the tiles. It may not
     * receive DOM events. (Pane 0).
     * 
     * @param mapPane
     */
    public final native void setMapPane(Element mapPane) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mapPane = mapPane;
    }-*/;

    /**
     * gets This pane is the lowest pane and is above the tiles. It may not
     * receive DOM events. (Pane 0).
     */
    public final native Element getMapPane() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mapPane;
    }-*/;

    /**
     * sets This pane contains the marker foreground images. (Pane 3).
     * 
     * @param overlayImage
     */
    public final native void setOverlayImage(Element overlayImage) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.overlayImage = overlayImage;
    }-*/;

    /**
     * gets This pane contains the marker foreground images. (Pane 3).
     */
    public final native Element getOverlayImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.overlayImage;
    }-*/;

    /**
     * sets This pane contains polylines, polygons, ground overlays and tile
     * layer overlays. It may not receive DOM events. (Pane 1).
     * 
     * @param overlayLayer
     */
    public final native void setOverlayLayer(Element overlayLayer) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.overlayLayer = overlayLayer;
    }-*/;

    /**
     * gets This pane contains polylines, polygons, ground overlays and tile
     * layer overlays. It may not receive DOM events. (Pane 1).
     */
    public final native Element getOverlayLayer() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.overlayLayer;
    }-*/;

    /**
     * sets This pane contains elements that receive DOM mouse events, such as
     * the transparent targets for markers. It is above the floatShadow, so that
     * markers in the shadow of the info window can be clickable. (Pane 5).
     * 
     * @param overlayMouseTarget
     */
    public final native void setOverlayMouseTarget(Element overlayMouseTarget) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.overlayMouseTarget = overlayMouseTarget;
    }-*/;

    /**
     * gets This pane contains elements that receive DOM mouse events, such as
     * the transparent targets for markers. It is above the floatShadow, so that
     * markers in the shadow of the info window can be clickable. (Pane 5).
     */
    public final native Element getOverlayMouseTarget() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.overlayMouseTarget;
    }-*/;

    /**
     * sets This pane contains the marker shadows. It may not receive DOM
     * events. (Pane 2).
     * 
     * @param overlayShadow
     */
    public final native void setOverlayShadow(Element overlayShadow) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.overlayShadow = overlayShadow;
    }-*/;

    /**
     * gets This pane contains the marker shadows. It may not receive DOM
     * events. (Pane 2).
     */
    public final native Element getOverlayShadow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.overlayShadow;
    }-*/;
}
