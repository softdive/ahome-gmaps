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

import com.ait.toolkit.gmaps.client.GMap;
import com.ait.toolkit.gmaps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class PlacesService extends MVCObject {

    public PlacesService(GMap map) {
        jsObj = createPeer(map.getJsObj());
    }

    public PlacesService(Element htmlDivElement) {
        jsObj = createPeer(htmlDivElement);
    }

    public native void getDetails(PlaceDetailsRequest request, PlaceDetailsHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.getDetails(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(resut, status) {
							var r = @com.ait.toolkit.gmaps.client.libraries.places.PlaceResult::new(Lcom/google/gwt/core/client/JavaScriptObject;)(result);
							var s = @com.ait.toolkit.gmaps.client.libraries.places.PlacesServiceStatus::fromValue(Ljava/lang/String;)(status);
							handler.@com.ait.toolkit.gmaps.client.libraries.places.PlaceDetailsHandler::onEvent(Lcom/ait/toolkit/gmaps/client/libraries/places/PlaceResult;Lcom/ait/toolkit/gmaps/client/libraries/places/PlacesServiceStatus;)(r,s);
						}));
    }-*/;

    public native void nearbySearch(PlaceSearchRequest request, PlaceNearBySearchHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.nearbySearch(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(results, status, pagination) {
							var r = @com.ait.toolkit.gmaps.client.libraries.places.PlaceResult::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(predictions);
							var s = @com.ait.toolkit.gmaps.client.libraries.places.PlacesServiceStatus::fromValue(Ljava/lang/String;)(status);
							var p = @com.ait.toolkit.gmaps.client.libraries.places.PlaceSearchPagination::new(Lcom/google/gwt/core/client/JavaScriptObject;)(pagination);
							handler.@com.ait.toolkit.gmaps.client.libraries.places.PlaceNearBySearchHandler::onEvent(Ljava/util/List;Lcom/ait/toolkit/gmaps/client/libraries/places/PlacesServiceStatus;Lcom/ait/toolkit/gmaps/client/libraries/places/PlaceSearchPagination;)(r,s,p);
						}));
    }-*/;

    public native void radarSearch(RadarSearchRequest request, PlaceSearchHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.radarSearch(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(results, status) {
							var r = @com.ait.toolkit.gmaps.client.libraries.places.PlaceResult::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(predictions);
							var s = @com.ait.toolkit.gmaps.client.libraries.places.PlacesServiceStatus::fromValue(Ljava/lang/String;)(status);
							handler.@com.ait.toolkit.gmaps.client.libraries.places.PlaceSearchHandler::onEvent(Ljava/util/List;Lcom/ait/toolkit/gmaps/client/libraries/places/PlacesServiceStatus;)(r,s)
						}));
    }-*/;

    public native void textSearch(TextSearchRequest request, PlaceSearchHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.textSearch(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(results, status) {
							var r = @com.ait.toolkit.gmaps.client.libraries.places.PlaceResult::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(predictions);
							var s = @com.ait.toolkit.gmaps.client.libraries.places.PlacesServiceStatus::fromValue(Ljava/lang/String;)(status);
							handler.@com.ait.toolkit.gmaps.client.libraries.places.PlaceSearchHandler::onEvent(Ljava/util/List;Lcom/ait/toolkit/gmaps/client/libraries/places/PlacesServiceStatus;)(r,s)
						}));
    }-*/;

    private native JavaScriptObject createPeer(JavaScriptObject el)/*-{
		return new $wnd.google.maps.places.PlacesService();
    }-*/;

    private native JavaScriptObject createPeer(Element htmlDivElement)/*-{
		return new $wnd.google.maps.places.PlacesService(htmlDivElement);
    }-*/;
}
