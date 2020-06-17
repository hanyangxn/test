package com.xn.yuyin;

import com.baidu.aip.speech.AipSpeech;
import com.baidu.aip.util.Util;
import org.json.JSONObject;

import java.io.IOException;

public class Sample2 {
    //设置APPID/AK/SK
    public static final String APP_ID = "10603970";
    public static final String API_KEY = "cFDPq4uQvsVoAi9Q59aOlwGL";
    public static final String SECRET_KEY = "82QgydDk3uqntCpSGR8erk7tMfFKZNK1";
    public static void main(String[] args) {
        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 调用接口
        JSONObject res = client.asr("output.wav", "wav", 16000, null);
        System.out.println(res.toString(1));

    }
}
