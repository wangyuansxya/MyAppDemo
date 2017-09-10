该项目是为了搭建一个新的app的开发基础架构

项目中使用的第三方的框架都是使用wrapper的形式引入的。目的是为了方便更换新的框架的时候使用
项目设计的基本思想就是高内聚，低耦合。尽量的保证各个模块直接的关系尽量的少


1，网络请求的框架：okHttp

2，图片的加载框架：Picasso。至于为什么没有选择Glide和Fresco可以自行google，三个框架各有优势。因此使用的时候可以根据app的特点来确定

3，消息通知框架：EventBus


总结一点：我们在决定使用一个第三方的框架的时候，需要充分的了解框架的实现原理，引入项目带来的收益和可能出现的问题。充分了解分析之后再决定


在项目开发过程中，难免有这样的情况，一个页面在数据异常的时候，需要根据异常的原因显示一些错误的页面。这就需要我们写一个基类来实现这些功能。

同理，在网络请求的时候，http协议已经帮我们处理过一个情况。例如200，302，404，500这些code来表示不的情况。
而在现实的项目中，只有这些还是远远不够的，当http返回的reponsecode是200的时候，返回的数据也不一定是我们需要的数据。
因此在接口定义的时候通常会约定好一个字段来表示不同的情况
但是我们依然需要处理在大部分的接口返回的约定好字段也是通用的，需要做统一的逻辑处理


android开发常用框架

响应式编程

RxJava

https://github.com/ReactiveX/RxJava

RxAndroid

https://github.com/ReactiveX/RxAndroid

消息通信

EventBus

组件间的消息通信

https://github.com/greenrobot/EventBus

注解框架

butterknife

View注解框架

https://github.com/JakeWharton/butterknife

dagger

Android和Java的依赖注入框架

https://github.com/google/dagger

数据解析

Gson

https://github.com/google/gson

fastjson

https://github.com/alibaba/fastjson

数据库

Realm

移动数据库SQLite&ORM替代者

https://github.com/realm/realm-java

ActiveAndroid

无需写sql语句

https://github.com/pardom/ActiveAndroid

greenDAO

轻量级、快速ORM解决方案

https://github.com/greenrobot/greenDAO

网络访问

OkHttp

良心组织square开源项目

https://github.com/square/okhttp

AndroidAsyncHttp

异步请求http库

https://github.com/loopj/android-async-http

retrofit

又是square出品的精品，该http请求库与dagger、rxjava为越来越多人使用的三剑客

https://github.com/square/retrofit

图片加载

Android-Universal-Image-Loader

非常流行图片加载库

https://github.com/nostra13/Android-Universal-Image-Loader

Glide

https://github.com/bumptech/glide

fresco

facebook出品，必属精品

https://github.com/facebook/fresco

picasso

https://github.com/square/picasso

多媒体操作

android-multipicker-library

图片、视频、文件、音乐、通讯录选择器

https://github.com/coomar2841/android-multipicker-library

Android-Image-Cropper

图片裁剪库

https://github.com/ArthurHub/Android-Image-Cropper

uCrop

https://github.com/Yalantis/uCrop

android-UniversalMusicPlayer

google的跨平台音乐播放器，支持手机、平板、手表和TV，是学习多平台的最好实例

https://github.com/googlesamples/android-UniversalMusicPlayer

PhotoView

图片手势操作放大缩小库

https://github.com/chrisbanes/PhotoView

设备相关

zxing

Java实现的条形码、二维码扫描开源库

https://github.com/zxing/zxing

zbar

C实现的条形码、二维码扫描库

https://github.com/ZBar/ZBar

barcodescanner

封装了zxing和zbar，更加简单的使用

https://github.com/dm77/barcodescanner

MVP相关

Android-CleanArchitecture

mvp架构学习实例

https://github.com/android10/Android-CleanArchitecture

android-architecture

google推荐的学习mvp架构的模版

https://github.com/googlesamples/android-architecture

其他

内存检测

leakcanary

https://github.com/square/leakcanary

简单、漂亮的日志打印工具

logger

https://github.com/orhanobut/logger