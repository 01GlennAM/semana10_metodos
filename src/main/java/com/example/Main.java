package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
        System.out.println("Fin del programa");
        scanner.close();

    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1() {
        System.out.println("Ejercicio 1: Calculadora de descuentos en Tienda");
        /*
         * Una tienda en Medellín ofrece descuentos por volumen de compra. Si el cliente
         * compra más de 5 productos, obtiene un 10% de descuento. Si compra más de 10
         * productos, obtiene un 15% de descuento. Si compra más de 20 productos,
         * obtiene un 20% de descuento. Además, si el total de la compra supera los
         * $100,000 pesos, obtiene un descuento adicional del 5%. Calcula el precio
         * final que debe pagar un cliente.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "precio del paquete si consta de <5 productos, si consta de <10 productos, si consta de <20 productos");
        double precioUnitario = sc.nextDouble();

        System.out.println("cuantos produntos lleva el cliente ");
        int productos = sc.nextInt();

        double total = precioUnitario * productos;
        double descuento = 0;

        if (productos >= 5) {
            descuento = 0.10;
        } else if (productos >= 10) {
            descuento = 0.15;
        } else if (productos >= 20) {
            descuento = 0.20;
        }

        double descuentoTotal = total - (total * descuento);
        if (descuentoTotal > 100000) {
            double descuentoExtra = descuentoTotal * 0.5;
            descuentoTotal = descuentoTotal - (descuentoTotal * descuentoExtra);
        }
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Total con descuento: $" + descuentoTotal);

    }

    public static void ejercicio2() {
        System.out.println("Ejercicio 2: Sistema de Calificación Crediticia");
        /*
         * Un banco en Bogotá necesita evaluar si puede otorgar un crédito a un cliente.
         * Los criterios son: ingresos mensuales mínimos de $2,000,000, edad entre 18 y
         * 65 años, y que los gastos mensuales no superen el 70% de los ingresos. Si
         * cumple todos los criterios, calcular el monto máximo del crédito (5 veces los
         * ingresos mensuales).
         */

    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3: Control de Inventario de Mercado");
        /*
         * Un mercado en Cartagena necesita controlar su inventario de frutas. Cada día
         * se venden diferentes cantidades y llegan nuevos productos. Si el inventario
         * de alguna fruta baja de 10 unidades, se debe hacer un pedido de 50 unidades.
         * Simula una semana de ventas y reposición
         */

        int pera = 10;
        int manzana = 10;

        if (pera < 10) {
            System.out.println("hacer pedido de pera + 50 ");
        } else {
            System.out.println("tenemos buen stock de peras ");
        }

        if (manzana < 10) {
            System.out.println("hacer un pedio de manzanas + 50");

        } else {
            System.out.println("tenemos buen stock de manzanas");
        }

    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 4: Calculadora de Tiempo de Viaje en Transporte Público");
        /*
         * Una persona en Medellín necesita calcular el tiempo total de viaje usando
         * diferentes medios de transporte público. Debe tomar un bus (20 minutos),
         * luego el metro (15 minutos), y finalmente caminar (10 minutos). Si hay
         * tráfico pesado, el tiempo del bus se incrementa en 50%. Si llueve, el tiempo
         * de caminar se incrementa en 100%.
         */

        Scanner sc = new Scanner(System.in);

        int tiempoToltal = 0;
        int bus = 20;
        int metro = 15;
        int caminar = 10;
        int tiempoToltalTraficoPesado = 0;
        int tiempoToltalBajoLluvia = 0;
        double trafico = 1.5;
        double lluvia = 2;

        // tiempo en bus 20 minutos
        // se valida si la respues es si entonces se hace la operación
        System.out.println("¿Vas a tomar el bus? (si/no): ");
        String busTiempo = sc.nextLine();
        if (busTiempo.equals("si")) {
            tiempoToltal += bus;

        }

        // tiempo en metro 15m
        // acá igual
        System.out.println("¿Vas a tomar el metro? (si/no): ");
        String metroTiempo = sc.nextLine();
        if (metroTiempo.equals("si")) {
            tiempoToltal += metro;

        }

        // tiempo caminando 10m
        System.out.println("¿Vas a caminar? (si/no): ");
        String caminarTiempo = sc.nextLine();
        if (caminarTiempo.equals("si")) {
            tiempoToltal += caminar;
        }

        // si hay trafico se suma el 50%
        System.out.println("¿hay trafico pesado? (si/no): ");
        String traficoPesado = sc.nextLine();
        if (traficoPesado.equals("si") && busTiempo.equals("si")) {
            tiempoToltalTraficoPesado += bus * trafico;
            System.out.println("si hay trafico pesado en el bus te demoras  "
                    + (tiempoToltal + tiempoToltalTraficoPesado) + " minutos mas");
        }

        // si hay lluvia y camina entonces 100%
        System.out.println("¿hay lluvia? (si/no): ");
        String lluviaTiempo = sc.nextLine();
        if (lluviaTiempo.equals("si") && caminarTiempo.equals("si")) {
            tiempoToltalBajoLluvia += caminar * lluvia;
            System.out.println("si te toca caminar  " + (tiempoToltal + tiempoToltalBajoLluvia) + " minutos");
        }

        System.out.println("el tiempo total es de  " + tiempoToltal + " minutos en tiempo normal");

    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5: Sistema de Gestión de Vuelos");
        /*
         * El aeropuerto El Dorado necesita un sistema para determinar el estado de los
         * vuelos. Un vuelo puede estar: a tiempo, retrasado (más de 15 minutos), o
         * cancelado. Si hay mal clima, todos los vuelos se retrasan 30 minutos
         * adicionales. Simula el estado de 5 vuelos en un día con condiciones
         * climáticas variables.
         */
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6: Optimizador de Rutas de Entrega");
        /*
         * Una empresa de entregas en Cali necesita optimizar las rutas de sus
         * conductores. Cada conductor puede trabajar máximo 8 horas al día. Cada
         * entrega toma entre 30-60 minutos dependiendo de la zona (centro: 30 min,
         * periferia: 45 min, rural: 60 min). Calcula cuántas entregas puede hacer un
         * conductor en un día.
         */
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7: Monitor de Rutina de Ejercicios");
        /*
         * Un gimnasio en Barranquilla necesita un sistema para monitorear las rutinas
         * de ejercicio de sus clientes. Cada ejercicio quema diferentes calorías por
         * minuto: cardio (10 cal/min), pesas (8 cal/min), yoga (5 cal/min). Si el
         * cliente supera 500 calorías quemadas, recibe un bono de 50 puntos. Calcula
         * las calorías totales y puntos ganados.
         */
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8: Sistema de Triaje Hospitalario");
        /*
         * Un hospital en Bucaramanga necesita clasificar pacientes según la urgencia de
         * su atención. Los criterios son: temperatura (>38.5°C = urgente), presión
         * arterial (>140/90 = urgente), dolor (escala 8-10 = urgente). Clasifica a 5
         * pacientes en: urgente, prioritario, o normal.
         */
    }

    public static void ejercicio9() {
        System.out.println("Ejercicio 9: Calculadora de Notas y Promedio Estudiantil");
        /*
         * Una universidad en Manizales necesita calcular el promedio final de sus
         * estudiantes. Las notas se distribuyen así: 30% parciales, 40% proyecto final,
         * 30% participación. Si el promedio es ≥4.0 aprueba, si es ≥3.5 va a
         * supletorio, si es <3.5 reprueba. Calcula el resultado para 3 estudiantes.
         */

        Scanner sc = new Scanner(System.in);

        int cantidadEstudiantes = 3;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("estudiantes" + i + " =");

            System.out.println("ingrese la nota del parcial 0 - 5");
            double parcial = sc.nextDouble();

            System.out.println("ingrese la nota del proyecto final 0 - 5");
            double proyectoFinal = sc.nextDouble();

            System.out.println("ingrese la nota de la participacion 0 - 5");
            double participacion = sc.nextDouble();

            double promedio = (parcial * 0.3) + (proyectoFinal * 0.4) + (participacion * 0.3);
            System.out.println(String.format("%.2f", promedio));

            if (promedio >= 4) {
                System.out.println("aprueba");

            } else if (promedio >= 3.5) {
                System.out.println("va a supletorio");

            } else {
                System.out.println("reprobo");
            }

        }

    }

    public static void ejercicio10() {
        System.out.println("Ejercicio 10: Sistema de Riego Automático para Cultivos");
        /*
         * Una granja en Boyacá tiene un sistema de riego automático que debe activarse
         * según las condiciones del cultivo. Si la humedad del suelo es <30%, se activa
         * riego por 60 minutos. Si la temperatura es >25°C y humedad <50%, se activa
         * por 30 minutos. Si llovió en las últimas 24 horas, no se activa el riego.
         * Simula el sistema durante una semana.
         */
    }

}
