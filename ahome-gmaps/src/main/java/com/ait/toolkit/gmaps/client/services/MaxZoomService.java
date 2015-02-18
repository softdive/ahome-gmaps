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

import com.ait.toolkit.gmaps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A service for obtaining the highest zoom level at which satellite imagery is
 * available for a given location
 */
public class MaxZoomService extends JavaScriptObject {

    protected MaxZoomService() {

    }

    /**
     * Creates a new instance of a MaxZoomService that can be used to send
     * queries about the maximum zoom level available for satellite imagery.
     * 
     * @return
     */
    public static native MaxZoomService newInstance()/*-{
		return new $wnd.google.maps.MaxZoomService();
    }-*/;

    /**
     * Returns the maximum zoom level available at a particular LatLng for the
     * Satellite map type. As this request is asynchronous, you must pass a
     * callback function which will be executed upon completion of the request,
     * being passed a MaxZoomResult.
     * 
     * @param latLgn
     * @param callBack
     */
    public final native void getMaxZoomAtLatLgn(LatLng latLgn, MaxZoomServiceHandler callBack)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$entry(jso
				.getMaxZoomAtLatLgn(
						latLgn.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(result) {
							var resultObject = @com.ait.toolkit.gmaps.client.services.MaxZoomResult::new(Lcom/google/gwt/core/client/JavaScriptObject;)(result);
							callBack.@com.ait.toolkit.gmaps.client.services.MaxZoomServiceHandler::onSuccess(Lcom/ait/toolkit/gmaps/client/services/MaxZoomResult;)(resultObject);
						}));
    }-*/;

}
