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
package com.ait.toolkit.gmaps.client.libraries.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Utilities for polyline encoding and decoding.<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#encoding"
 * >Encoding Utils API Doc</a>
 */
public class Encoding {

    private Encoding() {

    }

    public static List<LatLng> decodePath(String encodedPath) {
        List<LatLng> toReturn = new ArrayList<LatLng>();
        JavaScriptObject peers = _decodePath(encodedPath);
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(LatLng.instance(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    private static native JavaScriptObject _decodePath(String encodedPath)/*-{
		return $wnd.google.maps.geometry.encoding.decodePath(encodedPath);
    }-*/;

    public static String encodePath(LatLng... latLngs) {
        return encodePath(Arrays.asList(latLngs));
    }

    public static String encodePath(List<LatLng> paths) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (LatLng latlng : paths) {
            peers.push(latlng.getJsObj());
        }
        return _encodePath(peers);
    }

    private static native String _encodePath(JavaScriptObject paths)/*-{
		return $wnd.google.maps.geometry.encoding.encodePath(paths);
    }-*/;

}
