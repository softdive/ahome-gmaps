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
package com.ait.toolkit.gmaps.client.core;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.events.handlers.MapEventHandler;
import com.ait.toolkit.gmaps.client.events.handlers.MouseEventHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class MVCObject extends JsObject {

    public MVCObject() {
        jsObj = JsoHelper.createObject();
    }

    public MVCObject(JavaScriptObject jsObj) {
        super(jsObj);
    }

    /**
     * Add an event listener to this object
     * 
     * @param event
     * @param handler
     */
    public void addEventListener(String event, Function handler) {
        EventDispatcher.addEventListener(this.getJsObj(), event, handler);
    }

    public void addMouseEventHandler(String event, MouseEventHandler handler) {
        EventDispatcher.addMouseEventHandler(getJsObj(), event, handler);
    }

    /**
     * Add an event listener to this object one time.
     * 
     * @param event
     * @param handler
     */
    public void addEventListenerOnce(String event, Function handler) {
        EventDispatcher.addEventListenerOnce(this.getJsObj(), event, handler);
    }

    public void clearListeners(String eventName) {
        EventDispatcher.clearListeners(this.getJsObj(), eventName);
    }

    public void clearInstanceListeners() {
        EventDispatcher.clearInstanceListeners(this.getJsObj());
    }

    public void addEventListener(String eventName, MapEventHandler handler) {
        EventDispatcher.addEventListener(this.getJsObj(), eventName, handler);
    }

    public void addEventListenerOnce(String eventName, MapEventHandler handler) {
        EventDispatcher.addEventListenerOnce(this.getJsObj(), eventName, handler);
    }

    /**
     * Binds a View to a Model.
     * 
     * @param key
     * @param target
     */
    public native void bindTo(String key, MVCObject target)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this
				.bindTo(
						key,
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Binds a View to a Model.
     * 
     * @param key
     * @param target
     */
    public native void bindTo(String key, MVCObject target, String targetKey)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this
				.bindTo(
						key,
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						targetKey);
    }-*/;

    /**
     * Binds a View to a Model.
     * 
     * @param key
     * @param target
     */
    public native void bindTo(String key, MVCObject target, String targetKey, boolean notify)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this
				.bindTo(
						key,
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						targetKey, notify);
    }-*/;

    /**
     * Gets a value.
     * 
     * @param <T>
     * @param key
     * @return
     */
    public native <T> T get(String key)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.get(key);
    }-*/;

    /**
     * Notify all observers of a change on this property. This notifies both
     * objects that are bound to the object's property as well as the object
     * that it is bound to.
     * 
     * @param key
     */
    public native void notify(String key)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.notify(key);
    }-*/;

    /**
     * Sets a value
     * 
     * @param key
     * @param value
     */
    public native void set(String key, Object value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.set(key, value);
    }-*/;

    /**
     * Sets a collection of key-value pairs.
     * 
     * @param values
     */
    public native void setValues(Object values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setValues(values);
    }-*/;

    /**
     * Removes a binding. Unbinding will set the unbound property to the current
     * value. The object will not be notified, as the value has not changed.
     * 
     */
    public native void unbind(String key)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.unbind(key);
    }-*/;

    /**
     * Removes all bindings.
     */
    public native void unbindAll()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.unbindAll();
    }-*/;

}
