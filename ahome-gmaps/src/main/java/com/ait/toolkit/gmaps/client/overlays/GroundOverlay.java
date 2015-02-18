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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.core.LatLngBounds;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.ait.toolkit.gmaps.client.events.GMapEvent;
import com.ait.toolkit.gmaps.client.events.handlers.MouseEventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A rectangular image overlay on the map.
 * 
 */
public class GroundOverlay extends MVCObject {

    public GroundOverlay() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Creates a ground overlay from the provided image URL and its
     * LatLngBounds. The image is scaled to fit the current bounds, and
     * projected using the current map projection.
     * 
     * @return
     */
    public GroundOverlay(String url, LatLngBounds bounds) {
        jsObj = create(url, bounds.getJsObj());
    }

    /**
     * 
     * Creates a ground overlay from the provided image URL and its
     * LatLngBounds. The image is scaled to fit the current bounds, and
     * projected using the current map projection.
     * 
     * @param options
     * @return
     */

    public GroundOverlay(String url, LatLngBounds bounds, GroundOverlayOptions options) {
        jsObj = create(url, bounds.getJsObj(), options.getJsObj());
    }

    /**
     * Gets the LatLngBounds of this overlay.
     * 
     * @return
     */
    public final native LatLngBounds getBounds()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getBounds();
		var toReturn = @com.ait.toolkit.gmaps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns the map on which this ground overlay is displayed.
     * 
     */
    public final native GMap getMap()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getMap();
		var toReturn = @com.ait.toolkit.gmaps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Gets the url of the projected image.
     * 
     * @return
     */
    public final native String getUrl()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getUrl();
    }-*/;

    /**
     * Renders the ground overlay on the specified map. If map is set to null,
     * the overlay is removed.
     * 
     * @param map
     */
    public final native void setMap(GMap map)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setMap(map.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native void seOpacity(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.seOpacity(value);
    }-*/;

    public void addClickHandler(MouseEventHandler handler) {
        this.addMouseEventHandler(GMapEvent.CLICK, handler);
    }

    public void addDoubleClickHandler(MouseEventHandler handler) {
        this.addMouseEventHandler(GMapEvent.DOUBLE_CLICK, handler);
    }

    private static native JavaScriptObject create(String url, JavaScriptObject bounds) /*-{
		return new $wnd.google.maps.GroundOverlay(url, bounds);
    }-*/;

    private static native JavaScriptObject create(String url, JavaScriptObject bounds, JavaScriptObject options) /*-{
		return new $wnd.google.maps.GroundOverlay(url, bounds, options);
    }-*/;

}
