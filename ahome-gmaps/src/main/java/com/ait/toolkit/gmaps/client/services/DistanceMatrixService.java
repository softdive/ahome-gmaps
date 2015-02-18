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
 * A service for computing distances between multiple origins and destinations.
 * 
 */
public class DistanceMatrixService extends JsObject {

    /**
     * Creates a new instance of a DistanceMatrixService that sends distance
     * matrix queries to Google servers.
     */
    public DistanceMatrixService() {
        jsObj = create();
    }

    /**
     * Issues a distance matrix request.
     * 
     * @param request
     * @param callBack
     */
    public native void getDistanceMatrix(DistanceMatrixRequest request, DistanceMatrixServiceHandler callBack)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$entry(jso
				.getDistanceMatrix(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(response, status) {
							var responseStatus = @com.ait.toolkit.gmaps.client.services.DistanceMatrixStatus::fromValue(Ljava/lang/String;)(status);
							var responseObject = @com.ait.toolkit.gmaps.client.services.DistanceMatrixResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(response);
							callBack.@com.ait.toolkit.gmaps.client.services.DistanceMatrixServiceHandler::onSuccess(Lcom/ait/toolkit/gmaps/client/services/DistanceMatrixResponse;Lcom/ait/toolkit/gmaps/client/services/DistanceMatrixStatus;)(responseObject, responseStatus);
						}));
    }-*/;

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.DistanceMatrixService();
    }-*/;

}
