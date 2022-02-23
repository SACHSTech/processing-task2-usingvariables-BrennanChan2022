import processing.core.PApplet;

  /**
  * A program that draws a house with a background.
  * @author: B. Chan
  */

public class Sketch extends PApplet {
	

  public void settings() {
    size(500, 500);
  }

  //Background
  public void setup() {
    background(176, 227, 255);
  }

  public void draw() {
	  
    //Draw Grass + Dirt
    noStroke();
    fill(57, 184, 65);
    rect(0,400,500,50);

    fill(107, 68, 27);
    rect(0,450,500,50);
 
    // Draw House + Roof
    stroke(0,0,0);
    strokeWeight(1);
    fill(148, 61, 61);
    rect(130,160,240,240);

    fill(130, 127, 127);
    rect(310,80,40,60);
    triangle(100, 160, 250, 80, 400, 160);

    // Draw Door and Windows
    fill(79, 5, 5);
    rect(220,300,60,100);
    fill(110, 0, 0);
    ellipse(270, 350, 10, 10);

    fill(203, 212, 211);
    ellipse(180, 270, 50, 60);
    ellipse(320, 270, 50, 60);
    rect(220,180,60,50);

    stroke(0,0,0);
    line(250, 180, 250, 230); 
    line(220, 205, 280, 205); 

    //Draw Sun and Clouds
    noStroke();
    fill(255, 251, 33);
    ellipse(40, 40, 60, 60);

    fill(255, 255, 255);
    ellipse(150, 40, 110, 45);
    ellipse(305, 40, 165, 50);
    ellipse(440, 40, 85, 45);
  }
  
}