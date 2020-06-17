package com.xn.test10;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Json输出封装类
 * @author Administrator
 *
 */
public class BaiDuResponseData implements Serializable{

    /**
	 *
	 */
	private static final long serialVersionUID = -4492410631034172768L;

	public static final String ERRORS_KEY = "errors";

    private String error_msg;
    private  int error_code;
    private  Map<String, Object> result = new HashMap<String, Object>();

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public BaiDuResponseData(String error_msg, int error_code) {
        this.error_msg = error_msg;
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "BaiDuResponseData{" +
                "error_msg='" + error_msg + '\'' +
                ", error_code=" + error_code +
                ", result=" + result +
                '}';
    }

    public BaiDuResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}