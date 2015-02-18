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
package com.ait.toolkit.gmaps.client.libraries.places;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class PlaceReview extends JsObject {

    public PlaceReview() {
        jsObj = JsoHelper.createObject();
    }

    protected PlaceReview(JavaScriptObject peer) {
        jsObj = peer;
    }

    public String getAuthorName() {
        return JsoHelper.getAttribute(jsObj, "author_name");
    }

    public String getAutoUrl() {
        return JsoHelper.getAttribute(jsObj, "author_url");
    }

    public String getText() {
        return JsoHelper.getAttribute(jsObj, "text");
    }

    public List<PlaceAspectRating> getAspects() {
        List<PlaceAspectRating> toReturn = new ArrayList<PlaceAspectRating>();
        JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "aspects");
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PlaceAspectRating(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;

    }

}
