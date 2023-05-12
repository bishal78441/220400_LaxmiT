float sunX = 0; // Starting position of the sun

void setup() {
  size(400, 400);
  background(135, 206, 250); // Light blue sky
}

void draw() {
  background(135, 206, 250); // Refresh the background each frame
  
  // Draw the sun
  fill(255, 255, 0); // Yellow
  ellipse(sunX, 100, 50, 50); // Sun is a yellow circle
  sunX += 1; // Move the sun to the right each frame
  
  // Draw the sea
  fill(30, 144, 255); // Navy blue
  rect(0, 250, 400, 150); // A rectangular sea
  
  // Draw the boat
  fill(255, 255, 255); // White
  triangle(200, 225, 150, 275, 250, 275); // A sailboat's hull
  rect(180, 200, 40, 25); // A sailboat's cabin
  fill(128, 64, 0); // Brown
  rect(200, 175, 5, 25); // A sailboat's mast
  
  // Draw the palm tree
  fill(0, 100, 0); // Dark green
  rect(350, 200, 20, 150); // A palm tree's trunk
  fill(50, 205, 50); // Lime green
  triangle(330, 200, 380, 100, 430, 200); // A palm tree's leaves
  
  // Draw the seagulls
  fill(255, 255, 255); // White
  ellipse(50, 50, 30, 20); // First seagull's body
  triangle(60, 50, 70, 30, 80, 50); // First seagull's wings
  ellipse(100, 75, 30, 20); // Second seagull's body
  triangle(110, 75, 120, 55, 130, 75); // Second seagull's wings
}

