package com.polidea.reactnativeble.converter;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.polidea.rxandroidble.RxBleDevice;

public class RxBleDeviceConverter extends JSObjectConverter<RxBleDevice> {

    private interface Metadata {
        String UUID = "uuid";
        String NAME = "name";
        String RSSI = "rssi";

        String MANUFACTURER_DATA = "manufacturerData";
        String SERVICE_DATA = "serviceData";
        String SERVICE_UUIDS = "serviceUUIDs";
        String TX_POWER_LEVEL = "txPowerLevel";
        String SOLICITED_SERVICE_UUIDS = "solicitedServiceUUIDs";
        String IS_CONNECTABLE = "isConnectable";
        String OVERFLOW_SERVICE_UUIDS = "overflowServiceUUIDs";
    }

    @Override
    public WritableMap toJSObject(RxBleDevice value) {
        WritableMap result = Arguments.createMap();
        result.putString(Metadata.UUID, value.getMacAddress());
        result.putString(Metadata.NAME, value.getName());

        // Advertisement data is not set
        result.putNull(Metadata.RSSI);
        result.putNull(Metadata.MANUFACTURER_DATA);
        result.putNull(Metadata.SERVICE_DATA);
        result.putNull(Metadata.SERVICE_UUIDS);
        result.putNull(Metadata.TX_POWER_LEVEL);
        result.putNull(Metadata.SOLICITED_SERVICE_UUIDS);
        result.putNull(Metadata.IS_CONNECTABLE);
        result.putNull(Metadata.OVERFLOW_SERVICE_UUIDS);

        return result;
    }
}
