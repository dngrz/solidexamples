package com.cloudexperts.tech.solidexamples.factory;

/**
 * <br/> FactoryPatternDemo <br/>
 * <b>Class</b>: FactoryPatternDemo <br/>
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
public class FactoryPatternDemo {

  public static void main(String[] args) {

    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();

    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw();

    Shape shape3 = shapeFactory.getShape("RECTANGLE");
    shape3.draw();

  }
}
