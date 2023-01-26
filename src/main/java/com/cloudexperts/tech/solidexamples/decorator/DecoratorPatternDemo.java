package com.cloudexperts.tech.solidexamples.decorator;

/**
 * <br/> DecoratorPatternDemo <br/>
 * <b>Class</b>: DecoratorPatternDemo <br/>
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
public class DecoratorPatternDemo {

  public static void main(String[] args) {

    Shape circle = new Circle();

    Shape redCircle = new RedShapeDecorator(new Circle());

    Shape redRectangle = new RedShapeDecorator(new Rectangle());

    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("Circle with red border");
    redCircle.draw();

    System.out.println("Rectangle of red border");
    redRectangle.draw();

  }
}
