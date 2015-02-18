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
package com.ait.toolkit.gmaps.client.overlays;

public enum StrokePosition {

    CENTER("CENTER"), INSIDE("INSIDE"), OUTSIDE("OUTSIDE");

    private String pos;

    private StrokePosition(String value) {
        this.pos = getValue(value);
    }

    private static native String getValue(String value)/*-{
		return $wnd.google.maps.StrokePosition.StrokePosition[value];
    }-*/;

    public String getValue() {
        return this.pos;
    }
}
