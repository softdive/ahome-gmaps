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

/**
 * The top-level status about the request in general returned by the
 * DistanceMatrixService upon completion of a distance matrix request
 */

public enum DistanceMatrixElementStatus {

    NOT_FOUND("NOT_FOUND"), OK("OK"), ZERO_RESULT("ZERO_RESULT");

    private String value;

    public String getValue() {
        return value;
    }

    private DistanceMatrixElementStatus(String status) {
        value = createPeer(status);
    }

    private static native String createPeer(String status) /*-{
		return $wnd.google.maps.DistanceMatrixElementStatus[status];
    }-*/;

    public static native DistanceMatrixElementStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.DistanceMatrixElementStatus.NOT_FOUND:
			return @com.ait.toolkit.gmaps.client.services.DistanceMatrixElementStatus::NOT_FOUND;

		case $wnd.google.maps.DistanceMatrixElementStatus.OK:
			return @com.ait.toolkit.gmaps.client.services.DistanceMatrixElementStatus::OK;

		case $wnd.google.maps.DistanceMatrixElementStatus.ZERO_RESULT:
			return @com.ait.toolkit.gmaps.client.services.DistanceMatrixElementStatus::ZERO_RESULT;

		}
    }-*/;

}
