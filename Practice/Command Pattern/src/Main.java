
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light = new Light();

        Command turnOn = new TurnOn(light);
        Command brighter = new Brighter(light);
        Command darker = new Darker(light);

        Invoker invoker = new Invoker();

        invoker.addCommand(turnOn);
        invoker.addCommand(brighter);
        invoker.addCommand(brighter);
        invoker.addCommand(brighter);
        invoker.addCommand(darker);
        System.out.println("Light's all commands test ");
        invoker.execute();
        
        
        
        Tetris tetris = new Tetris();
        ICommandTetris commandLeft = new TurnLeft(tetris);
        ICommandTetris commandRight = new TurnRight(tetris);
        ICommandTetris commandDown= new StraightDown(tetris);

        TetrisInvoker tetrisInvoker = new TetrisInvoker(commandLeft);
        System.out.println("Tetris's each command test");
        tetrisInvoker.invoke();
        tetrisInvoker.setCommand(commandRight);
        tetrisInvoker.invoke();
        tetrisInvoker.setCommand(commandDown);
        tetrisInvoker.invoke();
        System.out.println("Tetris's all commands test");
        tetrisInvoker.addCommand(commandDown);
        tetrisInvoker.addCommand(commandLeft);
        tetrisInvoker.addCommand(commandRight);
        tetrisInvoker.executeAll();
        
	}

}
