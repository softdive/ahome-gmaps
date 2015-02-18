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

public class GroundOverlayOptions extends AbstractOption {

    public GroundOverlayOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * If true, the ground overlay can receive click events.
     * 
     * @param value
     */
    public native void setClickable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    public native boolean isClickable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

    public final native void seOpacity(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.opacity = value;
    }-*/;

    public final native void setMap(GMap map)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setMap(map.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
