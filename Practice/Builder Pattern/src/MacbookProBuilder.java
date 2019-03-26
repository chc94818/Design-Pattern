public abstract class MacbookProBuilder {


    protected MacbookPro macbookPro;

    MacbookProBuilder(){
        macbookPro = new MacbookPro();
    }

    abstract MacbookProBuilder buildCPU(MacbookPro.Processor processor);

    abstract MacbookProBuilder buildMemory(MacbookPro.Memory size);

    abstract MacbookProBuilder buildGraphics(MacbookPro.Graphics name);

    abstract MacbookProBuilder buildStorage(MacbookPro.Storage size);

    abstract MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language);

    MacbookPro build(){
        return macbookPro;
    }

}
