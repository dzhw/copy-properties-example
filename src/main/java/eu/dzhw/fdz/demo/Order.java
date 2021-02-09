package eu.dzhw.fdz.demo;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
  @Id
  private String id;
  
  private List<String> orderLineItems;
}
