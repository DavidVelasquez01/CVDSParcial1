David Felipe Velasquez Contreras

Este es el seguimiento de lo realizado en el parcial 1 de CVDS

en primer lugar se utilizo spring initializer de esta manera:

![alt text](image.png)

Con ello ya que no se encuentra alli, añadimos el plugin de jacoco para usarlo mas adelante

![alt text](image-1.png)

Luego se crea el scaffolding de lo que necesitamos y añadimos esta inicializacion del proyecto al repositorio:

![alt text](image-2.png)

Vamos a empezar haciendo pruebas de unidad de lo que necesitariamos que tuviera nuestro modelo de product, lo cual al utilizar 4 elementos que necesitamos necesitaremos probar los getters y setters que realizaremo

![alt text](image-3.png)

Luego creamo una nueva rama develop donde haremos los cambios y haremos un pull request cuando hayamos finalizado

![alt text](image-5.png)


Ahora para el patron de diseño necesitamos utilizar el patron observador, que va a tener presente si algo dentro del product cambia, por ende he aqui la implementacion:


Creamos un nuevo directorio observers donde se encontraran los agentes, esta va a ser nuestra interfaz de agente:

![alt text](image-9.png)

Y esta la implementacion de esta interfaz de cada uno de los agentes

![alt text](image-10.png)

![alt text](image-11.png)

Con esto ya tenemos el mismo metodo implementado para cada uno, ahora los vamos a utilizar en una lista de agentes que se va a crear en cada product.

![alt text](image-12.png)


Y este metodo de notificar agentes sera llamado cada vez que se detecte un cambio en la cantidad que es lo que nos interesa.

Con ello queda implementado nuestro patron observer, utilicé algo de este estilo:

![alt text](image-13.png)

En este caso el Sujeto no es implementado sino que su logica esta desarrollada en producto, el Observador general sera el AGENTE y los dos agentes que tenemos es cada uno de los observadores concretos.

Ahora vamos a implementar el api rest en una nueva clase de ProductService utilizando algunos metodos y formas de persistencia que vamos a implementar en otra clase de ProductRepository

Aqui realizamos la persistencia con un hash map

![alt text](image-14.png)


Y aqui llamamos esos metodos

![alt text](image-15.png)


Ahora si para utilizarlo se necesita hacer el controller que esta aqui:

![alt text](image-16.png)

Con ello deberia bastar segun la logica de la implementacion, vamos a probar el comando de spring boot:

