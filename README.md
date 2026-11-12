# Calculadora MVC

Calculadora sencilla en Java Swing con **sumar, restar, multiplicar y limpiar**. Usa `BigDecimal` para trabajar con decimales.

El total comienza en **1** y cada operacion usa el total acumulado. **Limpiar** lo regresa a 1.

# **[Ver video explicativo](https://youtu.be/p8Z2PbJRp-Y)**

## Ejecutar

```bash
javac CalcMVC.java CalcModel.java CalcView.java CalcController.java
java CalcMVC
```

O ejecutar el archivo `CalculadoraMVC.jar` con `java -jar CalculadoraMVC.jar`.

**MVC:** `CalcModel` calcula, `CalcView` muestra los botones y `CalcController` conecta ambos.


## Diagrama de clases

```mermaid
classDiagram
    direction TB

    class CalcMVC {
        +main(String[] args) void
    }

    class CalcModel {
        -BigDecimal total
        +multiplyBy(BigDecimal value) void
        +addBy(BigDecimal value) void
        +subtractBy(BigDecimal value) void
        +clear() void
        +getTotal() BigDecimal
    }

    class CalcView {
        -JTextField input
        -JLabel result
        -JButton multiplyButton
        -JButton addButton
        -JButton subtractButton
        -JButton clearButton
    }

    class CalcController {
        -CalcModel model
        -CalcView view
    }

    CalcMVC ..> CalcModel : crea
    CalcMVC ..> CalcView : crea
    CalcMVC ..> CalcController : crea

    CalcController --> CalcModel : realiza operaciones
    CalcController --> CalcView : controla interfaz
```
