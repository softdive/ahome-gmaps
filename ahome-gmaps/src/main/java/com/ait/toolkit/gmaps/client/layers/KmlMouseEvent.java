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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.geom.Size;
import com.google.gwt.core.client.JavaScriptObject;

public class KmlMouseEvent extends JsObject {

    protected KmlMouseEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public LatLng getLatLng() {
        JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "latLng");
        return new LatLng(obj);
    }

    public Size getPixelOffset() {
        JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "latLng");
        return new Size(obj);
    }

    public KmlFeatureData getFeatureData() {
        JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "featureData");
        return new KmlFeatureData(obj);
    }

}
