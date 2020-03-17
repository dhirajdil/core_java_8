package datastructure;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;
public class Strom extends Applet {
private final int MAX_COUNT = 5000;
private final int BUSY_WAIT = 500;
private final int APPLET_SIZE = 200;
private Random position = new Random();
private Raindrop drop1; // references for 5 Raindrop objects
private Raindrop drop2;
private Raindrop drop3;
private Raindrop drop4;
private Raindrop drop5;
private Graphics page; // The graphics page
// The init method is called once when the applet is 
// first loaded into memory. (initialization code)
public void init() {
drop1 = new Raindrop(); // create 5 Raindrop objects
drop2 = new Raindrop();
drop3 = new Raindrop();
drop4 = new Raindrop();
drop5 = new Raindrop();
show(true);
page = getGraphics();
}
 // The start method is called every time the applet is 
// viewed by a browser. (code to implement rain effect)
public void start() {
int count = 1;
int wait;
setBackground(new Color(192,192,192));
//while (count < MAX_COUNT)
while (true) {
check_drop (drop1);
check_drop (drop2);
check_drop (drop3);
check_drop (drop4);
check_drop (drop5);
count = count + 1;
draw (page);
wait = 0;
while (wait < BUSY_WAIT) {
wait = wait + 1;
}
}
}
public void check_drop (Raindrop drop) {
if (drop.visible()) {
drop.ripple();
} else {
int x = Math.abs (position.nextInt() % APPLET_SIZE) + 1;
int y = Math.abs (position.nextInt() % APPLET_SIZE) + 1;
drop.set_position (x, y);
}
}
public void draw (Graphics page) {
// Clear the applet
page.setColor(getBackground());
page.fillRect (0, 0, APPLET_SIZE, APPLET_SIZE);
page.setColor(getForeground());
// Draw all the drops
drop1.draw (page);
drop2.draw (page);
drop3.draw (page);
drop4.draw (page);
drop5.draw (page);
}
} // class Storm
class Raindrop {
private final int MAX_RIPPLE = 30;
private final int RIPPLE_STEP = 2;
private static Random new_size = new Random();
private int current_size = 0;
private int visible_size = 0;
private int x = 1, y = 1;
public boolean visible() {
return current_size < visible_size;
}
public void set_position (int x_position, int y_position) {
x = x_position;
y = y_position;
visible_size = Math.abs (new_size.nextInt() % MAX_RIPPLE) + 1;
current_size = 1;
}
public void ripple() {
x = x - RIPPLE_STEP/2;
y = y - RIPPLE_STEP/2;
current_size = current_size + RIPPLE_STEP;
}
public void draw (Graphics page) {
// page.drawRect (x, y, current_size, current_size);
page.drawOval (x, y, current_size, current_size);
}
} 