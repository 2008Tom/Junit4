package test01;
public class Mianji {
	public double p;      //�������ܳ�һ��
	public static double S;      //���������
	public int x,y,z;  //����������
	public double getp(int x, int y, int z) {  
		this.x = x;  
		this.y = y;  
		this.z = z;   
		return p = (x + y + z) / 2; 
		} 
	public double getArea(double p) {     //�����������������ʽ
		return Math.sqrt(p * (p - x) * (p - y) * (p - z)); 
		}
}