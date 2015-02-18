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

package com.ait.toolkit.gmaps.client.maptypes;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.geom.Point;
import com.ait.toolkit.gmaps.client.geom.Size;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

/**
 * This class defines map type. This class is typically used for base maps such
 * as road, satellite or hybrid maps. Immutable.
 * 
 */
public class MapType extends JsObject {

    public MapType() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Returns a tile for the given tile coordinate (x, y) and zoom level. This
     * tile will be appended to the given ownerDocument.
     * 
     * @param <T>
     * @param titleCoord
     * @param zoom
     * @return
     */
    public native Element getTitle(Point titleCoord, double zoom, Document ownerDocument)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getTitle(titleCoord, zoom, ownerDocument);
    }-*/;

    /**
     * Releases the given tile, performing any necessary cleanup. The provided
     * tile will have already been removed from the document. Optional.
     * 
     * @param <T>
     * @param value
     * @return
     */
    public native void releaseNode(Element value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.releaseNode(value);
    }-*/;

    /**
     * Alt text to display when this MapType's button is hovered over in the
     * MapTypeControl. Optional.
     * 
     * @param value
     */
    public native void setAlt(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.alt = value;
    }-*/;

    public native String getAlt()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.alt;
    }-*/;

    /**
     * The maximum zoom level for the map when displaying this MapType. Required
     * for base MapTypes, ignored for overlay MapTypes.
     * 
     * @param value
     */
    public native void setMaxZoom(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.maxZoom = value;
    }-*/;

    public native double getMaxZoom()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.maxZoom;
    }-*/;

    /**
     * The minimum zoom level for the map when displaying this MapType. Required
     * for base MapTypes, ignored for overlay MapTypes.
     * 
     * @param value
     */
    public native void setMinZoom(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.minZoom = value;
    }-*/;

    public native double getMinZoom()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minZoom;
    }-*/;

    /**
     * Name to display in the MapTypeControl. Optional.
     * 
     * @param value
     */
    public native void setName(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.name = value;
    }-*/;

    public native String getName()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * The Projection used to render this MapType. Optional; defaults to
     * Mercator.
     * 
     * @param value
     */
    public native void setProjection(Projection value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.projection = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native Projection getProjection()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.position;
		var toReturn = @com.ait.toolkit.gmaps.client.maptypes.Projection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Radius of the planet for the map, in meters. Optional; defaults to
     * Earth's equatorial radius of 6378137 meters.
     * 
     * @param value
     */
    public native void setRadius(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.radius = value;
    }-*/;

    public native double getRadius()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.radius;
    }-*/;

    /**
     * The dimensions of each tile. Required.
     * 
     * @param value
     */
    public native void setTileSize(Size value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.tileSize = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native Size getTileSize()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.titleSize;
		var toReturn = @com.ait.toolkit.gmaps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
