package com.xn.tianrun;

import com.xn.service.impl.UserServiceImpl;
import com.xn.service.impl.UserServiceImpl2;

import java.util.HashMap;
import java.util.Map;

public enum ThirdAiEnum {
    //	 ALIYUN("ALIYUN", AliYunServiceImpl.class),
//	 CHATTERBOT("CHATTERBOT", AiChatterBotServiceImpl.class),
    //枚举类中先加载有参构造，再加载静态代码块

    TULING("LAIYE", UserServiceImpl.class),
    BAIDUUNIT("BAIDUUNIT",UserServiceImpl2.class);

    private String name;
    private Class<?> aiServiceImpl;
    private static Map<String, ThirdAiEnum> envMap = new HashMap<String, ThirdAiEnum>();
    ThirdAiEnum(String name, Class<?> aiServiceImpl) {
        this.name=name;
        this.aiServiceImpl=aiServiceImpl;
    }
    static {
        for (ThirdAiEnum env : ThirdAiEnum.values()) {
            envMap.put(env.getName(), env);
        }
    }
    private String getName() {
        return name;
    }


    public static ThirdAiEnum getThirdAiEnumByName(String name) {
        if (!envMap.containsKey(name)){
            return null;
        }
        return envMap.get(name);
    }

    public Class<?> getAiServiceImpl() {
        return aiServiceImpl;
    }

    public static void main(String[] args) {
        ThirdAiEnum thirdAiEnum=ThirdAiEnum.getThirdAiEnumByName("LAIYE");
        Class<?> aiServiceImpl = thirdAiEnum.getAiServiceImpl();
        System.out.println(thirdAiEnum);
        System.out.println(aiServiceImpl);
    }
}
