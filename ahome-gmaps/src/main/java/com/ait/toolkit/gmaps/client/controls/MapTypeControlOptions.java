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
package com.ait.toolkit.gmaps.client.controls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.core.MapTypeId;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Options for the rendering of the map type control.
 */
public class MapTypeControlOptions extends JsObject {

	public MapTypeControlOptions() {
		jsObj = JsoHelper.createObject();
	}

	public MapTypeControlOptions(JavaScriptObject obj) {
		super(obj);
	}

	/**
	 * Position id. Used to specify the position of the control on the map. The
	 * default position is TOP_RIGHT.
	 * 
	 * @return
	 */
	public final ControlPosition getPosition() {
		return ControlPosition.fromValue(_getPosition());
	}

	private final String _getPosition() {
		return JsoHelper.getAttribute(jsObj, "position");
	}

	public final void setPosition(ControlPosition position) {
		this.setPosition(position.getValue());
	}

	private final void setPosition(String value) {
		JsoHelper.setAttribute(jsObj, "position", value);
	}

	/**
	 * Style id. Used to select what style of map type control to display.
	 * 
	 * @param style
	 */
	public final void setStyle(MapTypeControlStyle style) {
		this.setStyle(style.getValue());
	}

	private void setStyle(String value) {
		JsoHelper.setAttribute(jsObj, "style", value);
	}

	public final MapTypeControlStyle getStyle() {
		return MapTypeControlStyle.fromValue(_getStyle());
	}

	private final String _getStyle() {
		return JsoHelper.getAttribute(jsObj, "style");
	}

	/**
	 * IDs of map types to show in the control.
	 * 
	 * @param values
	 */
	private void setMapTypeIds(JsArrayString values) {
		JsoHelper.setAttribute(jsObj, "mapTypeIds", values);
	}

	/**
	 * IDs of map types to show in the control.
	 * 
	 * @param ids
	 */

	public final void setMapTypesIds(MapTypeId... ids) {
		setMapTypeIds(Arrays.asList(ids));
	}

	public final void setMapTypeIds(List<MapTypeId> ids) {
		JsArrayString strings = JsArrayString.createArray().cast();
		for (MapTypeId id : ids) {
			strings.push(id.getValue());
		}
		setMapTypeIds(strings);
	}

	/**
	 * IDs of map types to show in the control.
	 * 
	 */
	public final ArrayList<MapTypeId> getMapTypeIds() {
		ArrayList<MapTypeId> ids = new ArrayList<MapTypeId>();
		JsArrayString values = _getMapTypeIds();
		for (int index = 0; index < values.length(); index++) {
			ids.add(MapTypeId.fromValue(values.get(index)));
		}
		return ids;
	}

	private final native JsArrayString _getMapTypeIds()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mapTypeIds;
	}-*/;

}
