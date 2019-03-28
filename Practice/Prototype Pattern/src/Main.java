import org.junit.jupiter.api.Assertions;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sensor[] sensors = new Sensor[5000];
        sensors[0] = new Sensor();
        sensors[0].setID(1);
        sensors[0].setName("Sensor1號");
        sensors[0].setNickname("我的空氣探測器");
        sensors[0].setVersion("1.0.0");
        sensors[0].setWifiID("MYSENSORWIFIID1.0.0");
        sensors[0].setWifiPass("THISisWiFiPasssOuO");
        sensors[0].setData("None");

        for(int i = 1 ; i < 5000 ; i ++){
            try{
                sensors[i] = (Sensor)sensors[0].clone();
                sensors[i].setID(i+1);
            }catch (CloneNotSupportedException e){
                e.printStackTrace();
            }

        }

        for (int i = 0 ; i < 5000 ; i++) {
        	//測試每個感測器的ID是否正確
            Assertions.assertEquals(i+1,sensors[i].getID());
        }
	}

}
