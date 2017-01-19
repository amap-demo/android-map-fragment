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
本示例中的地图用采用TextureMapView，TextureMapView可以有效实现Fragment切换动画效果。

本示例中的Fragment切换采用replace方法，可也可以采用hide/show方法。

MapView和TextureMapView的区别在于：TextureMapView是一个TextureView而MapView是一个GLSurfaceView。

在Fragment切换时，如果采用hide/show方式，地图是叠在一起的，GlSurfaceView叠放会出现穿透现象，建议使用TextureMapView避免这个问题。

采用TextureMapView，可以避免Fragment切换动画的黑边，或者是replace时有黑屏闪一下的问题。

如果想采用hide/show方法切换Fragment，请注意一下内存的消耗。


