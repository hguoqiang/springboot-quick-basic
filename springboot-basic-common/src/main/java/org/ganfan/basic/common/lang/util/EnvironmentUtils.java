package org.ganfan.basic.common.lang.util;


import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;

import java.net.UnknownHostException;


/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-26 19:19
 **/
public class EnvironmentUtils {

    /**
     * 获取应用名
     *
     * @return
     */
    public static String getApplicationName() {
        // 获取spring的应用名
        String applicationName = getString("spring.application.name");
        if (StringUtils.isEmpty(applicationName)) {
            // 如果不存在则取应用名
            applicationName = getString("application.name");
        }

        return applicationName;
    }

    /**
     * 获取应用服务器端完整地址(ip:port)
     *
     * @return
     */
    public static String getServerFullAddress() throws UnknownHostException {
        String fullAddress = NetUtils.getHostAddress();
        Integer port = getServerPort();
        if (port != null) {
            fullAddress += ":" + port;
        }
        return fullAddress;
    }

    /**
     * 获取应用服务器端口号
     *
     * @return
     */
    public static Integer getServerPort() {
        String portStr = getString("server.port");
        if (StringUtils.isEmpty(portStr)) {
            return null;
        }
        return Integer.parseInt(portStr);
    }

    public static boolean isProd() {
        String env = getString("spring.profiles.active");
        return StringUtils.startsWith(env, "prod");
    }

    public static boolean isTest() {
        String env = getString("spring.profiles.active");
        return StringUtils.startsWith(env, "test");
    }

    /**
     * 获取属性
     *
     * @param key
     * @return
     */
    public static String getString(String key) {
        Environment env = ApplicationContextHolder.getEnvironment();
        return env.getProperty(key);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getServerFullAddress());
    }

}
