public class Alto implements ICar{


    //important function for double dispatch

    @Override
    public void accept(ICarVisitor carVisitor) {
        System.out.println("inside alto accept method");
        carVisitor.visitAlto(this);
    }
}
