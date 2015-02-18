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

public class FusionTablesQuery extends JsObject {

    public FusionTablesQuery() {
        jsObj = JsoHelper.createObject();
    }

    public void setFrom(String value) {
        JsoHelper.setAttribute(jsObj, "from", value);
    }

    public void setLimit(int value) {
        JsoHelper.setAttribute(jsObj, "limit", value);
    }

    public void setOffest(int value) {
        JsoHelper.setAttribute(jsObj, "offset", value);
    }

    public void setOrderBy(String value) {
        JsoHelper.setAttribute(jsObj, "orderBy", value);
    }

    public void setSelect(String value) {
        JsoHelper.setAttribute(jsObj, "select", value);
    }

    public void setWhere(String value) {
        JsoHelper.setAttribute(jsObj, "where", value);
    }

}
