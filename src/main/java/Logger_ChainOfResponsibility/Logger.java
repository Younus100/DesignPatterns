package Logger_ChainOfResponsibility;

public abstract class Logger {
    private int level;

    abstract void log()


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
