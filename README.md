# AngleGradientTextView


<p align="center">
   <a href="https://bintray.com/jessyancoding/maven/MVPArms/_latestVersion">
    <img src="https://img.shields.io/badge/Jcenter-v1.0.2-brightgreen.svg?style=flat-square" alt="Latest Stable Version" />
  </a>
</p>

<h2 align="center">扫描字体控件，仿音乐播放，二维码字体</h2>





![gif演示](C:\Users\Administrator\Desktop\ww.gif)



## **使用**姿势



根build

```java
maven { url 'https://jitpack.io' }
```



> build添加
>
> ```java
> implementation 'com.github.liuhongpengliu:AngleGradientTextView:v1.0.2'
> ```





支持扫描时间，数值越大扫描速度越慢

```java
  /**
     * 扫描时间
     *
     */
    mAgt.setDelayMilliseconds(1);

```



支持扫描颜色，如果不设置默认白色和黑色

```java
    /**
         * 扫描颜色
         * 数组长度为3
         * 否则抛出下标异常
         *
         */
	mAgt.setScanColors(new int[]{xxx,xxx,xxx});

```



支持扫描渐变色，如果不设置默认0-0.5-1

```java
	  /**
     * 扫描渐变设置
     * 数组长度为3
     * 否则抛出下标异常
     * @param positions 扫描渐变设置
     */
	mAgt.setScanPositions(new float[]{xxx,xxx,xxx});
```



## About Me And Proposal
* **Email**: <1016305858@qq.com>  

* 有需要完善功能请发邮箱

  

  