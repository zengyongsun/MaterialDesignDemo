package com.zy.materialdesigndemo.bean;

import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;

import java.io.Serializable;

/**
 * @author : Zeyo
 * e-mail : zengyongsun@163.com
 * date   : 2018/8/1416:05
 * desc   :
 * version: 1.0
 */
public class TransitionBean implements Serializable{

    public TransitionBean(int imgSrc, String content) {
        this.imgSrc = imgSrc;
        this.content = content;
    }

    @DrawableRes
    public int imgSrc;
    public String content;
}
