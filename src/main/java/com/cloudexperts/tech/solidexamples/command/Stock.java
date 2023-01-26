package com.cloudexperts.tech.solidexamples.command;

import lombok.Data;

/**
 * <br/> Stock <br/>
 * <b>Class</b>: Stock <br/>
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
@Data
public class Stock {

  private String name;
  private int quantity;

  public void buy(){
    System.out.println("Stock :: Name: " + name + ", quantity: " + quantity + " bought." );
  }

  public void sell(){
    System.out.println("Stock :: Name: " + name + ", quantity: " + quantity + " sold." );
  }

}
