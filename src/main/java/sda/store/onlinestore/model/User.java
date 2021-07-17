package sda.store.onlinestore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "USERS")
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 25)
    private String firstName;

    @Size(min = 3, max = 25)
    private String lastName;

    @Email
    private String email;

    @Min(16)
    @Max(115)
    private Integer age;

    @NotEmpty
    @NotNull
    private String userName;

    @NotEmpty
    @NotNull
    private String password;

    @NotEmpty
    @NotNull
    private String role;

    @OneToMany(orphanRemoval = true)
    @JsonIgnore
    private List<PurchaseOrder> purchaseOrder;

    @OneToMany(orphanRemoval = true)
    @JsonIgnore
    private List<Cart> cart;

}
