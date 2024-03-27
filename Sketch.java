import processing.core.PApplet;

public class Sketch extends PApplet {
	
	  // Declare variables
    float flowerX = random(0,400);
    float flowerY = random(0,400);
    float petalSize = 100;
    float petalDistance = 50;

    //beginning the code 
    
  public void settings() {
    // size of entire drawing 
      size(600, 600);
    }
  
    //Making a background to fit my setting 
    public void setup() {
      background(14, 237, 226);
      
      //adding randomized backgrounds 
      if (flowerX > 300 || flowerY > 300) {
        background(245, 90, 60);
       }
       else if (flowerX < 300 || flowerY < 300) {
        background(247, 600, 50);
        }
       // creating variables for randomzing pedals
      fill (237, 237, 14);
      float ellipseX = random(0,600);
      float ellipseY = random(0, 600);
      float ellipseWidth = random(120, 120);
      float ellipseHeight = random(120, 120);
     ellipse(ellipseX, ellipseY, ellipseWidth, ellipseHeight);}
       
     //start of the code to draw my objects 
     public void draw() {

      // define time variables
     int hr = hour();
     int min = minute();

      // print time on screen
      fill(0);
      textSize(100);
      text(hr, 130, 150);
      text(min, 130, 225);

      //drawing rectangle to make it represent the grass
      strokeWeight(1);;
      fill(3, 252, 44);
      rect(0,400,600,200);
  
     //drawing the flower:
      strokeWeight(10);
      stroke(0,128,0);
      line(flowerX,flowerY,flowerX,flowerY + 200);
    
      //making leaves on stem
      ellipse(flowerX + 5,flowerY + 160, 10, 10);
      ellipse(flowerX - 5,flowerY + 110, 10, 10);
  
     //chaning stroke back to thin so it does not 
      //affect drawing the petals 
     strokeWeight(1);
      stroke(0);
  
     //drawing petals 
     
     fill(230, 51, 7);
     ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);
     ellipse(flowerX + petalDistance, flowerY - petalDistance, petalSize, petalSize);
     ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);
     ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);  
  
     // creating the middle part of the flower
     fill(0);
     ellipse(flowerX,flowerY,80,80);

    
   


   
    }
    
   
  }
