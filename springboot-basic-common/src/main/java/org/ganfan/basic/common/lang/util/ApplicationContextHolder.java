package org.ganfan.basic.common.lang.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-26 19:19
 **/
@Component
public class ApplicationContextHolder implements ApplicationContextAware {

	private static ApplicationContext APPLICATION_CTX = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// APPLICATION_CTX = ContextLoader.getCurrentWebApplicationContext();
		APPLICATION_CTX = applicationContext;
	}

	public static Environment getEnvironment() {
		return APPLICATION_CTX.getEnvironment();
	}

	public static <T> T getBean(Class<T> clazz) {
		return APPLICATION_CTX.getBean(clazz);
	}

	public static Object getBean(String name) {
		return APPLICATION_CTX.getBean(name);
	}

	public static <T> T getBean(String name, Class<T> clazz) {
		return APPLICATION_CTX.getBean(name, clazz);
	}

	public static <T> Map<String, T> getBeansOfType(@Nullable Class<T> type) throws BeansException{
		return APPLICATION_CTX.getBeansOfType(type);
	}
}
