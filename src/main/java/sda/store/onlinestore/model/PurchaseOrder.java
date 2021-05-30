package sda.store.onlinestore.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Max(value = 100, message = "User name should not be longer than 100")
    private String userName;

    //@Max(value = 100, message = "User surname should not be longer than 100")
    private String userSurname;

    //@Max(value = 100, message = "Delivery address should not be longer than 100")
    private String deliveryAddress;

    //@FutureOrPresent(message = "Order date should be today or the future")
    private LocalDate orderDate;

    @OneToMany(mappedBy = "purchaseOrder")
    private List<PurchaseOrderLine> purchaseOrderLines;

}