package Memento;

import java.util.ArrayList;

public class Walker {
	/*
	 * private int currentX, currentY; private int targetX, targetY; private
	 * ArrayList<String> actionList = new ArrayList<String>();
	 * 
	 * public Walker(int currentX, int currentY, int targetX, int targetY) {
	 * this.currentX = currentX; this.currentY = currentY; this.targetX = targetX;
	 * this.targetY = targetY; }
	 * 
	 * public double walk(String action) { actionList.add(action);
	 * System.out.println("22"); if(action.equals("UP")) { currentY+=1; }else
	 * if(action.equals("RIGHT")) { currentX+=1; }else if(action.equals("DOWN")) {
	 * currentY-=1; }else if(action.equals("LEFT")) { currentX-=1; } //return
	 * Math.sqrt(Math.pow(currentX- targetX,2)+ Math.pow(currentY-targetY,2));
	 * return Math.sqrt(Math.pow(currentX-targetX, 2)+ Math.pow(currentY-targetY,
	 * 2)); }
	 * 
	 * 
	 * 
	 * public class Memento{ private int x, y; private ArrayList<String> actionList;
	 * private Memento() {} }
	 * 
	 * public Memento createMemento() {
	 * System.out.println("size : "+actionList.size()); Memento memento = new
	 * Memento();
	 * 
	 * memento.x = this.currentX; memento.y = this.currentY; this.actionList =
	 * (ArrayList<String>)this.actionList.clone(); return memento; }
	 * 
	 * 
	 * public void restoreMemento(Memento memento) { this.currentX = memento.x;
	 * this.currentY = memento.y; this.actionList =
	 * (ArrayList<String>)memento.actionList.clone(); }
	 * 
	 * @Override public String toString() { System.out.println("1111"); return
	 * actionList.toString(); }
	 */
	
	 private int currentX, currentY;
	    private int targetX, targetY;
	    private ArrayList<String> actionList = new ArrayList<>();

	    public Walker(int currentX, int currentY, int targetX, int targetY) {
	        this.currentX = currentX;
	        this.currentY = currentY;
	        this.targetX = targetX;
	        this.targetY = targetY;
	    }

	    // Rename the method to better reflect its purpose
	    public double move(String action) {
	        actionList.add(action);

	        if ("UP".equals(action)) {
	            currentY += 1;
	        } else if ("RIGHT".equals(action)) {
	            currentX += 1;
	        } else if ("DOWN".equals(action)) {
	            currentY -= 1;
	        } else if ("LEFT".equals(action)) {
	            currentX -= 1;
	        }

	        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
	    }

	    public class Memento {
	        private int x, y;
	        private ArrayList<String> actionList;

	        // Ensure to initialize the actionList in the Memento constructor
	        private Memento() {
	            this.actionList = new ArrayList<>();
	        }
	    }

	    public Memento createMemento() {
	        Memento memento = new Memento();

	        memento.x = this.currentX;
	        memento.y = this.currentY;
	        memento.actionList.addAll(this.actionList); // Use addAll to clone the list

	        return memento;
	    }

	    public void restoreMemento(Memento memento) {
	        this.currentX = memento.x;
	        this.currentY = memento.y;
	        this.actionList = new ArrayList<>(memento.actionList); // Use copy constructor to clone the list
	    }

	    // Provide a method to get the entire path
	    public String getPath() {
	        return actionList.toString();
	    }
	
}
