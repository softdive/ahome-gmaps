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
package com.ait.toolkit.gmaps.client.libraries.panoramio;

import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.events.Event;
import com.ait.toolkit.gmaps.client.geom.Size;

public class PanoramioMouseEvent extends Event {

    protected PanoramioMouseEvent() {

    }

    public final native PanoramioFeature getFeatureDetails()/*-{
		var obj = this.featureDetails;
		return @com.ait.toolkit.gmaps.client.libraries.panoramio.PanoramioFeature::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native String getInfoWindowHtml()/*-{
		return this.infoWindowHtml;
    }-*/;

    public final native LatLng getLatLng()/*-{
		var obj = this.latLgn;
		return @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Size getSize()/*-{
		var obj = this.pixelOffset;
		return @com.ait.toolkit.gmaps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
