import java.util.ArrayList;

public class ParkingSystem implements IParking{
	Integer big,medium,small;
	ParkingSystem(Integer big, Integer medium, Integer small){
		this.big=big;
		this.medium=medium;
		this.small=small;
		}
	public boolean addCar(Integer carType) {
		return false;
		}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	public boolean addCar(int carType) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) throws Exception {
        IParams params = IParking.parse();//ParkingSystem.parse();
        ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params.getPlanParking();
        for (int i = 0; i < plan.size(); i++) {
            ps.addCar(plan.get(i));
        }
        ps.print();
    }
}
