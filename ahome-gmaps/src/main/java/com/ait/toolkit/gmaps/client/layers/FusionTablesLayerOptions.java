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

import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.GMap;
import com.google.gwt.core.client.JavaScriptObject;

public class FusionTablesLayerOptions extends JsObject {

    public FusionTablesLayerOptions() {
        jsObj = JsoHelper.createObject();
    }

    public void setClickable(boolean value) {
        JsoHelper.setAttribute(jsObj, "clickable", value);
    }

    public void setMap(GMap map) {
        JsoHelper.setAttribute(jsObj, "map", map.getJsObj());
    }

    public void setSuppressInfoWindow(boolean value) {
        JsoHelper.setAttribute(jsObj, "suppressInfoWindow", value);
    }

    public void setHeatmap(FusionTablesHeatmap heatMap) {
        JsoHelper.setAttribute(jsObj, "fusionsTablesHeatmap", heatMap.getJsObj());
    }

    public void setQuery(FusionTablesQuery query) {
        JsoHelper.setAttribute(jsObj, "fusionsTablesQuery", query.getJsObj());
    }

    public void setStyles(List<FusionTablesStyle> styles) {
        JavaScriptObject peers = JsoHelper.createJavaScriptArray();
        for (int i = 0; i < styles.size(); i++) {
            JsoHelper.setArrayValue(peers, i, styles.get(i).getJsObj());
        }
        JsoHelper.setAttribute(peers, "styles", peers);
    }

    public void setStyles(FusionTablesStyle... fusionTablesStyles) {
        setStyles(Arrays.asList(fusionTablesStyles));
    }

}
