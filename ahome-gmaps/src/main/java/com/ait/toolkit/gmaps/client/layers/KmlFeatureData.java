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
import com.google.gwt.core.client.JavaScriptObject;

public class KmlFeatureData extends JsObject {

    protected KmlFeatureData(JavaScriptObject obj) {
        jsObj = obj;
    }

    public KmlAuthor getAuthor() {
        return new KmlAuthor(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "author"));
    }

    public String getDescription() {
        return JsoHelper.getAttribute(jsObj, "description");
    }

    public String getId() {
        return JsoHelper.getAttribute(jsObj, "id");
    }

    public String getInfoWindowHtml() {
        return JsoHelper.getAttribute(jsObj, "infoWindowHtml");
    }

    public String getName() {
        return JsoHelper.getAttribute(jsObj, "name");
    }

    public String getSnipet() {
        return JsoHelper.getAttribute(jsObj, "snipet");
    }
}
