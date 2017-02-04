package com.oyqh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oyqh on 2017-2-4.
 */
@Configuration
@ConfigurationProperties(prefix = "dubbo", locations = {"classpath:/conf/dubbo.yml"})
public  class DubboConfig {

    private Application application;

    private Protocol protocol;

    private Provider provider;

    private Registr registr;

    public final static class Application {
        private String name;

        private String logger;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogger() {
            return logger;
        }

        public void setLogger(String logger) {
            this.logger = logger;
        }

        @Override
        public String toString() {
            return "Application{" +
                    "name='" + name + '\'' +
                    ", logger='" + logger + '\'' +
                    '}';
        }
    }

    public final static class Protocol {
        private String name;

        private Integer port;

        private Boolean accessLog;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Boolean getAccessLog() {
            return accessLog;
        }

        public void setAccessLog(Boolean accessLog) {
            this.accessLog = accessLog;
        }

        @Override
        public String toString() {
            return "Protocol{" +
                    "name='" + name + '\'' +
                    ", port=" + port +
                    ", accessLog=" + accessLog +
                    '}';
        }
    }

    public final static class Provider {
        private Long timeout;

        private Integer retries;

        private Integer delay;

        public Long getTimeout() {
            return timeout;
        }

        public void setTimeout(Long timeout) {
            this.timeout = timeout;
        }

        public Integer getRetries() {
            return retries;
        }

        public void setRetries(Integer retries) {
            this.retries = retries;
        }

        public Integer getDelay() {
            return delay;
        }

        public void setDelay(Integer delay) {
            this.delay = delay;
        }

        @Override
        public String toString() {
            return "Provider{" +
                    "timeout=" + timeout +
                    ", retries=" + retries +
                    ", delay=" + delay +
                    '}';
        }
    }

    public final static class Registr {
        private String protocol;

        private String address;

        private Boolean register;

        private Boolean subscribe;

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Boolean getRegister() {
            return register;
        }

        public void setRegister(Boolean register) {
            this.register = register;
        }

        public Boolean getSubscribe() {
            return subscribe;
        }

        public void setSubscribe(Boolean subscribe) {
            this.subscribe = subscribe;
        }

        @Override
        public String toString() {
            return "Registr{" +
                    "protocol='" + protocol + '\'' +
                    ", address='" + address + '\'' +
                    ", register=" + register +
                    ", subscribe=" + subscribe +
                    '}';
        }
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Registr getRegistr() {
        return registr;
    }

    public void setRegistr(Registr registr) {
        this.registr = registr;
    }

    @Override
    public String toString() {
        return "DubboConfig{" +
                "application=" + application +
                ", protocol=" + protocol +
                ", provider=" + provider +
                ", registr=" + registr +
                '}';
    }
}
