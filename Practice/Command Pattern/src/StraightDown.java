public class StraightDown extends ICommandTetris
{
    public StraightDown(Tetris tetris) {
        super(tetris);
    }

    @Override
    public void execute() {
        tetris.straightDown();
    }
}