import java.util.ArrayList;
import java.util.List;

public class TetrisInvoker {
	ICommandTetris commandTetris;
	private List<ICommandTetris> commandList = new ArrayList<ICommandTetris>();

	
    public TetrisInvoker(ICommandTetris command){
        this.commandTetris = command;
    }
    
    public void addCommand(ICommandTetris command){
    	commandList.add(command);
    }
    public void setCommand(ICommandTetris command){
        this.commandTetris = command;
    }
    
    public void executeAll() {
    	for(ICommandTetris commandTetris : commandList) {
    		commandTetris.execute();
    	}
    }
    public void invoke(){
    	commandTetris.execute();
    }

}