
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 仲介者模式
		// 透過仲介者使一系列的物件在活動時能夠經過仲介者來實現交互作用
		// 避免直接的互相參考
		// 進而鬆散其耦合性
		
		// 無名的BOSS
		Boss boss = new Boss();

		// 各個員工
		PM che = new PM("哲志");
		Programmer corn = new Programmer("蜀黍");
		Programmer tank = new Programmer("車哥");

		// 把員工加入BOSS底下管理
		boss.addMember(che);
		boss.addMember(corn);
		boss.addMember(tank);

		// BOSS介紹新來的蜀黍
		boss.introduce(corn);

		// 車哥自己工作
		tank.work();

      	// BOSS請大家認真工作
		boss.workHard();

		// 車哥頂不住了
		// PM請BOSS幫忙車哥
		che.bossHelp(tank);
	}

}
