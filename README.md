# android-map-fragment
本工程为基于高德地图Android SDK进行封装，实现Fragment并加载地图。
## 前述 ##
- [高德官网申请Key](http://lbs.amap.com/dev/#/).
- 阅读[参考手册](http://a.amap.com/lbs/static/unzip/Android_Map_Doc/index.html).
- 工程基于Android 3D地图SDK实现

## 功能描述 ##
本工程为基于高德地图Android SDK进行封装，实现Fragment切换并加载地图。
## 效果图如下 ##
### APP显示效果###

![Screenshot](https://raw.githubusercontent.com/amap-demo/android-map-fragment/master/apk/picture.jpg)    

## 扫一扫安装##
![Screenshot]( https://raw.githubusercontent.com/amap-demo/android-map-fragment/master/apk/download.png) 

## 核心难点 ##
Fragment中地图用TextureMapView，TextureMapView可以有效实现Fragment切换动画效果。

Demo中的Fragment切换采用replace方法，可也可以采用hide/show方法。

注意：在采用hide/show方法时，可能会消耗内存，而且注意地图要用TextureMapView实现，MapView是SurfaceView，不可以叠加。
