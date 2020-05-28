# AngleGradientTextView


<p align="center">
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
>  implementation 'com.github.AnglePengCoding:AngleGradientTextView:1.0.3'
> ```



##### xml

```java
 <angle.com.angle_gradinet_library.AngleGradientTextView
        android:textSize="30sp"
        android:id="@+id/mAgt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="AngleScanTextView"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```



##### activity

```java

        AngleGradientTextView mAgt =findViewById(R.id.mAgt);
        mAgt.setDelayMilliseconds(500);
        mAgt.setScanPositions(new float[]{0f,0.5f,1f});
		...
```



**参数可选择设置，不设置也可使用，非强制性设置参数！**



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

* **有需要改善或者增加功能，各位小伙伴发我邮箱哦**

* **你们得支持就是我的动力！！**

  

  
