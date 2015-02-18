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

public class AutoCompleteService extends MVCObject {

    public AutoCompleteService() {
        jsObj = createPeer();
    }

    public native void getPlacePredictions(AutoCompletionRequest request, PlacePredictionsHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.getPlacePredictions(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(predictions, status) {
							var p = @com.ait.toolkit.gmaps.client.libraries.places.AutocompletePrediction::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(predictions);
							var s = @com.ait.toolkit.gmaps.client.libraries.places.PlacesServiceStatus::fromValue(Ljava/lang/String;)(status);
							handler.@com.ait.toolkit.gmaps.client.libraries.places.PlacePredictionsHandler::onEvent(Ljava/util/List;Lcom/ait/toolkit/gmaps/client/libraries/places/PlacesServiceStatus;)(p,s);
						}));
    }-*/;

    public native void getQueryPredictions(QueryAutoCompletionRequest request, QueryPredictionsHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.getQueryPredictions(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(predictions, status) {
							var p = @com.ait.toolkit.gmaps.client.libraries.places.QueryAutocompletePrediction::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(predictions);
							var s = @com.ait.toolkit.gmaps.client.libraries.places.PlacesServiceStatus::fromValue(Ljava/lang/String;)(status);
							handler.@com.ait.toolkit.gmaps.client.libraries.places.QueryPredictionsHandler::onEvent(Ljava/util/List;Lcom/ait/toolkit/gmaps/client/libraries/places/PlacesServiceStatus;)(p,s);
						}));
    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.google.maps.places.AutocompleteService();
    }-*/;

}
