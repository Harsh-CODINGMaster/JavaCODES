
//abstract class Player1 implements IPlayer{
//public void defaultPower(){
//	System.out.println("10% Power by Default");
//	
//}

//interface ExtraPowerPlayer{
//void hide();
//}
//interface HybridPlayer extends IPlayer, ExtraPowerPlayer{
//
//}
//class Ken implements IPlayer, ExtraPowerPlayer{
//
//@Override
//public void jump() {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public void punch(int power) {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public void run() {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public void hide() {
//	System.out.println("Hide for 2 Sec");
////}
////
////}
//class Ken implements IPlayer{
//	
//	
//	@Override
//	public void jump() {
//		System.out.println("Ken Jump...");	
//		}
//
//	@Override
//		public void punch(int attack) {
//		System.out.println("Punch "+ attack);	
//		}
//
//	@Override
//		public void run() {
//		System.out.println("Run...");	
//	}
//		
//		@Override
//		public void roundKick()
//		{}
//	
//	
//}



 class Ryu implements IPlayer{

	
	@Override
	public void jump() {
		System.out.println("RYU Jump...");	
		}

	@Override
		public void punch(int attack) {
		System.out.println("Punch "+ attack);	
		}

	@Override
		public void run() {
		System.out.println("Run...");	
	}
	


public static void main(String[] args) {

	Ryu ryu = new Ryu();
	ryu.jump();
	ryu.run();
	ryu.punch(20);
	ryu.roundKick();
ryu.defaultPower();
}




}