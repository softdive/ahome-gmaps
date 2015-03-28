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
package com.ait.toolkit.gmaps.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.GMapOptions;
import com.ait.toolkit.gmaps.client.core.LatLngBounds;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.ait.toolkit.gmaps.client.core.MapTypeId;
import com.ait.toolkit.gmaps.client.events.GMapEvent;
import com.ait.toolkit.gmaps.client.events.handlers.DragEndHandler;
import com.ait.toolkit.gmaps.client.events.handlers.MapTapHandler;
import com.ait.toolkit.gmaps.client.events.handlers.MouseEventHandler;
import com.ait.toolkit.gmaps.client.maptypes.Projection;
import com.ait.toolkit.gmaps.client.streetview.StreetViewPanorama;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.DivElement;

public class GMap extends MVCObject {

	/**
	 * Create a new Panel.
	 */

	public GMap(JavaScriptObject jsObj) {
		super(jsObj);
	}

	/**
	 * Sets the viewport to contain the given bounds.
	 * 
	 * @param bounds
	 */
	public final native void fitBounds(LatLngBounds bounds)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var b = bounds.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fitBounds(b);
	}-*/;

	/**
	 * Returns the lat/lng bounds of the current viewport. If more than one copy
	 * of the world is visible, the bounds range in longitude from -180 to 180
	 * degrees inclusive. If the map is not yet initialized (i.e. the mapType is
	 * still null), or center and zoom have not been set then the result is null
	 * or undefined.
	 * 
	 * @return
	 */
	public final native LatLngBounds getBounds()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getCenter();
		return @com.ait.toolkit.gmaps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * 
	 * @param value
	 */
	public final native void setZoom(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setZoom(value);
	}-*/;

	public final native void setCenter(LatLng latLgn)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var latln = latLgn.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setCenter(latln);
	}-*/;

	public final native LatLng getCenter()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getCenter();
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public final native DivElement getDiv()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getDiv();
	}-*/;

	public final native double getHeading()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getHeading();
	}-*/;

	public final native Projection getProjection()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getProjection();
		return @com.ait.toolkit.gmaps.client.maptypes.Projection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public final native StreetViewPanorama getStreetView()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getStreetView();
		return @com.ait.toolkit.gmaps.client.streetview.StreetViewPanorama::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public final native double getTilt()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getTilt();
	}-*/;

	public final native double getZoom()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getZoom();
	}-*/;

	public final native void panBy(double x, double y)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.panBy(x, y);
	}-*/;

	public final native void panTo(LatLng latLgn)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.panTo(latLgn.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public final native void panToBounds(LatLngBounds bounds)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.panToBounds(bounds.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public final native void setHeading(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setHeading(value);
	}-*/;

	public final native void setOptions(GMapOptions value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setOptions(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public final native void setStreetView(StreetViewPanorama value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setStreetView(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public final native void setTilt(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTilt(value);
	}-*/;

	/**
	 * 
	 * @param id
	 */
	public final void setMapType(MapTypeId id) {
		_setMapType(id.getValue());
	}

	private final native void _setMapType(String id)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setMapTypeId(id);
	}-*/;

	public final MapTypeId getMapType() {
		return MapTypeId.fromValue(_getMapType());
	}

	private final native String _getMapType()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getMapTypeId();
	}-*/;

	public void addTapHandler(MapTapHandler handler) {
		addEventListener(this.getJsObj(), GMapEvent.TAP, handler);
	}

	public void addBounsChangedHandler(Function handler) {
		_addHandler(GMapEvent.BOUNDS_CHANGED, handler);
	}

	public void addCenterChangedHandler(Function handler) {
		_addHandler(GMapEvent.CENTER_CHANGED, handler);
	}

	public void addDragHandler(Function handler) {
		_addHandler(GMapEvent.DRAG, handler);
	}

	public void addDragEndHandler(Function handler) {
		_addHandler(GMapEvent.DRAG_END, handler);
	}

	public void addDragStartHandler(Function handler) {
		_addHandler(GMapEvent.DRAG_START, handler);
	}

	public void addHeadingChangeHandler(Function handler) {
		_addHandler(GMapEvent.HEADING_CHANGED, handler);
	}

	public void addIdleHandler(Function handler) {
		_addHandler(GMapEvent.IDLE, handler);
	}

	public void addMapTypeIdChangeHandler(Function handler) {
		_addHandler(GMapEvent.MAP_TYPE_ID_CHANGED, handler);
	}

	public void addProjectionChangedHandler(Function handler) {
		_addHandler(GMapEvent.PROJECTION_CHANGED, handler);
	}

	public void addResizeHandler(Function handler) {
		_addHandler(GMapEvent.RESIZE, handler);
	}

	public void addTilesLoadedHandler(Function handler) {
		_addHandler(GMapEvent.TILES_LOADED, handler);
	}

	public void addTiltChangeHandler(Function handler) {
		_addHandler(GMapEvent.TILT_CHANGED, handler);
	}

	public void addZoomHandler(Function handler) {
		_addHandler(GMapEvent.ZOOM_CHANGED, handler);
	}

	public void addRightClickHandler(MouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.RIGHT_CLICK, handler);
	}

	public void addMouseMoveHandler(MouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_MOVE, handler);
	}

	public void addMouseOutHandler(MouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_OUT, handler);
	}

	public void addMouseOverHandler(MouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_OVER, handler);
	}

	public void addClickHandler(MouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.CLICK, handler);
	}

	public void addDoubleClickHandler(MouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.DOUBLE_CLICK, handler);
	}

	private native void addEventListener(JavaScriptObject target, String event,
			MapTapHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.MapTapHandler::onTap(Lcom/ait/toolkit/gmaps/client/events/InteractionEvent;)(e);
						});
	}-*/;

	private native void addEventListener(JavaScriptObject target, String event,
			DragEndHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.DragEndHandler::onDragEnd(Lcom/ait/toolkit/gmaps/client/events/InteractionEvent;)(e);
						});
	}-*/;

	private native void _addHandler(String event, Function handler)/*-{
		var map = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event.addListener(map, event, function(e) {
			handler.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	private native void _addMouseEventHandler(String event,
			MouseEventHandler handler)/*-{
		var map = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						map,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.MouseEventHandler::onMouseEvent(Lcom/ait/toolkit/gmaps/client/events/MouseEvent;)(e);
						});
	}-*/;
	
	public native void triggerEvent(String eventName) /*-{
		var map = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event.trigger(map, eventName);
	}-*/;

}
