public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
//I made a change
        //background colors: sky, land, sea
        sky();
        land();
        sea();
        // Draw birds in the sky
        for (int x = 0; x < 5; x = x + 1) {
            int size = plane.random(15,5);
            plane.teleport(x * 100, 100);
            bird(size);
        }
        // Draw houses on the land
        for (int x = 0; x < 5; x = x + 1) {
            plane.teleport(x * 100, 400);
            house();
        }
        // Draw fish in the sea
        for (int x = 0; x < 3; x = x + 1) {
            int size = plane.random(30,10);
            plane.teleport(x * 200, 700);
            fish(size);
        }
    }
    public void sky() {
        for (int x = 0; x < 750; x = x + 1) {
            for (int y = 0; y < 300; y = y + 1) {
                plane.teleport(x, y);
                plane.setPixelColor(y / 3, y / 4, 230);
            }
        }
    }
    public void land() {
        for (int x = 0; x < 750; x = x + 1) {
            for (int y = 300; y < 600; y = y + 1) {
                plane.teleport(x, y);
                plane.setPixelColor(139, 69, 19);
            }
        }
    }
    public void sea() {
        for (int x = 0; x < 750; x = x + 1) {
            for (int y = 550; y < 900; y = y + 1) {
                plane.teleport(x, y);
                plane.setPixelColor(0, 0, 200/3);
            }
        }
    }

    // Method for bird
    public void bird(int size) {
        plane.trailWidth = 5;
        if (size > 10) { plane.setColor(139, 69, 19);  // brown for larger birds
        }
        else { plane.setColor(0, 0, 0);  // Black for smaller birds
        }
        plane.move(size);
        plane.turn(45);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(45);
        plane.move(size);
        plane.turn(180);
    }

    // Method for house
    public void house() {
        plane.trailWidth = 10;
        // Randomly choose a color for the house walls
        int color = plane.random(1, 3);
        if (color == 1) {
            plane.setColor(245, 245, 220);
        }  if (color == 2) {
            plane.setColor(255, 182, 193);
        }  if (color == 3) {
            plane.setColor(144, 238, 144);
        }
        for (int x = 0; x < 4; x = x + 1) {
            plane.move(50);
            plane.turn(90);
        }
        plane.setColor(101, 67, 33);
        plane.turn(90);
        for (int x = 0; x < 3; x = x + 1) {
            plane.move(50);
            plane.turn(120);
        }
        plane.turn(-90);
    }

    // Method for fish
    public void fish(int size) {
        plane.trailWidth = 5;
        if (size > 15) { plane.setColor(0, 0, 255);
        }
        else { plane.setColor(255, 255, 100);
        }
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(180);
    }
}