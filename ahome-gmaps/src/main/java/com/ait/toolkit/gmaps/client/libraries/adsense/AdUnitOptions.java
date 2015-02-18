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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.controls.ControlPosition;

public class AdUnitOptions extends JsObject {

    public AdUnitOptions() {
        jsObj = JsoHelper.createObject();
    }

    public native void setBackgroundColor(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.backgroundColor = value;
    }-*/;

    public native void setPublisherId(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.publisherId = value;
    }-*/;

    public native void setBorderColor(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.borderColor = value;
    }-*/;

    public native void setChannelNumber(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.channelNumber = value;
    }-*/;

    public void setFormat(AdFormat format) {
        _setFormat(format.value());
    }

    public native void setMap(GMap value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.map = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public void setPosition(ControlPosition position) {
        _setPosition(position.getValue());
    }

    public native void setTextColor(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.textColor = value;
    }-*/;

    public native void setUrlColor(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.urlColor = value;
    }-*/;

    public native void setTitleColor(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.titleColor = value;
    }-*/;

    private native void _setFormat(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.format = value;
    }-*/;

    private native void _setPosition(String value)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.position = value;
    }-*/;

}
