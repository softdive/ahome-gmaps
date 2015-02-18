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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.MVCArray;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.ait.toolkit.gmaps.client.events.GMapEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A polygon (like a polyline) defines a series of connected coordinates in an
 * ordered sequence; additionally, polygons form a closed loop and define a
 * filled region.
 * 
 */
public class Polygon extends MVCObject {

	/**
	 * Create a polygon. A polygon may contain one or more paths, where each
	 * path consists of an array of LatLngs. You may pass either an array of
	 * LatLngs or an MVCArray of LatLngs when constructing these paths. Arrays
	 * are converted to MVCArrays within the polygon upon instantiation.
	 * 
	 * @return
	 */
	public Polygon() {
		jsObj = createPeer();
	}

	/**
	 * Create a polygon using the passed PolygonOptions, which specify the
	 * polygon's path, the stroke style for the polygon's edges, and the fill
	 * style for the polygon's interior regions. A polygon may contain one or
	 * more paths, where each path consists of an array of LatLngs. You may pass
	 * either an array of LatLngs or an MVCArray of LatLngs when constructing
	 * these paths. Arrays are converted to MVCArrays within the polygon upon
	 * instantiation.
	 * 
	 * @param options
	 * @return
	 */
	public Polygon(PolygonOptions options) {
		jsObj = createPeer(options.getJsObj());
	}

	public Polygon(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Returns the map on which this poly is attached.
	 * 
	 * @return
	 */
	public native GMap getMap()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getMap();
		var toReturn = @com.ait.toolkit.gmaps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Renders this Polyline or Polygon on the specified map. If map is set to
	 * null, the Poly will be removed.
	 * 
	 * @param value
	 */
	public native void setMap(GMap value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setMap(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Retrieves the first path.
	 * 
	 * @return
	 */
	public List<LatLng> getPath() {
		List<LatLng> toReturn = new ArrayList<LatLng>();
		JavaScriptObject peers = JsoHelper.createObject();
		MVCArray array = _getPath();
		for (int i = 0; i < array.getLength(); i++) {
			JsoHelper.setArrayValue(peers, i, array.getAt(i));
		}
		return toReturn;
	}

	private native MVCArray _getPath()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getPath();
		var toReturn = @com.ait.toolkit.gmaps.client.core.MVCArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Retrieves the paths.
	 * 
	 * @return, an array of arrays
	 */
	public List<List<LatLng>> getPaths() {
		List<List<LatLng>> toReturn = new ArrayList<List<LatLng>>();
		MVCArray peers = _getPaths();
		for (int i = 0; i < peers.getLength(); i++) {
			List<LatLng> latlngList = new ArrayList<LatLng>();
			JavaScriptObject array = peers.getAt(i);
			latlngList.add(LatLng.instance(JsoHelper
					.getValueFromJavaScriptObjectArray(array, i)));
			toReturn.add(latlngList);
		}
		return toReturn;
	}

	public native MVCArray _getPaths()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getPaths();
		//var toReturn = @com.ait.toolkit.gmaps.client.core.MVCArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return obj;
	}-*/;

	/**
	 * 
	 * @param options
	 */
	public native void setOptions(PolygonOptions options)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setOptions(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Sets the first path. See
	 * com.ait.toolkit.gmaps.client.overlays.PolylineOptions for more details.
	 * 
	 * @param value
	 */
	public void setPath(List<LatLng> values) {
		MVCArray array = new MVCArray();
		for (LatLng lng : values) {
			array.push(lng);
		}
		_setPath(array);
	}

	public void setPath(LatLng... latLngs) {
		setPath(Arrays.asList(latLngs));
	}

	private native void _setPath(MVCArray value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setPath(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Sets the path for this Polygon.
	 * 
	 * @param value
	 */
	public void setPaths(List<List<LatLng>> paths) {
		MVCArray array = new MVCArray();
		for (List<LatLng> latlngs : paths) {
			JavaScriptObject subArray = JsoHelper.createObject();
			for (int i = 0; i < latlngs.size(); i++) {
				JsoHelper.setArrayValue(subArray, i, latlngs.get(i).getJsObj());
			}
			array.push(subArray);
		}
		_setPaths(array);
	}

	private native void _setPaths(MVCArray value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setPaths(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void setDraggable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setDraggable(value);
	}-*/;

	public native boolean isDraggable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jsp.getDraggable();
	}-*/;

	public native void setEditable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setEditable(value);
	}-*/;

	public native boolean isEditable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jsp.getEditable();
	}-*/;

	public native void setVisible(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setVisible(value);
	}-*/;

	public native boolean isVisible()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getVisible();
	}-*/;

	public void addClickHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.CLICK, handler);
	}

	public void addDoubleClickHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.DOUBLE_CLICK, handler);
	}

	public void addMouseDownHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_DOWN, handler);
	}

	public void addMouseMoveHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_MOVE, handler);
	}

	public void addMouseOutHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_OUT, handler);
	}

	public void addMouseOverHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_OVER, handler);
	}

	public void addMouseUpHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.MOUSE_UP, handler);
	}

	public void addRightClickHandler(PolyMouseEventHandler handler) {
		_addMouseEventHandler(GMapEvent.RIGHT_CLICK, handler);
	}

	private static native JavaScriptObject createPeer() /*-{
		return new $wnd.google.maps.Polygon();
	}-*/;

	private static native JavaScriptObject createPeer(JavaScriptObject options) /*-{
		return new $wnd.google.maps.Polygon(options);
	}-*/;

	private native void _addMouseEventHandler(String event,
			PolyMouseEventHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						jsp,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.overlays.PolyMouseEventHandler::onMouseEvent(Lcom/ait/toolkit/gmaps/client/events/PolyMouseEvent;)(e);
						});
	}-*/;

}
