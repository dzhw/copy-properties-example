package eu.dzhw.fdz.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class CopyPropertiesExampleApplicationTests {
  
    @Autowired
    private OrderRepository orderRepository;

	@Test
	void testCollectionPropertiesAreCopied() {
	  // arrange
	  Order order = new Order("testid", Arrays.asList("lineItem1","lineItem2"));
	  orderRepository.save(order);
	  
	  // act
	  OrderProjection projection = orderRepository.findOneProjectionById("testid");
	  Order copy = new Order();
	  
	  BeanUtils.copyProperties(projection, copy);
	  
	  // assert
	  assertNotNull(copy.getOrderLineItems(), "OrderLineItems must not be null!");
	}

}
