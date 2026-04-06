# 🛒 Sistema de Gestión de Supermercado (Java)

Este proyecto es una simulación de un sistema de facturación y cálculo de costes de transporte para un supermercado, desarrollado en **Java**.

## 🎯 Objetivos del Proyecto
El objetivo principal de este proyecto es aplicar conceptos avanzados de **Programación Orientada a Objetos (POO)** para resolver un problema de lógica de negocio real (cálculo de tasas logísticas según el tipo de producto).

## 💻 Tecnologías y Conceptos Aplicados
* **Java** (Lenguaje principal).
* **Clases Abstractas:** Uso de la clase `Producto` como plantilla genérica para forzar contratos estructurales en sus clases derivadas.
* **Herencia y Polimorfismo:** Implementación de subclases (`Electrodomestico`, `Bebida`, `Alimento`, `AlimentoBotella`) que sobrescriben métodos para calcular sus propias tasas de transporte.
* **Tipos Enumerados (Enums):** Creación de `TipoConservacion` para manejar de forma segura los estados (NORMAL, FRIO, CONGELADO) y sus costes asociados.
* **Estructuras de Datos:** Uso de `ArrayList` para simular y procesar el carrito de la compra mediante bucles `for-each` y validación de tipos dinámicos.

## 🚀 Cómo funciona
El sistema recibe una lista dinámica de productos (`ArrayList<Producto>`). Mediante polimorfismo, el sistema delega en cada objeto la responsabilidad de calcular su propia tasa de envío basándose en reglas de negocio específicas (ej. sobrecoste por envases de cristal, suplementos por transporte refrigerado o recargos por peso y alcohol). Finalmente, la clase `Supermercado` audita la lista y asegura un cobro mínimo de transporte de 5€.
