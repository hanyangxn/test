package com.xn.moshi.guanchazhe;

/**
 * Created by Administrator on 2018/12/19.
 */
public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
