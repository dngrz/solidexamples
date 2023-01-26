package com.cloudexperts.tech.solidexamples.decorator;

import lombok.AllArgsConstructor;

/**
 * <br/> ShapeDecorator <br/>
 * <b>Class</b>: ShapeDecorator <br/>
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
public abstract class ShapeDecorator implements Shape {

  protected Shape decoratedShape;

  @Override
  public void draw() {
    decoratedShape.draw();
  }
}
