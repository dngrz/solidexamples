package com.cloudexperts.tech.solidexamples.strategy;

import lombok.AllArgsConstructor;

/**
 * <br/> Context <br/>
 * <b>Class</b>: Context <br/>
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
public class Context {

  private Strategy strategy;

  public int executeStrategy(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }

}
