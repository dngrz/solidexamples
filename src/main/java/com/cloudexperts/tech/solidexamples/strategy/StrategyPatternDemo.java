package com.cloudexperts.tech.solidexamples.strategy;

/**
 * <br/> StrategyPatternDemo <br/>
 * <b>Class</b>: StrategyPatternDemo <br/>
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
public class StrategyPatternDemo {

  public static void main(String[] args) {

    Context context = new Context(new OperationAdd());
    System.out.println("20 + 10 = " + context.executeStrategy(20, 10));

    context = new Context(new OperationSubstract());
    System.out.println("20 - 10 = " + context.executeStrategy(20, 10));

    context = new Context(new OperationMultiply());
    System.out.println("20 * 10 = " + context.executeStrategy(20, 10));

  }
}
