package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car Car = new Car();

        //Un método booleano que verifique si el valor del tacómetro es cero
            tacho(Car);
        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
            Car.start();
            tacho(Car);
        ///Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
            Car.start();
        //Apagar el coche comprobando que el valor del tacómetro es correcto
            Car.stop();
            tacho(Car);
        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
            Car.start();
            Car.start();
            Car.accelerate();
            Car.stop();
        //Acelerar el coche
        Car.accelerate();
        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        for (int i = 0; i < 5; i++) {
            Car.accelerate();
        }

        Car.accelerate();
        //Frenar la velocidad
        Car.brake();
        //Frenar hasta un valor negativo (y comprobar que no se puede)
        for (int i = 0; i < 7; i++) {
            Car.brake();
        }
        //Girar el volante 20 grados
        Car.turnAngleOfWheels(20);
        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        Car.turnAngleOfWheels(45);
        Car.turnAngleOfWheels(-45);
        //Detener el coche y poner marcha atrás
        Car.brake();
        Car.setReverse(true);
        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        Car.accelerate();
        Car.setReverse(true);






    }
    public static void tacho(Car car) {
        // Usamos el getter para obtener el valor del tachometer
        if (car.getTachometer() == 0) {
            System.out.println("Tachometro = 0");
        } else {
            System.out.println("Tachometro /= 0 -> " + car.getTachometer());
        }
    }


}