package com.xn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@ServletComponentScan
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.xn")
public class Demo8Application {
	private static final String SERVICENAMW = "serverA";		//服务名
	private static final String AGENTHOST = "192.168.30.240"; 	//上报服务端IP
	private static final int AGENTUDPPORT = 6831;				//上报服务端UDP端口
	private static final int AGENTHTTPPORT = 14268;				//上报服务端TCP/HTTP端口
	/**
	 * 采样策略：
	 * const，全量采集, (1全量,0不采集)
	 * probabilistic ，概率采集，默认万份之一（必须在0.0和1.0之间）
	 * ratelimiting ，限速采集，每秒只能采集一定量的数据
	 * remotelycontrolled ，一种动态采集策略，根据当前系统的访问量调节采集策略---(待验证)
	 */
	private static final String SAMPLERCONFIG = "const";
	private static final Number SAMPLERCONFIGPARAM = 1;		//采样策略对应的定量
	private static final Integer MAXQUEUESIZE = 10000;		//上报最大队列

	public static void main(String[] args) {
		SpringApplication.run(Demo8Application.class, args);
	}

	@Bean
	public io.opentracing.Tracer tracer() {
		io.jaegertracing.Configuration config = new io.jaegertracing.Configuration(SERVICENAMW);
		io.jaegertracing.Configuration.SenderConfiguration sender = new io.jaegertracing.Configuration.SenderConfiguration();
		//链路追踪上报服务端地址
		//http
//		sender.withEndpoint("http://"+AGENTHOST+":"+AGENTHTTPPORT+"/api/traces");
		//UDP
		sender.withAgentHost(AGENTHOST);
		sender.withAgentPort(AGENTUDPPORT);
		// 设置用户名/密码/token
		//sender.withAuthUsername("");
		//sender.withAuthPassword("");
		//sender.withAuthToken("");
		config.withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType(SAMPLERCONFIG).withParam(SAMPLERCONFIGPARAM));
		config.withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withSender(sender).withMaxQueueSize(MAXQUEUESIZE));
		return config.getTracer();
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
