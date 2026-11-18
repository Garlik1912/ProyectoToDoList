package com.example.interfaces_movil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            startActivity(Intent(this, TareasActivity::class.java))
        }

        findViewById<TextView>(R.id.txtInvitado).setOnClickListener {
            startActivity(Intent(this, TareasActivity::class.java))
        }

        findViewById<TextView>(R.id.txtCrearCuenta).setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
    }
}
///registro
//        setContentView(R.layout.activity_registro)
//Lista de tareas
//        setContentView(R.layout.activity_tareas)
//Nueva tarea
//        setContentView(R.layout.activity_nueva_tarea)
//Configuraciones
//        setContentView(R.layout.activity_configuraciones)
//Inicio de sesión (para volver)
//        setContentView(R.layout.activity_main)

///Se reemplaza de manera manual en el setcontent.
//unica solucion que encontre hasta ahora.
//Actualizacion... ya encontre la forma, no fue tan facil pero...
//lo logre solo tuve que investigar un poco y la verdad ya esta, es algo simple
// pero funcional, aun falta investigarlo mas, ya que no lo entendi por completo
// pero ya esta por el momento