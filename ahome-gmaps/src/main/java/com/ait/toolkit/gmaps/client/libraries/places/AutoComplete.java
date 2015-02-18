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

import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * A service to provide Place predictions based on a user's text input. It
 * attaches to an input element of type text, and listens for text entry in that
 * field. The list of predictions is presented as a drop-down list, and is
 * updated as text is entered. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#Autocomplete"
 * >Autocomplete API Doc</a>
 */
public class AutoComplete extends MVCObject {

    public AutoComplete(Element inputField) {
        jsObj = createPeer(inputField);
    }

    public AutoComplete(Element inputField, AutoCompleteOptions options) {
        jsObj = createPeer(inputField, options.getJsObj());
    }

    protected AutoComplete(JavaScriptObject obj) {
        jsObj = obj;
    }

    private native JavaScriptObject createPeer(Element element)/*-{
		return $wnd.google.maps.places.Autocompleter(element);
    }-*/;

    private native JavaScriptObject createPeer(Element element, JavaScriptObject options)/*-{
		return $wnd.google.maps.places.Autocompleter(element, options);
    }-*/;

}
