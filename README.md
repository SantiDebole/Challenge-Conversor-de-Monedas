Conversor de Monedas 🌍💱
Este proyecto es una aplicación Java que permite consultar las tasas de conversión entre diferentes monedas utilizando la API de ExchangeRate-API. 🚀

Características ✨
Conversión entre cualquier par de monedas compatibles con la API.
Fácil integración con la API de ExchangeRate.
Manejo robusto de errores para conexiones de red y deserialización de datos.
Código modular y fácil de mantener.
Requisitos 🛠️
Para ejecutar este proyecto necesitas:

Java 11 o superior.
Dependencia de Gson para manejar JSON:
xml
Copiar código
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10</version>
</dependency>
Acceso a Internet para realizar las consultas a la API.
Un API key válido de ExchangeRate-API.
Instalación ⚙️
Clona este repositorio:

bash
Copiar código
git clone https://github.com/tu-usuario/conversor-monedas.git
cd conversor-monedas
Configura tu API key:

Crea una variable de entorno llamada EXCHANGERATE_API_KEY con tu API key, o inclúyela directamente en el código en el archivo ConsultaMoneda.java.
Compila el proyecto:

bash
Copiar código
javac -cp gson-2.10.jar ConsultaMoneda.java
Ejecuta el programa:

bash
Copiar código
java -cp .:gson-2.10.jar ConsultaMoneda
Uso 🚀
La clase principal del proyecto es ConsultaMoneda. Puedes utilizar el método buscarMoneda para obtener información sobre la tasa de cambio entre dos monedas.

Ejemplo de uso:

java
Copiar código
ConsultaMoneda consulta = new ConsultaMoneda();
Monedas resultado = consulta.buscarMoneda("USD", "EUR");
System.out.println("1 USD equivale a " + resultado.getConversionRate() + " EUR");
Estructura del Proyecto 📂
bash
Copiar código
├── src/
│   ├── ConsultaMoneda.java  # Lógica principal para consultar la API
│   ├── Monedas.java         # Clase modelo para mapear la respuesta de la API
├── README.md                # Documentación del proyecto
Mejoras Futuras 🚧
 Agregar una interfaz gráfica para facilitar el uso.
 Soporte para múltiples conversiones en una sola consulta.
 Manejo de diferentes idiomas para la interfaz de usuario.
 Tests unitarios para garantizar la estabilidad del código.
Contribuciones 🤝
¡Las contribuciones son bienvenidas! Si tienes ideas para mejorar este proyecto, no dudes en abrir un issue o enviar un pull request.

Licencia 📄
Este proyecto está licenciado bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

¡Gracias por visitar este proyecto! 🌟 Si te resultó útil, no olvides darle una ⭐ en GitHub. 😊
