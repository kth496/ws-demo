package org.example.wsdemo

import com.linecorp.armeria.server.grpc.GrpcServiceBuilder
import com.linecorp.armeria.server.healthcheck.HealthCheckService
import com.linecorp.armeria.server.websocket.WebSocketServiceBuilder
import com.linecorp.armeria.spring.ArmeriaServerConfigurator
import org.springframework.boot.autoconfigure.web.WebProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ArmeriaConfiguration {
    @Bean
    fun armeriaServerConfigurator(
        grpcServiceBuilder: GrpcServiceBuilder,
        webSocketServiceBuilder: WebSocketServiceBuilder,
        webProperties: WebProperties
    ): ArmeriaServerConfigurator = ArmeriaServerConfigurator { serverBuilder ->
        serverBuilder
            .service(
                grpcServiceBuilder
                    .build(),
            )
            .serviceUnder(
                "/ws",
                webSocketServiceBuilder.build()
            )
    }
}