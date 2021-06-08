package sda.store.onlinestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.store.onlinestore.model.PurchaseOrderLine;
import sda.store.onlinestore.model.PurchaseOrderLineDTO;
import sda.store.onlinestore.service.PurchaseOrderLineService;

import java.util.List;

@RestController
@RequestMapping(value = "/purchase/order")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PurchaseOrderLineController {
    @Autowired
    private PurchaseOrderLineService purchaseOrderLineService;

    @PostMapping(value = "/line")
    public PurchaseOrderLine postPurchaseOrderLine(@RequestBody PurchaseOrderLineDTO purchaseOrderLineDTO){
        return purchaseOrderLineService.addProductToPurchaseOrderLine(purchaseOrderLineDTO);
    }

    @PostMapping(value = "/lines/moveFromCart")
    public List<PurchaseOrderLine> createOrderLinesFromCart(@RequestParam Long purchase_order_id){
        purchaseOrderLineService.performOrderLineCreationActions(purchase_order_id);
        return purchaseOrderLineService.getAllPurchaseOrderLineByOrderId(purchase_order_id);
    }

    @GetMapping(value = "/lines")
    public List<PurchaseOrderLine> getAllPurchaseOrderLine(){
        return purchaseOrderLineService.getAllPurchaseOrderLine();
    }

    @GetMapping(value = "/line/{id}")
    public PurchaseOrderLine getPurchaseOrderLineById(@PathVariable (required = false) Long id) {
        return purchaseOrderLineService.getPurchaseOrderLineById(id);
    }

    @GetMapping(value = "{id}/lines")
    public List<PurchaseOrderLine> getPurchaseOrderLineByOrderId(@PathVariable (required = false) Long id){
        return purchaseOrderLineService.getAllPurchaseOrderLineByOrderId(id);
    }
}
