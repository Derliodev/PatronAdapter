public class Motores {
    public static void main(String[] args) {
        Motores miPrincipal = new Motores();
        System.out.println("\n ***************** Motor Gasolina *****************");
        miPrincipal.usarMotorGasolina();
        System.out.println("****************************************\n");
        System.out.println("***************** Motor Diesel *****************");
        miPrincipal.usarMotorDiesel();
        System.out.println("****************************************\n");
        System.out.println("***************** Motor Electrico *****************");
        miPrincipal.usarMotorElectrico();
        System.out.println("****************************************\n");
    }

    private void usarMotorGasolina(){
        Motor motor = new MotorGasolina();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private void usarMotorElectrico(){
        Motor motor = new MotorelectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private void usarMotorDiesel(){
        Motor motor = new MotorDiesel();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }


}
