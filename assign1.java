interface Integer{
	void value();
}
interface SquareOf{
       void square();
}
       class A6 implements Integer, SquareOf{
	public void value(){
		System.out.println("The Value is 4");
	}
        public void square(){
        int s=4*4;
System.out.println("The square of the Value is "+s);
}
	public static void main(String args[]){
	A6 a=new A6();
	a.value();
	a.square();
}	
}
