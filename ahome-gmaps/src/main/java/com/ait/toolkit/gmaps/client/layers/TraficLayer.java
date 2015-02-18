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
package com.ait.toolkit.gmaps.client.layers;

import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;

public class TraficLayer extends MVCObject {

    public TraficLayer() {
        jsObj = createPeer();
    }

    public native void setMap(GMap map)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj
				.setMap(map.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native GMap getMap()/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var map = obj.getMap();
		return @com.ait.toolkit.gmaps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.google.maps.TraficLayer();
    }-*/;

}
