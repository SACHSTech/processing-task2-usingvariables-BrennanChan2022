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
    rect(0, height/1.25f, width/1f, height/10f);

    fill(107, 68, 27);
    rect(0, height/1.11f, width/1f, height/10f);
 
    // Set Stroke Settings for House + Roof
    stroke(0, 0, 0);
    strokeWeight(1);
    
    // Draw House + Roof
    fill(148, 61, 61);
    rect(width/3.85f, height/3.125f, width/2.083f, height/2.083f);

    fill(130, 127, 127);
    rect(width/1.61f, height/6.25f, width/12.5f, height/8.33f);    
    triangle(width/5f, height/3.125f, width/2f, height/6.25f, width/1.25f, height/3.125f);

    // Draw Door and Windows
    fill(79, 5, 5);
    rect(width/2.27f, height/1.67f, width/8.33f, height/5f);
    fill(110, 0, 0);
    ellipse(width/1.85f, height/1.43f, width/50f, height/50f);

    fill(203, 212, 211);
    ellipse(width/2.78f, height/1.85f, width/10f, height/8.33f);
    ellipse(width/1.563f, height/1.85f, width/10f, height/8.33f);
    rect(width/2.27f, height/2.78f, width/8.33f, height/10f);

    // Draw Window Panes
    stroke(0, 0, 0);
    line(width/2f, height/2.78f, width/2f, height/2.17f); 
    line(width/2.27f, height/2.44f, width/1.786f, width/2.44f); 

    //Draw Sun and Clouds
    noStroke();
    fill(255, 251, 33);
    ellipse(width/12.5f, height/12.5f, width/8.33f, height/8.33f);

    fill(255, 255, 255);
    ellipse(width/3.33f, height/12.5f, width/4.545f, height/11.111f);
    ellipse(width/1.64f, height/12.5f, width/3.03f, height/10f);
    ellipse(width/1.136f, height/12.5f, width/5.88f, height/11.111f);
  }
  
}