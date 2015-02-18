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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class PanoramioFeature extends JsObject {

    public PanoramioFeature() {
        jsObj = JsoHelper.createObject();
    }

    protected PanoramioFeature(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setAuthor(String value) {
        JsoHelper.setAttribute(jsObj, "author", value);
    }

    public String getAuthor() {
        return JsoHelper.getAttribute(jsObj, "author");
    }

    public void setPhotoId(String value) {
        JsoHelper.setAttribute(jsObj, "photoId", value);
    }

    public String getPhotoId() {
        return JsoHelper.getAttribute(jsObj, "photoId");
    }

    public void setTitle(String value) {
        JsoHelper.setAttribute(jsObj, "title", value);
    }

    public String getTitle() {
        return JsoHelper.getAttribute(jsObj, "title");
    }

    public void setUrl(String value) {
        JsoHelper.setAttribute(jsObj, "url", value);
    }

    public String getUrl() {
        return JsoHelper.getAttribute(jsObj, "url");
    }

    public void setUserId(String value) {
        JsoHelper.setAttribute(jsObj, "userId", value);
    }

    public String getUserId() {
        return JsoHelper.getAttribute(jsObj, "userId");
    }
}
