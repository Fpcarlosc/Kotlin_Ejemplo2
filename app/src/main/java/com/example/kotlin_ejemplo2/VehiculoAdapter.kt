package com.example.kotlin_ejemplo2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VehiculoAdapter (val context : Context, val lista: ArrayList<Vehiculo>) : RecyclerView.Adapter<VehiculoAdapter.MiViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MiViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.elementos_lista, viewGroup, false)
        return MiViewHolder(view);
    }

    override fun onBindViewHolder(holder: MiViewHolder, position: Int) {
        holder.nombreTextView?.text = lista[position].nombre
        holder.apariciontextView?.text = lista[position].aparicion
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    class MiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView = itemView.findViewById<TextView>(R.id.nombreTextView)
        val apariciontextView = itemView.findViewById<TextView>(R.id.aparicionTextView)
    }
}