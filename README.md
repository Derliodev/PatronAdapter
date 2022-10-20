## Patron Adapter
El patron Adapter nos permite utilizar una implementación acorde a las necesidades del cliente, creando una interfaz que nos permite acceder a los métodos de la clase principal, sin tener que modificarla.

## Caso
El patrón Adapter nos permite proveer una interface acorde a los requerimientos del cliente usando servicios de una clase distinta que no es compatible con nuestra interfaz. Utilizaremos como ejemplo un sistema que trabaja con 3 tipos de motores (Gasolina, Diesel y Eléctrico). Los motores a Gasolina y Diesel comparten métodos comunes, sin embargo, el motor eléctrico tiene métodos diferentes. Para lograr que los 3 motores funcionen de la misma manera, implementaremos una clase Adapter.

- Las clases MotorGasolina.java y MotorDiesel.java tienen los mismos métodos.
- Sin embargo, podemos ver que la Clase MotorElectrico.java tiene diferentes métodos en su funcionamiento.

- Ya que queremos que todas las clases Motor se pueden llamar de la misma forma, es que necesitamos adaptar la clase MotorElectrico.java. Generamos entonces MotorElectricoAdapter.java
- De este modo, la clase tiene los mismos métodos que MotorGasolina.java y MotorDiesel.java, por tanto, se pueden invocar de la misma forma.

## Salida
**************** Motor Gasolina *****************
Crendo el motor a Gasolina
encendiendo el motor a Gasolina
acelerando el motor a Gasolina
apagando el motor a Gasolina
****************************************

**************** Motor Diesel *****************
Crendo el motor Diesel
encendiendo el motor Diesel
acelerando el motor Diesel
apagando el motor Diesel
****************************************

**************** Motor Electrico *****************
Creando motor Electrivo
Creando motor electrico adapter
Encendiendo motorElectricoAdapter
conectando motor Electrico
Esta conectado, activando motor electrico...
Acelerando motor electrico...
Apagando motor electrico
Deteniendo motor electrico
Desconectando motor electrico...
****************************************


## Conclusion
Como podemos observar, llamamos a todas las clases de la misma forma, gracias a nuestro método Adapter.