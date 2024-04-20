package com.example.api.controller;

import com.example.openApiDemo.controller.InventoryApi;
import com.example.openApiDemo.model.InventoryItem;
import com.example.openApiDemo.model.Manufacturer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "*")
public class InventoryController implements InventoryApi {

    @Override
    @GetMapping
    public ResponseEntity<List<InventoryItem>> searchInventory(String searchString, Integer skip, Integer limit) {

        List<InventoryItem> result = new ArrayList<>();

        InventoryItem item = new InventoryItem();
        item.setId(UUID.randomUUID());
        item.setName("chocolate");
        item.setReleaseDate(OffsetDateTime.now());

        Manufacturer fabricante = new Manufacturer();
        fabricante.setName("HKMC");
        fabricante.setHomePage("google.com");
        fabricante.setPhone("12345678");

        item.setManufacturer(fabricante);

        result.add(item);

        return ResponseEntity.ok(result);
    }

}
