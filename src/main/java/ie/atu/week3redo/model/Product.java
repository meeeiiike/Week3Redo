package ie.atu.week3redo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@Data@AllArgsConstructor@NoArgsConstructor
public class Product {
    @NotBlank(message = "name can't be blank dude!")@Size(max = 40)
    private String name;
    @NotNull(message = "can't be null!")@Positive(message = "must be positive :D")
    private double price;
}
