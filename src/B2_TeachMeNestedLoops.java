public class B2_TeachMeNestedLoops extends World {

   public void go() {

      // Draw gradient sky
      for (int x = 0; x < 750; x = x + 1) {
         for (int y = 0; y < 300; y = y + 1) {  // Loop for height of sky (300 pixels)
            plane.teleport(x, y);
            plane.setPixelColor(y / 3, y / 4, 230);  // Sky gradient from light blue to darker blue
         }
      }

      // Draw land
      for (int x = 0; x < 750; x = x + 1) {
         for (int y = 300; y < 600; y = y + 1) {  // Loop for height of land (300 pixels)
            plane.teleport(x, y);  // Corrected to use y value
            plane.setPixelColor(139, 69, 19);  // Set brown color for land
         }
      }
      // Draw gradient sea
      for (int x = 0; x < 750; x = x + 1) {
         for (int y = 550; y < 900; y = y + 1) {  // Loop for height of sea (300 pixels)
            plane.teleport(x, y);  // Corrected to use y value
            plane.setPixelColor(0, 0, 200/3);
         }
      }
   }
}
