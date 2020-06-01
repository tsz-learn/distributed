package com.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
public class FirstFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String name = (String) exchange.getAttributes().get("name");
        if (null == name || name.length() == 0) {
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
        }
        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
