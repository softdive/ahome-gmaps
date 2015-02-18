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
package com.ait.toolkit.gmaps.client;

import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.GMapOptions;
import com.ait.toolkit.gmaps.client.core.MapTypeId;
import com.ait.toolkit.gmaps.client.events.handlers.MapReadyHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

public class GMapWidget extends Widget {

	private GMap map;
	private GMapOptions options;
	private com.google.gwt.dom.client.Element div;

	public GMapWidget(GMapOptions options) {
		this.options = options;
		div = DOM.createDiv();
		setElement(div);
	}

	public GMapWidget(Element div, GMapOptions options) {
		this.options = options;
		this.div = div;
		setElement(div);
	}

	public GMapWidget(Element div) {
		this.options = createDefaultOption();
		this.div = div;
		setElement(div);
	}

	public GMapWidget() {
		this(createDefaultOption());
	}

	@Override
	protected void onAttach() {
		super.onAttach();
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			@Override
			public void execute() {
				setUpMap(div, options.getJsObj());
				GMapWidget.this.getElement().getStyle()
						.setWidth(Window.getClientWidth(), Unit.PX);
				GMapWidget.this.getElement().getStyle()
						.setHeight(Window.getClientHeight(), Unit.PX);
				GMapWidget.this.setWidth(Window.getClientWidth() + "px");
				GMapWidget.this.setHeight(Window.getClientHeight() + "px");
			}
		});
	}

	public void addMapReadyHandler(final MapReadyHandler handler) {
		new Timer() {
			@Override
			public void run() {
				if (map != null && map.getJsObj() != null) {
					cancel();
					handleReadyEvent(map.getJsObj(), handler);
				}
			}
		}.scheduleRepeating(500);

	}

	public GMap getMap() {
		return map;
	}

	private native void setUpMap(Element div, JavaScriptObject mapOptions)/*-{
		var map = new $wnd.google.maps.Map(div, mapOptions);
		this.@com.ait.toolkit.gmaps.client.GMapWidget::map = @com.ait.toolkit.gmaps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
	}-*/;

	private static GMapOptions createDefaultOption() {
		GMapOptions options = new GMapOptions();
		options.setCenter(new LatLng(6, 12));
		options.setZoom(5);
		options.setMapTypeId(MapTypeId.ROADMAP);
		return options;
	}

	private native void handleReadyEvent(JavaScriptObject map,
			MapReadyHandler handler)/*-{
		$wnd.google.maps.event
				.addListenerOnce(
						map,
						'tilesloaded',
						$entry(function() {
							handler.@com.ait.toolkit.gmaps.client.events.handlers.MapReadyHandler::onMapReady()();
						}));
	}-*/;

	public void strech() {
		this.getElement().getStyle().setWidth(Window.getClientWidth(), Unit.PX);
		this.getElement().getStyle()
				.setHeight(Window.getClientHeight(), Unit.PX);
		this.setWidth(Window.getClientWidth() + "px");
		this.setHeight(Window.getClientHeight() + "px");
	}

}
