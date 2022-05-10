# Callcenter
java tdd

Callcenter
Nos contratan para desarrollar el software de un callcenter para identificar potenciales
clientes del servicio de televisión por cable e internet de una nueva empresa llamada
“Oeste Cable Color”.
El objetivo de la aplicación es poder incorporar el listado de “Contactos”, de los cuales nos
interesa conocer:
 Nombre y Apellido: Valor alfanumérico.
 Celular: Compuesto del código de país + código de área + número de celular.
 E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’.
 Dirección: Valor alfanumérico.
 Código Postal: Valor numérico.
 Localidad: Valor alfanumérico.
 Provincia. Enumerador que contenga las 23 provincias argentinas.
 Es cliente (Si o No): Inicialmente se carga en “No”.
 Desea ser llamado nuevamente (Si o No): Inicialmente se carga en “Si”.
Cuando el operador del callcenter ingresa a la aplicación, debe seleccionar “Realizar nueva
llamada”. En ese momento el sistema debe “buscarAlCandidato” y mostrar por pantalla los
datos de este. Para determinar qué contacto llamar, el sistema debe seleccionar
aleatoriamente un contacto que cumpla con las siguientes condiciones:
1. El contacto NO debe ser cliente aún.
2. El contacto desea ser llamado o al menos no informó lo contrario.
3. El código postal del contacto debe existir en las zonas de cobertura existente.
Una vez que el operador realiza la llamada debe registrar la misma:
a. Si la llamada fue exitosa (en ese caso el contacto pasa a ser cliente, y no se lo debe
volver a llamar).
b. Si el contacto no desea ser llamado nuevamente (la llamada pudo no haber sido
exitosa, pero se haga un nuevo intento en el futuro).
Observaciones: Texto libre donde el operador deja registro de lo conversado.
