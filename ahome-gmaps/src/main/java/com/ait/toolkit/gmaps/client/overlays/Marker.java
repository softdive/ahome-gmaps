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

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.Animation;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.ait.toolkit.gmaps.client.events.GMapEvent;
import com.ait.toolkit.gmaps.client.events.handlers.DragEndHandler;
import com.ait.toolkit.gmaps.client.events.handlers.DragHandler;
import com.ait.toolkit.gmaps.client.events.handlers.MapTapHandler;
import com.ait.toolkit.gmaps.client.events.handlers.MouseEventHandler;
import com.ait.toolkit.gmaps.client.events.handlers.TapHandler;
import com.ait.toolkit.gmaps.client.streetview.StreetViewPanorama;
import com.google.gwt.core.client.JavaScriptObject;

public class Marker extends MVCObject {

    /**
     * The maximum default z-index that the API will assign to a marker. You may
     * set a higher z-index to bring a marker to the front.
     */
    public static final double MAX_ZINDEX = MAX_Z_INDEX();

    public Marker() {
        jsObj = create();
    }

    public Marker(GMap map) {
        this();
        this.setMap(map);
        this.setPosition(map.getCenter());
    }

    public Marker(GMap map, LatLng position) {
        this(map);
        setPosition(position);
    }

    public Marker(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public native void setTitle(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTitle(value);
    }-*/;

    public native String getTitle()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getTitle();
    }-*/;

    public void setMap(GMap map) {
        setMap(map.getJsObj());
    }

    public void setPosition(LatLng latLgn) {
        setPosition(latLgn.getJsObj());
    }

    public final Animation getAnimation() {
        return Animation.fromValue(_getAnimation());
    }

    public final native String _getAnimation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getAnimation();
    }-*/;

    public final native boolean isClickable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getClickable();
    }-*/;

    public final native String getCursor()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getCursor();
    }-*/;

    public final native boolean isDraggable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getDraggable();
    }-*/;

    public final native boolean isFlat()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getFlat();
    }-*/;

    public final native String getIcon()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getIcon();
    }-*/;

    public final native MarkerImage getIconAsMarkerImage()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getIcon();
		var toReturn = @com.ait.toolkit.gmaps.client.overlays.MarkerImage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native StreetViewPanorama getMapAsStreeviewPanorama()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getMap();
		var toReturn = @com.ait.toolkit.gmaps.client.streetview.StreetViewPanorama::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native LatLng getPosition()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getPosition();
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native String getShadow()/*-{
		return this.getShadow();
    }-*/;

    public final native MarkerImage getShadowAsMarkerImage()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getShadow();
		var toReturn = @com.ait.toolkit.gmaps.client.overlays.MarkerImage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native MarkerShape getShape()/*-{
		return this.getShape();
    }-*/;

    public final native boolean isVisible() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getVisible();
    }-*/;

    public final native double getZIndex()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getZIndex();
    }-*/;

    /**
     * Start an animation. Any ongoing animation will be cancelled. Currently
     * supported animations are: BOUNCE, DROP. Passing in null will cause any
     * animation to stop.
     * 
     * @param animation
     */
    public final void setAnimation(Animation animation) {
        setAnimation(animation.getValue());
    }

    private final native void setAnimation(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setAnimation(value);
    }-*/;

    public final native void setVisible(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setVisible(value);
    }-*/;

    public final native void setClickable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setClickable(value);
    }-*/;

    public final native void setCursor(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setCursor(value);
    }-*/;

    public final native void setDraggable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setDraggable(value);
    }-*/;

    public final native void setFlat(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setFlat(value);
    }-*/;

    public final native void setIcon(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setIcon(value);
    }-*/;

    public final native void setIcon(MarkerImage value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setIcon(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Renders the marker on the specified panorama. If map is set to null, the
     * marker will be removed.
     * 
     * @param value
     */
    public final native void setMap(StreetViewPanorama value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setMap(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native void setOptions(MarkerOptions options)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setOptions(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native void setShadow(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setShadow(value);
    }-*/;

    public final native void setShadow(MarkerImage value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setShadow(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native void setZIndex(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setZIndex(value);
    }-*/;

    public final native void setShape(MarkerShape value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setShape(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void addTapHandler(TapHandler handler) {
        addEventListener(this.getJsObj(), GMapEvent.TAP, handler);
    }

    public void addAnimationChangedHandler(Function handler) {
        _addHandler(GMapEvent.ANIMATION_CHANGED, handler);
    }

    public void addClickHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.CLICK, handler);
    }

    public void addClickableChangedHandler(Function handler) {
        _addHandler(GMapEvent.CLICKABLE_CHANGED, handler);
    }

    public void addDoubleClickHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.DOUBLE_CLICK, handler);
    }

    public void addCursorChangedChangedHandler(Function handler) {
        _addHandler(GMapEvent.CURSOR_CHANGED, handler);
    }

    public void addDragEndClickHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.DRAG_END, handler);
    }

    public void addDraggableChangedHandler(Function handler) {
        _addHandler(GMapEvent.DRAGGABLE_CHANGED, handler);
    }

    public void addDragStartClickHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.DRAG_START, handler);
    }

    public void addFlatChangedHandler(Function handler) {
        _addHandler(GMapEvent.FLAT_CHANGED, handler);
    }

    public void addIconChangedHandler(Function handler) {
        _addHandler(GMapEvent.ICON_CHANGED, handler);
    }

    public void addMouseDownHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.MOUSE_DOWN, handler);
    }

    public void addMouseOutHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.MOUSE_OUT, handler);
    }

    public void addMouseOverHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.MOUSE_OVER, handler);
    }

    public void addMouseUpHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.MOUSE_UP, handler);
    }

    public void addPositionChangedHandler(Function handler) {
        _addHandler(GMapEvent.POSITION_CHANGED, handler);
    }

    public void addRightClickHandler(MouseEventHandler handler) {
        _addMouseEventHandler(GMapEvent.RIGHT_CLICK, handler);
    }

    public void addShadowChangedHandler(Function handler) {
        _addHandler(GMapEvent.SHADOW_CHANGED, handler);
    }

    public void addShapeChangedHandler(Function handler) {
        _addHandler(GMapEvent.SHAPE_CHANGED, handler);
    }

    public void addTitleChangedHandler(Function handler) {
        _addHandler(GMapEvent.TITLE_CHANGED, handler);
    }

    public void addVisibleChangedHandler(Function handler) {
        _addHandler(GMapEvent.VISIBLE_CHANGED, handler);
    }

    public void addZIndexChangedHandler(Function handler) {
        _addHandler(GMapEvent.ZINDEX_CHANGED, handler);
    }

    @Deprecated
    public void addDragEndHandler(DragEndHandler handler) {
        addEventListener(this.getJsObj(), GMapEvent.DRAG_END, handler);
    }

    @Deprecated
    public void addDragHandler(DragHandler handler) {
        addEventListener(this.getJsObj(), GMapEvent.DRAG, handler);
    }

    private static native void addEventListener(JavaScriptObject target, String event, DragHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.DragHandler::onDrag(Lcom/ait/toolkit/gmaps/client/events/InteractionEvent;)(e);
						});
    }-*/;

    private static native void addEventListener(JavaScriptObject target, String event, TapHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.TapHandler::onTap(Lcom/ait/toolkit/gmaps/client/events/InteractionEvent;)(e);
						});
    }-*/;

    private native void setMap(JavaScriptObject value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setMap(value);
    }-*/;

    private native void setPosition(JavaScriptObject value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setPosition(value);
    }-*/;

    private native JavaScriptObject create()/*-{
		return new $wnd.google.maps.Marker();
    }-*/;

    private static native double MAX_Z_INDEX() /*-{
		return $wnd.google.maps.Marker.MAX_ZINDEX;
    }-*/;

    private native void addEventListener(JavaScriptObject target, String event, MapTapHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.MapTapHandler::onTap(Lcom/ait/toolkit/gmaps/client/events/InteractionEvent;)(e);
						});
    }-*/;

    private native void addEventListener(JavaScriptObject target, String event, DragEndHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.DragEndHandler::onDragEnd(Lcom/ait/toolkit/gmaps/client/events/InteractionEvent;)(e);
						});
    }-*/;

    private native void _addHandler(String event, Function handler)/*-{
		var marker = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						marker,
						event,
						function(e) {
							handler.@com.ait.toolkit.core.client.Function::execute()();
						});
    }-*/;

    private native void _addMouseEventHandler(String event, MouseEventHandler handler)/*-{
		var marker = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.google.maps.event
				.addListener(
						marker,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.MouseEventHandler::onMouseEvent(Lcom/ait/toolkit/gmaps/client/events/MouseEvent;)(e);
						});
    }-*/;

}
