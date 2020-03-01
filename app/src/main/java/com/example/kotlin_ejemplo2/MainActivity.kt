package com.example.kotlin_ejemplo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creamos la lista de vehiculos.
        val vehiculos = ArrayList<Vehiculo>()

        vehiculos.add(Vehiculo("Ecto1", "Los cazafantasmas"))
        vehiculos.add(Vehiculo("DeLorean", "Regreso al futuro"))
        vehiculos.add(Vehiculo("Kitt", "El coche fantástico"))
        vehiculos.add(Vehiculo("Halcón Milenario", "Star Wars"))
        vehiculos.add(Vehiculo("Planet Express", "Futurama"))
        vehiculos.add(Vehiculo("TARDIS", "Doctor Who"))
        vehiculos.add(Vehiculo("USS Enterprise", "Star Trek"))
        vehiculos.add(Vehiculo("Nabucodonosor", "Matrix"))
        vehiculos.add(Vehiculo("Odiseus", "Ulises 31"))
        vehiculos.add(Vehiculo("Nostromo", "Alien"))

        // Buscamos el RecyclerView e indicamos que su tamaño es fijo
        val recycler = findViewById<RecyclerView>(R.id.recyclerView)

        recycler.setHasFixedSize(true)

        // Añadimos la línea de separación de elementos de la lista
        // 0 para horizontal y 1 para vertical
        recycler.addItemDecoration(DividerItemDecoration(this@MainActivity, 1))

        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val adapter = VehiculoAdapter(this, vehiculos)

        recycler.adapter = adapter
    }
}
