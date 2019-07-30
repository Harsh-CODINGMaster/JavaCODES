

	 class mathopr{

		private mathopr(){}
		static int  add(int x, int y){
		return x+y;	
//		System.out.println("sum is "+ (x+y) ); 
			}
			static int mul(int x, int y){
				return x * y;
			}
		}

		public class test{
		public static void main(String[] args) {
//	mathopr m = new mathopr();
//	
		int d=mathopr.add(100, 200);
		System.out.println("sum is "+ d);} 
		
}
