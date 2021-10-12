/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Mi solucion empieza aquí
        //prueba de autor

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            //Pongo Tosat de comentario y llamo a la funcion de girar al dado
            //Cuando pulse el boton me generara un numero que despues mostrara en pantalla
            //Toast.makeText(this, R.string.ConfiTextoBoton, Toast.LENGTH_SHORT).show()
            girarDado()
        }

    }
    //Creo la funcion random que me devolvera un numero que sera despues lo que muestre en el layout
    private fun girarDado() {
        /*val randomInt = Random().nextInt(6) + 1*/
        //random que va desde 0 al 6 ambos no incluidos
        val mirandom=(0 until 6).random()
        //Creo una variable en la que dependiendo del numero random que le llegue cargara una imagen
        val drawableResource = when (mirandom){
            1 -> R.drawable.cara1
            2 -> R.drawable.cara2
            3 -> R.drawable.cara3
            4 -> R.drawable.cara4
            5 -> R.drawable.cara5
            else -> R.drawable.cara6
        }
        //Aquí creo la variable de imagen del dado que se enviara a mostrar
        val imagDado: ImageView= findViewById(R.id.imagenDado)
        imagDado.setImageResource(drawableResource)


    }
}