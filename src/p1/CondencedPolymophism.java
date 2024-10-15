package p1;
class Plane1{
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
class CargoPlane1 extends Plane1{
@Override
void fly() {
	System.out.println("cargoplane is flying");
	
}
void carryGoods() {
	System.out.println("cargoplane carrygoods");
}
}
class PassengerPlane1 extends Plane1{
@Override
void fly() {
	System.out.println("passengerPlane is flying");
	
}
void carryHumans() {
	System.out.println("passengerPlane carryhumans");
}
}
class FighterPlane1 extends Plane1{
@Override
void fly() {
	System.out.println("FighterPlane is flying");
	
}
void carryWeapons() {
	System.out.println("FighterPlane carryWeapons");
}
}
class Airport{
	void permit( Plane1 ref) {
	ref.takeOff();
	ref.fly();
	ref.land();
		
	}
}

public class CondencedPolymophism {

	public static void main(String[] args) {
		Airport a = new Airport();
		CargoPlane1 cp =new CargoPlane1();
		a.permit(cp);
		cp.carryGoods();
		System.out.println("---------------------");
		PassengerPlane1 pp =new PassengerPlane1();
		a.permit(pp);
		pp.carryHumans();
		System.out.println("---------------------");
		FighterPlane1 fp =new FighterPlane1();
		a.permit(fp);
		fp.carryWeapons();
		
	}

}
