package com.cloudexperts.tech.solidexamples.command;

/**
 * <br/> CommandPatternDemo <br/>
 * <b>Class</b>: CommandPatternDemo <br/>
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
public class CommandPatternDemo {

  public static void main(String[] args) {
    Stock abcStock = new Stock();
    abcStock.setName("Stock1");
    abcStock.setQuantity(100);

    BuyStock buyStock = new BuyStock(abcStock);
    SellStock sellStock = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStock);
    broker.takeOrder(sellStock);

    broker.placeOrders();
  }
}
