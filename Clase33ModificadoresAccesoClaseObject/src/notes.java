/*

Modificadores de acceso

                        Visibilidad
 
modificador   clase   package   subclase  todos <- otro paquete

public         Sí       Sí        Sí       Sí            

protected      Sí       Sí        Sí       No

private        Sí       No        No       No

por defecto    Sí       Sí        No       No

Una variable protected es accesible en una sublclase
aunque esté en un paquete diferente


Cómo modifica el modificador a la visibilidad en el programa

public
Es viisble desde la propia clase
Es visible desde el propio paquete desde cualquier clase
Es visible desde una subclase
Es visible desde cualquier otra clase aunque esté en paquetes diferente

private
Es visible desde la propia clase
NO es visible desde ningún otro sitio

protected
Es visible desde la propia clase (mecanismos interno)
Es visible desde el propio paquete en cualquier clase
Es visible desde una subclase en otro paquete
NO es visile desde cualquier otra clase aunque esté en paquetes distintos

Por defecto
Es visible desde la propia clase
Es visible desde el propio paquete desde cualquier clase
NO es visible desde una subclase en otro paquete
NO es visible desde cualquier otra clase aunque esté en paquetes distintos

Objecto

Todas las clases heredan de Object

	Las nuestras
	Las predefinidas

Está en la cúspide de la jerarquía
Por eso no necesitamos colocar un extends Objects
Por eso en el asistente del IDE nos sale los métodos que heredamos de la clase Objects













 */