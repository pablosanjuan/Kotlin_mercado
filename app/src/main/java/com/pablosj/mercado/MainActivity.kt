package com.pablosj.mercado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.pablosj.mercado.fragments.HistoricoFragment
import com.pablosj.mercado.fragments.ListaFragment
import com.pablosj.mercado.fragments.NuevoFragment
import com.pablosj.mercado.fragments.OpcionesFragment

lateinit var opcionesFragment: OpcionesFragment
lateinit var historicoFragment: HistoricoFragment
lateinit var nuevoFragment: NuevoFragment
lateinit var listaFragment: ListaFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        opcionesFragment = OpcionesFragment.newInstance()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, opcionesFragment)
            .addToBackStack(opcionesFragment.toString())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }
}