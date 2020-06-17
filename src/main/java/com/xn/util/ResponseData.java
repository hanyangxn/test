package com.xn.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Json输出封装类
 * @author Administrator
 *
 */
public class ResponseData implements Serializable{  
      
    /**
	 * 
	 */
	private static final long serialVersionUID = -4492410631034172768L;

	public static final String ERRORS_KEY = "errors";  
      
    private String message;
    private  int code;  
    private  Map<String, Object> data = new HashMap<String, Object>();
  
    public String getMessage() {  
        return message;  
    }  
  
    public int getCode() {  
        return code;  
    }  
  
    public Map<String, Object> getData() {  
        return data;  
    }  
      
    public ResponseData putDataValue(String key, Object value) {  
        data.put(key, value);  
        return this;  
    }  
      
    private ResponseData(int code, String message) {  
        this.code = code;  
        this.message = message;  
    }  
      
    public static ResponseData ok() {  
        return new ResponseData(200, "Ok");  
    }  
      
    public static ResponseData notFound() {  
        return new ResponseData(404, "Not Found");  
    }  
      
    public static ResponseData badRequest() {  
        return new ResponseData(400, "Bad Request");  
    }  
      
    public static ResponseData forbidden() {  
        return new ResponseData(403, "Forbidden");  
    }  
      
    public static ResponseData unauthorized() {  
        return new ResponseData(401, "unauthorized");  
    }  
      
    public static ResponseData serverInternalError() {  
        return new ResponseData(500, "Server Internal Error");  
    }  
      
    public static ResponseData customerError() {  
        return new ResponseData(10001, "Customer Error");  
    }
    public static ResponseData neverLogin() {  
        return new ResponseData(460, "never login!");  
    }
    public static ResponseData customerError(int code, String msg){
        return new ResponseData(code, msg);
    }

	@Override
	public String toString() {
		return "ResponseData [message=" + message + ", code=" + code + ", data=" + data + "]";
	}

	public ResponseData(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}

	public ResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}