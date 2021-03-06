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
package com.ait.toolkit.gmaps.client.streetview;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;

/**
 * A StreetViewService object performs searches for Street View data.
 * 
 */
public class StreetViewService extends JsObject {

    public StreetViewService() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Retrieves the data for the given pano id and passes it to the provided
     * callback as a StreetViewPanoramaData object. Pano ids are unique per
     * panorama and stable for the lifetime of a session, but are liable to
     * change between sessions.
     */
    public native void getPanoramaById(String pano, StreetViewServiceHandler callBack)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$entry(jso
				.getPanoramaById(
						pano.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(data, status) {
							var streetViewStatus = @com.ait.toolkit.gmaps.client.streetview.StreetViewStatus::fromValue(Ljava/lang/String;)(status);
							var dataObject = @com.ait.toolkit.gmaps.client.streetview.StreetviewPanoramaData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
							callBack.@com.ait.toolkit.gmaps.client.streetview.StreetViewServiceHandler::onSuccess(Lcom/ait/toolkit/gmaps/client/streetview/StreetviewPanoramaData;Lcom/ait/toolkit/gmaps/client/streetview/StreetViewStatus;)(dataObject,streetViewStatus);
						}));
    }-*/;

    /**
     * Retrieves the StreetViewPanoramaData for a panorama within a given radius
     * of the given LatLng. The StreetViewPanoramaData is passed to the provided
     * callback. If the radius is less than 50 meters, the nearest panorama will
     * be returned.
     * 
     * @param latLgn
     * @param radius
     * @param callBack
     */
    public native void getPanoramaByLocation(LatLng latLgn, double radius, StreetViewServiceHandler callBack)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$entry(jso
				.getPanoramaByLocation(
						latLgn.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						radius,
						function(data, status) {
							var streetViewStatus = @com.ait.toolkit.gmaps.client.streetview.StreetViewStatus::fromValue(Ljava/lang/String;)(status);
							var dataObject = @com.ait.toolkit.gmaps.client.streetview.StreetviewPanoramaData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
							callBack.@com.ait.toolkit.gmaps.client.streetview.StreetViewServiceHandler::onSuccess(Lcom/ait/toolkit/gmaps/client/streetview/StreetviewPanoramaData;Lcom/ait/toolkit/gmaps/client/streetview/StreetViewStatus;)(dataObject,streetViewStatus);
						}));
    }-*/;

}
