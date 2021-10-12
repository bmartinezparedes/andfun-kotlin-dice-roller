# Lanza el dado
En este readme voy explicando paso a paso lo que fui haciendo en mi rama. En ella se podra ver lo que fui entendiendo del proyecto DiceRoller.
## Así lo hice

1. Empiezo en el commit [aab8d5bcb340b037ea8bc70b84b64a7267b622ab](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/aab8d5bcb340b037ea8bc70b84b64a7267b622ab).
En este commit no hay gran cosa, solo marco el comienzo de lo que voy a crear para que se me pueda seguir paso a paso.

2. [Crear Boton](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/f269c28c22fa3392e0f7cdcfa3dd64fec85f648b).
En este commit se puede observar que en el archivo activity_main.xml del layout creo el boton con:
```
        <Button
        android:id="@+id/roll_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="29dp"
        android:text="Boton"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"/>
``` 
 A continuacion en el main lo visualizo
 
 ![image](https://user-images.githubusercontent.com/72441274/136993910-01e316f4-640a-4cd1-9b56-dcd192a9293a.png)

3. [Huella en el boton](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/ee415b1045a2528abc9c8a93b08966eaf9655fce).
Lo primero de todo en el build.gradle implemento el material de android. A continuacion en res/values/styles.xml le cambio el estilo. Por ultimo en layout/activity_main.xml le añado al boton la huella
El resultado seria el siguiente:

![image](https://user-images.githubusercontent.com/72441274/136995091-dfd4c577-aede-4994-bb76-b80afc2348a5.png)

4. En los siguientes commits creo Strings que utilizare para variables que segun el idioma mostrara el mismo texto pero en su idioma.

    [Texto Boton](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/ffbae1aa3d6cd1498bc5a00c4720de2ad4ab52f5)
    
    [Idioma Ingles](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/8ef0a820267616da2539a8809feb927372bd1a18)
    
    [Confirmacion pulsar el boton segun el idioma](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/89b1550a675a5a7c886b3338d04c89110bc000ac)
    
    Quedando algo tal que así:
    
    ![image](https://user-images.githubusercontent.com/72441274/136996176-e9e25c72-6834-4259-8ddf-50c837b7e698.png)
    ![image](https://user-images.githubusercontent.com/72441274/136996323-bc5e71c5-d996-4b50-bbf4-7a27fd993271.png)
    
5. [Creo random](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/61fdce1d37325e8413e0fb4f48a990bf4ede0638).
Loque podras ver en este commit es como creo una funcion random.

6. [Visualizo dado](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/926f05e0726f4c05d67a1d92a8ed7347f1f12e59). En este commit 
visualizo las diferentes caras del dado con la ayuda de la funcion random. Lo que hago es asociar cada imagen de cada lado del dado con un numero aleatorio u despues lo visualizo.

![image](https://user-images.githubusercontent.com/72441274/136997222-0efb647c-8db5-4b56-a528-5f1435cc7723.png)

Con esto concluiria el montaje del proyecto. A mayores uso un random diferente presentado en el proyecto en el commit [Mi random](https://github.com/bmartinezparedes/andfun-kotlin-dice-roller/commit/d7f360f3677ef061b88a0f416d52cd21c53129c9)
