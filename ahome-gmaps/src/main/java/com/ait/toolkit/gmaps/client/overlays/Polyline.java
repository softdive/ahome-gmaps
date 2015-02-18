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

import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.core.MVCArray;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 A polyline is a linear overlay of connected line segments on the map.
 */
public class Polyline extends MVCObject {

	/**
	 * reate a polyline , which specify both the path of the polyline and the
	 * stroke style to use when drawing the polyline. You may pass either an
	 * array of LatLngs or an MVCArray of LatLngs when constructing a polyline,
	 * though simple arrays are converted to MVCArrays within the polyline upon
	 * instantiation.
	 * 
	 * @return
	 */
	public Polyline() {
		jsObj = createPeer();
	}

	/**
	 * Create a polyline using the passed PolylineOptions, which specify both
	 * the path of the polyline and the stroke style to use when drawing the
	 * polyline. You may pass either an array of LatLngs or an MVCArray of
	 * LatLngs when constructing a polyline, though simple arrays are converted
	 * to MVCArrays within the polyline upon instantiation.
	 * 
	 * @param options
	 * @return
	 */
	public Polyline(PolylineOptions options) {
		jsObj = createPeer(options.getJsObj());
	}

	public Polyline(JavaScriptObject obj) {
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
	public native MVCArray getPath()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getPath();
		var toReturn = @com.ait.toolkit.gmaps.client.core.MVCArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public final native void setOptions(PolylineOptions options)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setOptions(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Sets the first path. See
	 * com.ait.toolkit.gmaps.client.overlays.PolylineOptions for more details.
	 * 
	 * @param values
	 */
	/**
	 * Sets the first path. See
	 * com.ait.toolkit.gmaps.client.overlays.PolylineOptions for more details.
	 * 
	 * @param value
	 */
	public native void setPath(MVCArray value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setPath(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	private static native JavaScriptObject createPeer() /*-{
		return new $wnd.google.maps.Polyline();
	}-*/;

	private static native JavaScriptObject createPeer(JavaScriptObject options) /*-{
		return new $wnd.google.maps.Polyline(options);
	}-*/;

}
