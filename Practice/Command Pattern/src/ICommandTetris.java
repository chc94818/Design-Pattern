public abstract class ICommandTetris {

	// 抽象的命令
    protected Tetris tetris;

    public ICommandTetris(Tetris tetris) {
        this.tetris = tetris;
    }

    public abstract void execute();

}