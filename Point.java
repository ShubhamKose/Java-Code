import java.util.Scanner;
class Point {
	protected int x;
	protected int y;
	
	public Point() {
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter x and y respectively");
		x = in.nextInt();
		y = in.nextInt();
	}
	public void showData() {
		System.out.println("x:"+x+"y:"+y);
	}
	public Point getPoint() {
		return new Point(getX(),getY());
	}
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10f,20f);
		r.showData();
		r.acceptData();
		r.showData();
		r.setHeight(30f);
		r.setWidth(40f);
		float ar = r.getArea();
		float per = r.getPerimeter();
		System.out.println("area is:" + ar + "perimeter is:" + per);
	}
}
class Rectangle extends Point {
	protected float width;
	protected float height;
	
	public Rectangle(float width , float height) {
		super(5,5);
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x,int y) {
		super(x,y);
		width = 10;
		height = 20;
	}
	public Rectangle (int x,int y , float width,float height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public float getHeight() {
		return height;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public void setHeight(float height){
		this.height = height;
	}
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("enter width and height respectively");
		width = in.nextFloat();
		height = in.nextFloat();
	}
	public void showData() {
		super.showData();
		System.out.println("width:"+width+"height"+height);
	}
	public float getArea() {
		return height*width;
	}
	public float getPerimeter() {
		float result = 2*(height+width);
		return result;
	}
}


	
	
		
