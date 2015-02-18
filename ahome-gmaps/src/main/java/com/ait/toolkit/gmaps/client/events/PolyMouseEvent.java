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
package com.ait.toolkit.gmaps.client.events;


/**
 * This object is returned from mouse events on polylines and polygons.
 */
public class PolyMouseEvent extends MouseEvent {

    protected PolyMouseEvent() {

    }

    public final native double getEdge()/*-{
		return this.edge;
    }-*/;

    public final native double getPath()/*-{
		return this.path;
    }-*/;

    public final native double getVertex()/*-{
		return this.vertex;
    }-*/;
}
