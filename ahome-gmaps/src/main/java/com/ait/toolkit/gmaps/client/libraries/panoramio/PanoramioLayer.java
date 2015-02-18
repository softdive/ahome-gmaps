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

import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PanoramioLayer extends MVCObject {

    public PanoramioLayer() {
        jsObj = createPeer();
    }

    public PanoramioLayer(PanoramioLayerOptions options) {
        jsObj = createPeer(options.getJsObj());
    }

    public native GMap getMap()/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var map = obj.getMap();
		return @com.ait.toolkit.gmaps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
    }-*/;

    public native void setMap(GMap value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj
				.setMap(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native String getTag()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getTag();
    }-*/;

    public native void setTag(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setTag(value);
    }-*/;

    public native String getUserId()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getUserId();
    }-*/;

    public native void setUserId(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.getUserId(value);
    }-*/;

    public native void setOptions(PanoramioLayerOptions value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj
				.setOptions(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void addClickHandler(PanoramioClickHandler handler) {
        _addEventListenerOnce(jsObj, "click", handler);
    }

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.google.maps.panoramio.PanoramioLayer();
    }-*/;

    private native JavaScriptObject createPeer(JavaScriptObject options)/*-{
		return new $wnd.google.maps.panoramio.PanoramioLayer(options);
    }-*/;

    private native void _addEventListenerOnce(JavaScriptObject target, String event, PanoramioClickHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.ait.toolkit.gmaps.client.libraries.panoramio.PanoramioClickHandler::onEvent(Lcom/ait/toolkit/gmaps/client/libraries/panoramio/PanoramioMouseEvent;)(e);
						});
    }-*/;

}
