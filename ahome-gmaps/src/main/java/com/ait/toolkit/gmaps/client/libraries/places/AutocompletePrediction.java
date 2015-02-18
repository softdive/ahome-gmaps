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
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class AutocompletePrediction extends JsObject {

    public AutocompletePrediction() {
        jsObj = JsoHelper.createObject();
    }

    protected AutocompletePrediction(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getDescription() {
        return JsoHelper.getAttribute(jsObj, "description");
    }

    public void setDescription(String value) {
        JsoHelper.setAttribute(jsObj, "description", value);
    }

    public String getId() {
        return JsoHelper.getAttribute(jsObj, "id");
    }

    public void setId(String value) {
        JsoHelper.setAttribute(jsObj, "id", value);
    }

    public void setMatchedSubstrings(List<PredictionSubstring> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (PredictionSubstring value : values) {
            peers.push(value.getJsObj());
        }
        JsoHelper.setAttribute(jsObj, "matched_substrings", peers);

    }

    public void setMatchedSubstrings(PredictionSubstring... predictionSubstrings) {
        setMatchedSubstrings(Arrays.asList(predictionSubstrings));
    }

    public List<PredictionSubstring> getMatchedSubstrings() {
        List<PredictionSubstring> toReturn = new ArrayList<PredictionSubstring>();
        JavaScriptObject peer = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "matched_substrings");
        int size = JsoHelper.arrayLength(peer);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PredictionSubstring(JsoHelper.getValueFromJavaScriptObjectArray(peer, i)));
        }
        return toReturn;
    }

    public void setReference(String value) {
        JsoHelper.setAttribute(jsObj, "reference", value);
    }

    public String getReference() {
        return JsoHelper.getAttribute(jsObj, "reference");
    }

    public void setTerms(List<PredictionTerm> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (PredictionTerm value : values) {
            peers.push(value.getJsObj());
        }
        JsoHelper.setAttribute(jsObj, "temrs", peers);

    }

    public void setTerms(PredictionTerm... terms) {
        setTerms(Arrays.asList(terms));
    }

    public List<PredictionTerm> getTerms() {
        List<PredictionTerm> toReturn = new ArrayList<PredictionTerm>();
        JavaScriptObject peer = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "terms");
        int size = JsoHelper.arrayLength(peer);
        for (int i = 0; i < size; i++) {
            toReturn.add(new PredictionTerm(JsoHelper.getValueFromJavaScriptObjectArray(peer, i)));
        }
        return toReturn;
    }

    public void setTypes(String... types) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : types) {
            values.push(s);
        }
        JsoHelper.setAttribute(jsObj, "types", values);
    }

    public JsArrayString getTypes() {
        return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "types").cast();
    }

    protected static List<AutocompletePrediction> fromJsArray(JavaScriptObject peers) {
        List<AutocompletePrediction> toReturn = new ArrayList<AutocompletePrediction>();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new AutocompletePrediction(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

}
