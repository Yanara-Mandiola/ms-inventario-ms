package cl.ferremas.ms.ms_inventario_ms.client;

import cl.ferremas.ms.ms_inventario_ms.model.Inventario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "ms-inventario-db", url = "http://localhost:8484")
public interface InventarioDbFeignClient {

    @GetMapping("/inventarios")
    List<Inventario> getAllInventarios();

    @GetMapping("/inventarios/{id}")
    Inventario getInventarioById(@PathVariable("id") Integer id);

    @PostMapping("/inventarios")
    Inventario createInventario(@RequestBody Inventario inventario);

    @PutMapping("/inventarios/{id}")
    Inventario updateInventario(@PathVariable("id") Integer id, @RequestBody Inventario inventario);

    @DeleteMapping("/inventarios/{id}")
    void deleteInventario(@PathVariable("id") Integer id);
}
