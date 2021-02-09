package eu.dzhw.fdz.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
    extends MongoRepository<Order, String>, CrudRepository<Order, String> {
  OrderProjection findOneProjectionById(String id);
}
