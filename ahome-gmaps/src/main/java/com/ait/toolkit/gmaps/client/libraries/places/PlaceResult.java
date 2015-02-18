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
package com.ait.toolkit.gmaps.client.libraries.places;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.services.GeocoderAddressComponent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class PlaceResult extends JsObject {

    public PlaceResult() {
        jsObj = JsoHelper.createObject();
    }

    protected PlaceResult(JavaScriptObject peer) {
        jsObj = peer;
    }

    public List<GeocoderAddressComponent> getAddressComponents() {
        List<GeocoderAddressComponent> toReturn = new ArrayList<GeocoderAddressComponent>();
        JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "address_components");
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new GeocoderAddressComponent(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;

    }

    public List<PlaceAspectRating> getAspects() {
        List<PlaceAspectRating> toReturn = new ArrayList<PlaceAspectRating>();
        JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "aspects");
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PlaceAspectRating(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;

    }

    public String getFormattedAddress() {
        return JsoHelper.getAttribute(jsObj, "formatted_address");
    }

    public String getFormattedPhoneNumber() {
        return JsoHelper.getAttribute(jsObj, "formatted_phone_number");
    }

    public PlaceGeometry getGeometry() {
        JavaScriptObject peer = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "geometry");
        return new PlaceGeometry(peer);
    }

    public JsArrayString getHtmlAttributions() {
        return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "html_attributions").cast();
    }

    public String getIcon() {
        return JsoHelper.getAttribute(jsObj, "icon");
    }

    public String getId() {
        return JsoHelper.getAttribute(jsObj, "id");
    }

    public String getInternationalPhoneNumber() {
        return JsoHelper.getAttribute(jsObj, "international_phone_number");
    }

    public String getName() {
        return JsoHelper.getAttribute(jsObj, "name");
    }

    public boolean isPermanentlyClosed() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "permanently_closed");
    }

    public List<PlacePhoto> getPhotos() {
        List<PlacePhoto> toReturn = new ArrayList<PlacePhoto>();
        JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "photos");
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PlacePhoto(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    public int getPriceLevel() {
        return JsoHelper.getAttributeAsInt(jsObj, "price_level");
    }

    public double getRating() {
        return JsoHelper.getAttributeAsDouble(jsObj, "rating");
    }

    public String getReference() {
        return JsoHelper.getAttribute(jsObj, "reference");
    }

    public String getReviewSummary() {
        return JsoHelper.getAttribute(jsObj, "review_summary");
    }

    public List<PlaceReview> getReviews() {
        List<PlaceReview> toReturn = new ArrayList<PlaceReview>();
        JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "reviews");
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PlaceReview(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

    public JsArrayString getTypes() {
        return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "types").cast();
    }

    public String getUrl() {
        return JsoHelper.getAttribute(jsObj, "url");
    }

    public String getVicinity() {
        return JsoHelper.getAttribute(jsObj, "vicinity");
    }

    public String getWebsite() {
        return JsoHelper.getAttribute(jsObj, "website");
    }

    protected static List<PlaceResult> fromJsArray(JavaScriptObject peers) {
        List<PlaceResult> toReturn = new ArrayList<PlaceResult>();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PlaceResult(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

}
