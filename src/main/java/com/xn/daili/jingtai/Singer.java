package com.xn.daili.jingtai;

import com.xn.daili.jingtai.ISinger;

public class Singer implements ISinger {
    @Override
    public void sing() {
        System.out.println("唱一首歌");
    }

}
