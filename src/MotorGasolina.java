public class MotorGasolina extends Motor {
    
    public MotorGasolina(){
        super();
        System.out.println("Crendo el motor a Gasolina");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo el motor a Gasolina");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando el motor a Gasolina");
    }

    @Override
    public void apagar() {
        System.out.println("apagando el motor a Gasolina");
    }
}
