public class PM extends CoWorker {

    public PM(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + "做PM工作");
    }

    public void bossHelp(CoWorker coWorker){
    	System.out.print(this.name+"：");
        this.boss.giveWork(coWorker);
    }

}