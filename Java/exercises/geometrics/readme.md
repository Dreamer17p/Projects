# Proyecto de figuras geométricas
Este proyecto tiene como objetivo permitir la creación y cálculo de medidas para diferentes tipos de figuras geométricas, como el cilindro, el cuadrado, el rectángulo, el cubo y el triángulo. El proyecto se basa en la utilización de clases que heredan de una clase abstracta llamada "Figure", la cual define los métodos que todas las figuras deben implementar, como el cálculo del perímetro, el área y el volumen (en caso de que sea posible).

## Funcionamiento del algoritmo
El algoritmo acepta medidas de hasta 10cm por longitud de figura y puede calcular los procesos para diferentes tipos de triángulos (isósceles, equilátero y escaleno). Además, cumple con los principios de programación SOLID.

## Principios SOLID aplicados

 - Single Responsibility Principle (SRP): Cada clase tiene una única responsabilidad y no se encarga de más de lo que debe. Por ejemplo, la clase "Triangle" se encarga únicamente de calcular el perímetro y el área de un triángulo y determinar si es equilátero, isósceles o escaleno.

- Open/Closed Principle (OCP): Las clases están abiertas a la extensión pero cerradas a la modificación. Por ejemplo, si se desea agregar una nueva figura, se puede crear una nueva clase que herede de "Figure" y que implemente los métodos correspondientes, sin necesidad de modificar las clases existentes.

- Liskov Substitution Principle (LSP): Todas las clases que heredan de "Figure" pueden ser utilizadas indistintamente como objetos de tipo "Figure". Por ejemplo, si se tiene un método que acepta un objeto "Figure" como parámetro, se puede pasar cualquier objeto que herede de dicha clase sin problemas.

- Dependency Inversion Principle (DIP): Las clases de mayor nivel no dependen de las de menor nivel, sino que ambas dependen de abstracciones. Por ejemplo, la clase "Triangle" no depende directamente de la clase "areasTriangulo", sino de la abstracción "VerificarLados", que es implementada por dicha clase.

- Interface Segregation Principle (ISP): La clase Figure define sólo los métodos necesarios para el cálculo de las medidas de una figura, sin incluir ningún método innecesario.

# Explicación del código

La clase "Figure" es una clase abstracta que define los métodos que deben implementar todas las figuras geométricas. Estos métodos son "perimetro", "area", "volumen" y "puedeCalcularVolumen". La clase también tiene un método llamado "imprimirValores", que se encarga de imprimir los valores calculados para la figura, como el nombre de la figura, el perímetro, el área y el volumen (en caso de que sea posible).

## Ventajas de la solución implementada

La solución implementada en este proyecto es escalable y extensible, lo que significa que nuevas figuras pueden ser fácilmente incluidas en el futuro sin tener que modificar el código existente. Además, el código cumple con los principios de programación SOLID, lo que lo hace fácil de entender y mantener en el futuro.

