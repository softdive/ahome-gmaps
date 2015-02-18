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

package com.ait.toolkit.gmaps.client.services;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A service for converting between an address and a LatLng.
 * 
 */
public class Geocoder extends JsObject {

    /**
     * Creates a new instance of a Geocoder that sends geocode requests to
     * Google servers.
     * 
     * @return
     */
    public Geocoder() {
        jsObj = create();
    }

    public native void geocode(GeocoderRequest request, GeocoderHandler callBack)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$entry(jso
				.geocode(
						request,
						function(results, status) {
							var geocoderStatus = @com.ait.toolkit.gmaps.client.services.GeocoderStatus::fromValue(Ljava/lang/String;)(status);
							var resultObject = @com.ait.toolkit.gmaps.client.services.ServicesUtil::creatGeocoderResultList(Lcom/google/gwt/core/client/JsArray;)(results);
							callBack.@com.ait.toolkit.gmaps.client.services.GeocoderHandler::onGeocode(Ljava/util/ArrayList;Lcom/ait/toolkit/gmaps/client/services/GeocoderStatus;)(resultObject, geocoderStatus);
						}));
    }-*/;

    private static native JavaScriptObject create() /*-{
		return new $wnd.google.maps.Geocoder();
    }-*/;

}
