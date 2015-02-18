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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;

public class DrawingManager extends MVCObject {

    public DrawingManager() {
        jsObj = createPeer();
    }

    public DrawingManager(DrawingManagerOptions options) {
        jsObj = createPeer(options.getJsObj());
    }

    public void setDrawingMode(OverlayType drawingMode) {
        JsoHelper.setAttribute(jsObj, "drawingMode", drawingMode.value());
    }

    public OverlayType getDrawingMode() {
        String mode = JsoHelper.getAttribute(jsObj, "drawingMode");
        return OverlayType.fromValue(mode);
    }

    public void setMap(GMap map) {
        JsoHelper.setAttribute(jsObj, "map", map.getJsObj());
    }

    public GMap getMap() {
        return new GMap(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "map"));
    }

    public void setOptions(DrawingManagerOptions options) {
        JsoHelper.setAttribute(jsObj, "options", options.getJsObj());
    }

    public native void addCircleCompleteHandler(CircleCompleteHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						obj,
						'circlecomplete',
						function(c) {
							var circle = @com.ait.toolkit.gmaps.client.overlays.Circle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(c);
							handler.@com.ait.toolkit.gmaps.client.libraries.drawing.CircleCompleteHandler::onCircleComplete(Lcom/ait/toolkit/gmaps/client/overlays/Circle;)(circle);
						});

    }-*/;

    public native void addMarkerCompleteHandler(MarkerCompleteHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						obj,
						'markercomplete',
						function(m) {
							var marker = @com.ait.toolkit.gmaps.client.overlays.Marker::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
							handler.@com.ait.toolkit.gmaps.client.libraries.drawing.MarkerCompleteHandler::onMarkerComplete(Lcom/ait/toolkit/gmaps/client/overlays/Marker;)(marker);
						});

    }-*/;

    public native void addOverlayCompleteHandler(OverlayCompleteHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						obj,
						'overlaycomplete',
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.libraries.drawing.OverlayCompleteHandler::onOverlayComplete(Lcom/ait/toolkit/gmaps/client/libraries/drawing/OverlayCompleteEvent;)(e);
						});

    }-*/;

    public native void addPolygoneCompleteHandler(PolygonCompleteHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						obj,
						'polygonecomplete',
						function(p) {
							var polygon = @com.ait.toolkit.gmaps.client.overlays.Polygon::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
							handler.@com.ait.toolkit.gmaps.client.libraries.drawing.PolygonCompleteHandler::onPolygonComplete(Lcom/ait/toolkit/gmaps/client/overlays/Polygon;)(polygon);
						});

    }-*/;

    public native void addPolylineCompleteHandler(PolylineCompleteHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						obj,
						'polylinecomplete',
						function(p) {
							var polyline = @com.ait.toolkit.gmaps.client.overlays.Polyline::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
							handler.@com.ait.toolkit.gmaps.client.libraries.drawing.PolylineCompleteHandler::onPolylineComplete(Lcom/ait/toolkit/gmaps/client/overlays/Polyline;)(polyline);
						});

    }-*/;

    public native void addRectangleCompleteHandler(RectangleCompleteHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						obj,
						'rectanglecomplete',
						function(r) {
							var rect = @com.ait.toolkit.gmaps.client.overlays.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
							handler.@com.ait.toolkit.gmaps.client.libraries.drawing.RectangleCompleteHandler::onRectangleComplete(Lcom/ait/toolkit/gmaps/client/overlays/Rectangle;)(rect);
						});

    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.google.maps.drawing.DrawingManager();
    }-*/;

    private native JavaScriptObject createPeer(JavaScriptObject options)/*-{
		return new $wnd.google.maps.drawing.DrawingManager(options);
    }-*/;

}
