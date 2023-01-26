package com.cloudexperts.tech.solidexamples.strategy;

/**
 * <br/> OperationSubstract <br/>
 * <b>Class</b>: OperationSubstract <br/>
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
public class OperationSubstract implements Strategy {

  @Override
  public int doOperation(int num1, int num2) {
    return num1 - num2;
  }

}
