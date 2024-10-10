package p1;
class Plane{
	void takeOff() {
		System.out.println("plane is taking off");
	}
	void fly() {
		System.out.println("plane is flying");
}
	void land() {
		System.out.println("plane is landing");
	}
	
}
class CargoPlane extends Plane{
@Override
void fly() {
	System.out.println("cargoplane is flying");
	
}
void carryGoods() {
	System.out.println("cargoplane carrygoods");
}
}
class PassengerPlane extends Plane{
@Override
void fly() {
	System.out.println("passengerPlane is flying");
	
}
void carryHumans() {
	System.out.println("passengerPlane carryhumans");
}
}
class FighterPlane extends Plane{
@Override
void fly() {
	System.out.println("FighterPlane is flying");
	
}
void carryWeapons() {
	System.out.println("FighterPlane carryWeapons");
}
}

public class Inheritencemethods {

	public static void main(String[] args) {
		CargoPlane cp =new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("----------------------");
		PassengerPlane pp =new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("----------------------");
		
		FighterPlane fp =new FighterPlane ();
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("----------------------");
		
		
		
		

	}

}
