package eu.dzhw.fdz.demo;

import java.util.List;

public interface OrderProjection {
  String getId();
  
  List<String> getOrderLineItems();
}
