package test01;
public class Mianji {
	public double p;      //三角形周长一半
	public static double S;      //三角形面积
	public int x,y,z;  //三角形三边
	public static void main(String[] args) {  
		Mianji m = new Mianji();  
		S = m.getArea(m.getp(3, 4, 5));  
		System.out.println(S); 
		} 
	public double getp(int x, int y, int z) {  
		this.x = x;  
		this.y = y;  
		this.z = z;   
		return p = (x + y + z) / 2; 
		} 
	public double getArea(double p) {     //三角形三边求面积公式
		return Math.sqrt(p * (p - x) * (p - y) * (p - z)); 
		}
}