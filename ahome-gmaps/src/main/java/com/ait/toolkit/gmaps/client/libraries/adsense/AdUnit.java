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
package com.ait.toolkit.gmaps.client.libraries.adsense;

import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.controls.ControlPosition;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

/**
 * Implements AdSense for Content advertising on an associated map. To use an
 * AdUnit, you must obtain and specify an AdSense for Content publisher ID
 * within the AdUnit's constructor options.
 */
public class AdUnit extends Widget {

    com.google.gwt.dom.client.Element div;
    private JavaScriptObject adUnitImpl;

    public AdUnit(AdUnitOptions options) {
        div = DOM.createDiv();
        adUnitImpl = createAdUnitImpl(div, options);
        setElement(div);
    }

    private native JavaScriptObject createAdUnitImpl(Element container, AdUnitOptions options)/*-{
		return new $wnd.google.maps.adsense.AdUnit(
				container,
				options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native String getBackgroundColor()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getBackgroundColor();
    }-*/;

    public native void setBackgroundColor(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setBackgroundColor(value);
    }-*/;

    public native String getBorderColor()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getBorderColor();
    }-*/;

    public native void setBorderColor(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setBorderColor(value);
    }-*/;

    public native String getChannelNumber()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getChannelNumber();
    }-*/;

    public native void setChannelNumber(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setChannelNumber(value);
    }-*/;

    public native Element getContainer()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getContainer();
    }-*/;

    public void setFormat(AdFormat format) {
        _setFormat(format.value());
    }

    public AdFormat getFormat() {
        return AdFormat.fromValue(_getFormat());
    }

    public native GMap getMap()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		var map = obj.getMap();
		return @com.ait.toolkit.gmaps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
    }-*/;

    public native void setMap(GMap value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj
				.setMap(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public ControlPosition getPosition() {
        return ControlPosition.fromValue(_getPosition());
    }

    public void setPosition(ControlPosition position) {
        _setPosition(position.getValue());
    }

    public native String getPublisherId()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getPublisherId();
    }-*/;

    public native String getTextColor()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getTextColor();
    }-*/;

    public native void setTextColor(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setTextColor(value);
    }-*/;

    public native String getTitleColor()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getTitleColor();
    }-*/;

    public native String getUrlColor()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getUrlColor();
    }-*/;

    public native void setUrlColor(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setUrlColor(value);
    }-*/;

    public native void setTitleColor(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setTitleColor(value);
    }-*/;

    private native void _setFormat(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setFormat(value);
    }-*/;

    private native String _getFormat()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getFormat();
    }-*/;

    private native String _getPosition()/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		return obj.getPosition();
    }-*/;

    private native void _setPosition(String value)/*-{
		var obj = this.@com.ait.toolkit.gmaps.client.libraries.adsense.AdUnit::adUnitImpl;
		obj.setPosition(value);
    }-*/;

}
