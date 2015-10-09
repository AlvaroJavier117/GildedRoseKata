# The Gilded Rose Code Kata

This is a Java version of the Gilded Rose Kata derived from 
[Jim Weirich's Ruby version](https://github.com/jimweirich/gilded_rose_kata).

The original version of this Kata can be found 
[here](http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/).

This README is largely derived from Jim's README.

This is a refactorying kata, so you will be starting with a legacy
code base.  To work the Kata, clone this git repository and checkout
the tag 'start-here'. Read the description below for the "rules"
involving this kata.

## Changes from Jim's Version

Obviously this version is done in Java. I've added a GildedRose class to hold the 
updateQuality() method. The tests are done using JUnit 4, which is much different than
Jim's RSpec Given style.

## Changes from the Original Java Version

This Java version carefully follows Jim's Ruby version so we share the same changes.

* The original had no tests.  Since this is a refactoring kata, I feel
  the tests are important and provide a fairly complete test suite.
  Just delete the tests if you wish to "go it alone".
  
* This version has failing tests in place for the new requirements detailed
  below.

* The original used a hard coded set of "items", presumably for
  testing the code.  Since I added a test suite, the hard coded values
  were not of much use.  I also changed the interface to accept a list of
  items as a parameter rather than a hard coded constant.

You can read
[the original kata article](http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/) for more details.

## Installation Hints

This should work as an Eclipse project by cloning into Eclipse.

## Git Branches

* The 'master' branch contains the starting point for the kata.  It is
  also tagged as 'start-here'.

Hope you enjoy this.     -- Mark


# Original Description of the Gilded Rose

Hi and welcome to team Gilded Rose. As you know, we are a small inn
with a prime location in a prominent city run by a friendly innkeeper
named Allison. We also buy and sell only the finest
goods. Unfortunately, our goods are constantly degrading in quality as
they approach their sell by date. We have a system in place that
updates our inventory for us. It was developed by a no-nonsense type
named Leeroy, who has moved on to new adventures. Your task is to add
the new feature to our system so that we can begin selling a new
category of items. First an introduction to our system:

- All items have a SellIn value which denotes the number of days we
  have to sell the item
- All items have a Quality value which denotes how valuable the item
  is
- At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

  - Once the sell by date has passed, Quality degrades twice as fast
  - The Quality of an item is never negative
  - "Aged Brie" actually increases in Quality the older it gets
  - The Quality of an item is never more than 50
  - "Sulfuras", being a legendary item, never has to be sold or
    decreases in Quality
  - "Backstage passes", like aged brie, increases in Quality as it's
    SellIn value approaches; Quality increases by 2 when there are 10
    days or less and by 3 when there are 5 days or less but Quality
    drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

- "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any
new code as long as everything still works correctly. However, do not
alter the Item class or Items property as those belong to the goblin
in the corner who will insta-rage and one-shot you as he doesn't
believe in shared code ownership (you can make the UpdateQuality
method and Items property static if you like, we'll cover for
you). Your work needs to be completed by Friday, February 18, 2011
08:00:00 AM PST.

Just for clarification, an item can never have its Quality increase
above 50, however "Sulfuras" is a legendary item and as such its
Quality is 80 and it never alters.

# Getting Started

Once you have the project cloned and building in Eclipse run the tests.
You will have some failing tests. It's your job to get them passing.

/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
 /*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
  /*/*/*/*/Espa�ol Espa�ol Espa�ol Espa�ol Espa�ol Espa�ol Espa�ol/*/*/*/*/*/*/*/*/
   /*/*/*/*/Espa�ol Espa�ol Espa�ol Espa�ol Espa�ol Espa�ol Espa�ol/*/*/*/*/*/*/*/*/
    /*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
     /*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
     
     
     
# The Gilded Rose C�digo Kata

Esta es una versi�n Java de la dorada Rose Kata deriva de
[Versi�n de Jim Weirich Rub�] (https://github.com/jimweirich/gilded_rose_kata).

La versi�n original de esta Kata se puede encontrar
[aqu�] (http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/).

Este README se deriva en gran parte de README de Jim.

Este es un kata refactorying, por lo que ser� a partir de un legado
c�digo base. Para trabajar el Kata, clonar este repositorio git y la salida
la etiqueta 'start-aqu�'. Lea la descripci�n a continuaci�n para las "reglas"
que implica este kata.

## Los cambios desde la versi�n de Jim

Obviamente, esta versi�n se hace en Java. He a�adido una clase GildedRose para mantener el
m�todo updateQuality (). Las pruebas se realizaron utilizando JUnit 4, que es muy diferente a
RSpec de Jim Dado estilo.

## Cambios de la original versi�n Java

Esta versi�n de Java sigue cuidadosamente la versi�n de Jim Rub� por lo que compartimos los mismos cambios.

* El original no ten�a pruebas. Dado que este es un kata refactorizaci�n, siento
��las pruebas son importantes y proporcionan un conjunto de pruebas bastante completo.
��Simplemente elimine las pruebas si quiere "ir por libre".
��
* Esta versi�n ha no superen los ensayos establecidos para los nuevos requisitos detallados
��a continuaci�n.

* El original utiliza un conjunto codificado de "art�culos", presumiblemente por
��probar el c�digo. Desde he a�adido un conjunto de pruebas, los valores codificados duro
��no eran de mucha utilidad. Tambi�n he cambiado la interfaz de aceptar una lista de
��art�culos como un par�metro en lugar de una constante modificable.

Puedes leer
[art�culo kata originales] (http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/) para m�s detalles.

## Consejos de instalaci�n

Esto deber�a funcionar como un proyecto de Eclipse de la clonaci�n en Eclipse.

## Ramas Git

* La rama 'master' contiene el punto de partida para el kata. es
��Tambi�n etiquetado como 'start-aqu�'.

Espero que disfruten de este. -- Marcos


# Original Descripci�n de la Rosa Dorada

Hola y bienvenidos al equipo dorado Rose. Como ustedes saben, somos una peque�a posada
con una ubicaci�n privilegiada en una ciudad prominente dirigido por un posadero amigable
llamado Allison. Tambi�n compramos y vendemos s�lo los mejores
mercanc�as. Por desgracia, nuestros productos est�n en constante degradando la calidad como
se acercan a su fecha de caducidad. Tenemos un sistema en el lugar que
actualiza nuestro inventario para nosotros. Fue desarrollado por un tipo sin sentido
llamado Leeroy, que ha pasado a nuevas aventuras. Su tarea consiste en a�adir
la nueva caracter�stica a nuestro sistema para que pueda comenzar a vender un nuevo
categor�a de art�culos. En primer lugar una introducci�n a nuestro sistema:

- Todos los art�culos tienen un valor Sellin, que indica el n�mero de d�as que
��tienen que vender el art�culo
- Todos los art�culos tienen un valor de calidad que denota lo valioso que el elemento
��es
- Al final de cada d�a nuestro sistema reduce tanto los valores para cada art�culo

Bastante simple, �verdad? Pues aqu� es donde se pone interesante:

��- Una vez que la fecha de caducidad ha pasado, la calidad se degrada dos veces m�s r�pido
��- La calidad de un art�culo nunca es negativo
��- "Brie Aged" en realidad aumenta en calidad cuanto m�s viejo se pone
��- La calidad de un art�culo es nunca m�s de 50
��- "Sulfuras", al ser un objeto legendario, nunca tiene que ser vendido o
����disminuciones en la calidad
��- "Entre bastidores pasa", como brie edad, aumenta en calidad, ya que es
����Enfoques de valor Sellin; Aumentos de calidad por 2 cuando hay 10
����d�as o menos y por 3 cuando hay 5 d�as o menos, pero de calidad
����se reduce a 0 despu�s del concierto

Hemos firmado recientemente un proveedor de art�culos conjurado. Esto requiere una actualizaci�n de nuestro sistema:

- Art�culos "conjurado" degradan en Calidad doble de r�pido que los elementos normales

Si�ntase libre de hacer cualquier cambio en el m�todo UpdateQuality y a�adir cualquier
nuevo c�digo mientras todo sigue funcionando correctamente. Sin embargo, no lo hacen
alterar la propiedad de clase de art�culo o art�culos como aquellos pertenecen a la goblin
en la esquina que se insta-rabia y de una sola vez que como no lo hace
creer en la propiedad de c�digo compartido (se puede hacer el UpdateQuality
m�todo y Art�culos propiedad est�tica si se quiere, vamos a cubrir para
t�). Su trabajo debe ser completado por el Viernes, 18 de febrero 2011
08:00:00 AM PST.

S�lo una aclaraci�n, un elemento no puede tener su aumento de Calidad
por encima de 50, sin embargo "Sulfuras" es un elemento de leyenda y como tal su
La calidad es 80 y nunca se altera.

# Empezando

Una vez que haya el proyecto clonado y la construcci�n en Eclipse ejecutar las pruebas.
Usted tendr� algunas pruebas que fallan. Es su trabajo para conseguir que pasa.
