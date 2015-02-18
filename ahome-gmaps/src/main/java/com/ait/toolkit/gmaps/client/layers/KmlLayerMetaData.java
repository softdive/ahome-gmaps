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

public class KmlLayerMetaData extends JsObject {

    public KmlLayerMetaData() {
        jsObj = JsoHelper.createObject();
    }

    public void setEmail(String value) {
        JsoHelper.setAttribute(jsObj, "email", value);
    }

    public void setDescription(String value) {
        JsoHelper.setAttribute(jsObj, "description", value);
    }

    public void setHasScreenOverlay(boolean value) {
        JsoHelper.setAttribute(jsObj, "hasScreenOverlay", value);
    }

    public void setName(String value) {
        JsoHelper.setAttribute(jsObj, "name", value);
    }

    public void setSnippet(String value) {
        JsoHelper.setAttribute(jsObj, "snippet", value);
    }

    public void setAuthor(KmlAuthor value) {
        JsoHelper.setAttribute(jsObj, "author", value.getJsObj());
    }

}
