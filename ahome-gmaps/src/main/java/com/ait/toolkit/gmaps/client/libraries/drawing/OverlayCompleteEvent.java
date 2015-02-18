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

import com.ait.toolkit.gmaps.client.events.Event;
import com.ait.toolkit.gmaps.client.overlays.Circle;
import com.ait.toolkit.gmaps.client.overlays.Marker;
import com.ait.toolkit.gmaps.client.overlays.Polygon;
import com.ait.toolkit.gmaps.client.overlays.Polyline;
import com.ait.toolkit.gmaps.client.overlays.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

public class OverlayCompleteEvent extends Event {

    protected OverlayCompleteEvent() {

    }

    public final OverlayType getType() {
        return OverlayType.fromValue(_getType());
    }

    private final native JavaScriptObject getOverlay()/*-{
		return this.overlay;
    }-*/;

    private final native String _getType()/*-{
		return this.type;
    }-*/;

    public final Circle getCircle() {
        JavaScriptObject overlay = getOverlay();
        if (overlay != null && getType().equals(OverlayType.CIRCLE)) {
            return new Circle(overlay);
        }
        return null;
    }

    public final Marker getMarker() {
        JavaScriptObject overlay = getOverlay();
        if (overlay != null && getType().equals(OverlayType.MARKER)) {
            return new Marker(overlay);
        }
        return null;
    }

    public final Polygon getPolygon() {
        JavaScriptObject overlay = getOverlay();
        if (overlay != null && getType().equals(OverlayType.POLYGON)) {
            return new Polygon(overlay);
        }
        return null;
    }

    public final Polyline getPolyline() {
        JavaScriptObject overlay = getOverlay();
        if (overlay != null && getType().equals(OverlayType.POLYLINE)) {
            return new Polyline(overlay);
        }
        return null;
    }

    public final Rectangle getRectange() {
        JavaScriptObject overlay = getOverlay();
        if (overlay != null && getType().equals(OverlayType.RECTANGLE)) {
            return new Rectangle(overlay);
        }
        return null;
    }

}
