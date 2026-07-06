package cl.duocuc.demo.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
        System.out.println("================================================");
        System.out.println(" API Gateway iniciado correctamente");
        System.out.println(" URL: http://localhost:8090");
        System.out.println("------------------------------------------------");
        System.out.println(" /catalogo/** -> CATALOGO");
        System.out.println(" /editorial/** -> CATALOGO");
        System.out.println(" /categoria/** -> CATALOGO");
        System.out.println(" /auth/**  -> AUTENTICACION");
        System.out.println(" /wishlist/**  -> LISTA_DESEOS");
        System.out.println(" /detalleWishlist**  -> LISTA_DESEOS");
        System.out.println(" /carrito/**  -> CARRITO");
        System.out.println(" /detalleCarrito/**  -> CARRITO");
        System.out.println(" /pedidos/**  -> PEDIDOS");
        System.out.println(" /pagos/**  -> PAGOS");
        System.out.println(" /ventas/**  -> VENTAS");
        System.out.println(" /envio/**  -> ENVIO");
        System.out.println(" /entrega/**  -> ENTREGA");
        System.out.println(" /devoluciones/**  -> DEVOLUCIONES");
        System.out.println("------------------------------------------------");
        System.out.println(" Eureka: http://localhost:8761");
        System.out.println(" Swagger: http://localhost:808X/swagger-ui/index.html");
        System.out.println("================================================");
    }

}
