package exercises;

class PokWater extends pokemon implements IWater{

    public PokWater() {};

    @Override
    protected void atackAraniazo() {
        System.out.println("Agua hace araniazo");
    }

    @Override
    protected void atackMordisco() {
        System.out.println("Agua hace mordisco");
    }

    @Override
    protected void atackPlacaje() {
        System.out.println("Agua hace placaje");
    }

    @Override
    public void atackBurble() {
        System.out.println("Agua hace burbles");
    }

    @Override
    public void atackChorro() {
        
    }
}
