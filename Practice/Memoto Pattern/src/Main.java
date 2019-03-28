
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ComputerCareTaker careTaker = new ComputerCareTaker();
	     ComputerOriginator originator = new ComputerOriginator();
	     
	     careTaker.saveMemoto(originator.save());
	     System.out.println(careTaker.getSave(0).getSystem());
	     originator.setSystem("windows");
	     careTaker.saveMemoto(originator.save());
	     System.out.println(careTaker.getSave(1).getSystem());
	}

}
