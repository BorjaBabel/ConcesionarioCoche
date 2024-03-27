Aplicación de principios SOLID:

Responsabilidad Única: Cada clase tiene una sola responsabilidad. Por ejemplo, Coche gestiona la información del coche y Factura el cálculo y gestión de facturas.

Abierto/Cerrado: Las clases son extensibles sin necesidad de modificarlas. Por ejemplo, Vehiculo puede ser implementado por diferentes tipos de vehículos además de Coche.

Sustitución de Liskov: Coche puede ser sustituido por cualquier otro objeto que implemente Vehiculo sin afectar el comportamiento.

Segregación de Interfaces: Vehiculo es una interfaz que segrega los métodos específicos para operaciones de vehículos.

Inversión de Dependencias: Las clases de alto nivel como Concesionario no dependen directamente de clases de bajo nivel como Coche o Pieza, sino a través de abstracciones como Vehiculo.