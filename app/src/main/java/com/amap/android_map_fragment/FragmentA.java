package com.amap.android_map_fragment;

import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;

/**
 *
 */
public class FragmentA extends FragmentBase{
    public static final LatLng BEIJING = new LatLng(39.90403, 116.407525);// 北京市经纬度
    protected static CameraPosition cameraPosition;

    @Override
    LatLng getTarget() {
        return BEIJING;
    }

    @Override
    CameraPosition getCameraPosition() {
        return cameraPosition;
    }

    @Override
    void setCameraPosition(CameraPosition cameraPosition) {
        FragmentA.cameraPosition = cameraPosition;
    }

}
