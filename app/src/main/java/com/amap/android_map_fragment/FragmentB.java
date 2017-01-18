package com.amap.android_map_fragment;

import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;

/**
 *
 */
public class FragmentB extends FragmentBase {
    public static final LatLng HANGZHOU = new LatLng(30.287459,120.153576);// 杭州市经纬度
    protected static CameraPosition cameraPosition;
    @Override
    LatLng getTarget() {
        return HANGZHOU;
    }

    @Override
    CameraPosition getCameraPosition() {
        return cameraPosition;
    }

    @Override
    void setCameraPosition(CameraPosition cameraPosition) {
        FragmentB.cameraPosition = cameraPosition;
    }
}
