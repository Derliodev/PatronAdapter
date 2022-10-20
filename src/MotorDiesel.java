public class MotorDiesel extends Motor {
    
    public MotorDiesel(){
        super();
        System.out.println("Crendo el motor Diesel");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo el motor Diesel");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando el motor Diesel");
    }

    @Override
    public void apagar() {
        System.out.println("apagando el motor Diesel");
    }

}
