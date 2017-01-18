package com.amap.android_map_fragment;

import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;

/**
 *
 */
public class FragmentC extends FragmentBase {
    public static final LatLng CHONGQING = new LatLng(29.533155,106.504962);// 重庆市经纬度
    protected static CameraPosition cameraPosition;
    @Override
    LatLng getTarget() {
        return CHONGQING;
    }

    @Override
    CameraPosition getCameraPosition() {
        return cameraPosition;
    }

    @Override
    void setCameraPosition(CameraPosition cameraPosition) {
        FragmentC.cameraPosition = cameraPosition;
    }
}
