public interface IScorpioPrototype {
    // This method creates a copy of the current object
    public IScorpioPrototype clone();

    public void setEngine(ScorpioEngine scorpioEngine);

    public void start();

}
