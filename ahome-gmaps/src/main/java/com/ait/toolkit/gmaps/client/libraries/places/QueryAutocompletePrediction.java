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

public class QueryAutocompletePrediction extends JsObject {

    public QueryAutocompletePrediction() {
        jsObj = JsoHelper.createObject();
    }

    protected QueryAutocompletePrediction(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getDescription() {
        return JsoHelper.getAttribute(jsObj, "description");
    }

    public void setDescription(String value) {
        JsoHelper.setAttribute(jsObj, "description", value);
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

    protected static List<QueryAutocompletePrediction> fromJsArray(JavaScriptObject peers) {
        List<QueryAutocompletePrediction> toReturn = new ArrayList<QueryAutocompletePrediction>();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            toReturn.add(new QueryAutocompletePrediction(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return toReturn;
    }

}
