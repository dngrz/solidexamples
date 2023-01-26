package com.cloudexperts.tech.solidexamples.command;

import lombok.AllArgsConstructor;

/**
 * <br/> SellStock <br/>
 * <b>Class</b>: SellStock <br/>
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
@AllArgsConstructor
public class SellStock implements Order {

  private Stock aStock;

  @Override
  public void execute() {
    aStock.sell();
  }
}
