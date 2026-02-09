- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- ITERADORES
- Eliminación de Números Pares
Programa que muestra la forma correcta y segura de eliminar elementos de una lista mientras se recorre en Java.

🚀 Funcionalidades
- Generación Automática: Crea una lista secuencial de números del 1 al 100.
- Filtrado Dinámico: Identifica y elimina todos los números pares de la colección.
- Recorrido Seguro: Implementa una solución robusta para modificar una lista durante su iteración sin lanzar excepciones.

🛠️ Estructura técnica
- El proyecto destaca por el uso de la interfaz Iterator:
- iterator.hasNext(): Controla el flujo del bucle verificando la existencia de elementos restantes.
- iterator.next(): Recupera de forma segura el siguiente valor de la lista.
- iterator.remove(): Realiza la eliminación física del elemento, evitando la clásica excepción ConcurrentModificationException que ocurriría al usar un bucle for-each tradicional.
