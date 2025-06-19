package cl.ferremas.ms.ms_inventario_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsInventarioMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsInventarioMsApplication.class, args);
    }
}
