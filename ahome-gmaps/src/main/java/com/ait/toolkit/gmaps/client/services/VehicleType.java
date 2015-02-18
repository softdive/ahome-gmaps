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

public enum VehicleType {

    BUS("BUS"), CABLE_CAR("CABLE_CAR"), COMMUTER_TRAIN("COMMUTER_TRAIN"), FERRY("FERRY"), FENICULAR("FENICULAR"), GONDOLA_LIFT(
                    "GONDOLA_LIFT"), HEAVY_RAIL("HEAVY_RAIL"), HIGH_SPEED_TRAIN("HIGH_SPEED_TRAIN"), INTERCITY_BUS(
                    "INTERCITY_BUS"), METRO_RAIL("METRO_RAIL"), MONORAIL("MONORAIL"), OTHER("OTHER"), RAIL("RAIL"), SHARE_TAXI(
                    "SHARE_TAXI"), TRAM("TRAM"), TROLLEYBUS("TROLLEYBUS"), SUBWAY("SUBWAY");

    private String value;

    public String getValue() {
        return value;
    }

    private VehicleType(String mode) {
        value = createPeer(mode);
    }

    private static native String createPeer(String mode) /*-{
		return $wnd.google.maps.VehicleType[mode];
    }-*/;

    public static native VehicleType fromValue(String value) /*-{
		switch (value) {

		case 'BUS':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::BUS;

		case 'CABLE_CAR':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::CABLE_CAR;

		case 'COMMUTER_TRAIN':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::COMMUTER_TRAIN;

		case 'GONDOLA_LIFT':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::GONDOLA_LIFT;

		case 'FERRY':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::FERRY;

		case 'FUNICULAR':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::FENICULAR;

		case 'GONDOLA_LIFT':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::GONDOLA_LIFT;

		case 'HEAVY_RAIL':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::HEAVY_RAIL;

		case 'HIGH_SPEED_TRAIN':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::HIGH_SPEED_TRAIN;

		case 'INTERCITY_BUS':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::INTERCITY_BUS;

		case 'METRO_RAIL':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::METRO_RAIL;

		case 'MONORAIL':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::MONORAIL;

		case 'OTHER':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::OTHER;

		case 'RAIL':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::RAIL;

		case 'SHARE_TAXI':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::SHARE_TAXI;

		case 'SUBWAY':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::SUBWAY;

		case 'TRAM':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::TRAM;

		case 'TROLLEYBUS':
			return @com.ait.toolkit.gmaps.client.services.VehicleType::TROLLEYBUS;
		}
    }-*/;

}
