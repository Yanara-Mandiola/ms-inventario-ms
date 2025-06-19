package cl.ferremas.ms.ms_inventario_ms.service;

import cl.ferremas.ms.ms_inventario_ms.client.InventarioDbFeignClient;
import cl.ferremas.ms.ms_inventario_ms.model.Inventario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    private final InventarioDbFeignClient inventarioDbFeignClient;

    public InventarioService(InventarioDbFeignClient inventarioDbFeignClient) {
        this.inventarioDbFeignClient = inventarioDbFeignClient;
    }

    public List<Inventario> getAllInventarios() {
        return inventarioDbFeignClient.getAllInventarios();
    }

    public Inventario getInventarioById(Integer id) {
        return inventarioDbFeignClient.getInventarioById(id);
    }

    public Inventario createInventario(Inventario inventario) {
        return inventarioDbFeignClient.createInventario(inventario);
    }

    public Inventario updateInventario(Integer id, Inventario inventario) {
        return inventarioDbFeignClient.updateInventario(id, inventario);
    }

    public void deleteInventario(Integer id) {
        inventarioDbFeignClient.deleteInventario(id);
    }
}
