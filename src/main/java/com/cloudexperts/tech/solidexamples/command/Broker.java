package com.cloudexperts.tech.solidexamples.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/> Broker <br/>
 * <b>Class</b>: Broker <br/>
 * Copyright: &copy; 2023 Clodoaldo S&aacute;nchez P&eacute;rez.<br/>
 *
 * @author Clodoaldo S&aacute;nchez P&eacute;rez<br/>
 *      <u>solidexamples</u><br/>
 *      <u>Developed by</u>: <br/>
 *      <ul>
 *      <li>clodo</li>
 *      </ul>
 *      <u>Changes</u>:<br/>
 *      <ul>
 *      <li>Ene. 26, 2023 Creaci&oacute;n de Clase.</li>
 *      </ul>
 * @version 1.0
 */
public class Broker {

  private List<Order> orderList = new ArrayList<>();

  public void takeOrder(Order order){
    orderList.add(order);
  }

  public void placeOrders(){

    orderList.stream().forEach(order -> {
      order.execute();
    });
    orderList.clear();

  }

}
