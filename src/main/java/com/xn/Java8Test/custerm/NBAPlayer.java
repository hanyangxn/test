package com.xn.Java8Test.custerm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NBAPlayer {
    @Bean
    LamdaInterface ii(){
        return name -> {
            System.out.println(name);
            return name;
        };
    }
    public void ww(){
        ii();
    }
    public static void main(String[] args) throws Exception{
        NBAPlayer nbaPlayer = new NBAPlayer();
        nbaPlayer.ww();
    }

}