# Actividad 1: Método de Euler Modular en Java

Implementación modular en Java del **Método de Euler explícito** para resolver Problemas de Valor Inicial (PVI) de ecuaciones diferenciales ordinarias de primer orden.

## Descripción del Problema
El programa aproxima numéricamente la solución de la ecuación diferencial:
$$y' = x - y$$

Con las siguientes condiciones iniciales y parámetros de malla:
* **Condición inicial:** $y(0) = 1.0$
* **Intervalo de evaluación:** $x \in [0.0, 0.3]$
* **Tamaño de paso ($h$):** `0.1` (configurable en el código fuente a `0.05` o `0.01` para análisis de convergencia)
* **Solución analítica de referencia:** $y(x) = x - 1 + 2e^{-x}$

## Requisitos Previos
* **Java Development Kit (JDK):** Versión 11 o superior.
* **Git** instalado en el sistema.

## Clonación del Repositorio
Para descargar el proyecto de forma local, ejecuta en tu terminal:

```bash
git clone <URL_DE_TU_REPOSITORIO>
cd <NOMBRE_DE_LA_CARPETA>/src
```

*(Nota: Si el archivo `.java` se encuentra en la raíz del repositorio, omite `/src`).*

## Compilación y Ejecución desde la Terminal

1. **Compilar el archivo fuente:**
   ```bash
   javac MetodoEuler.java
   ```

2. **Ejecutar el programa:**
   ```bash
   java MetodoEuler
   ```

## Ejemplo de Salida Esperada ($h = 0.1$)
```text
         x_n     y_n (Euler)
----------------------------------------
0        0.0000  1.0000
1        0.1000  0.9000
2        0.2000  0.8200
3        0.3000  0.7580
```