package com.pablosj.mercado.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.pablosj.mercado.*
import kotlinx.android.synthetic.main.fragment_opciones.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OpcionesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OpcionesFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        historicoFragment = HistoricoFragment.newInstance()
        nuevoFragment = NuevoFragment.newInstance()
        listaFragment = ListaFragment.newInstance()
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_opciones, container, false)
    }

    private fun init() {
        opc_historico.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.container, historicoFragment)?.addToBackStack(opcionesFragment.toString())
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)?.commit()
        }
        opc_nuevo.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.container, nuevoFragment)?.addToBackStack(opcionesFragment.toString())
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)?.commit()
        }
        opc_lista.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.container, listaFragment)?.addToBackStack(opcionesFragment.toString())
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)?.commit()
        }
    }

    companion object {
        fun newInstance() =
            OpcionesFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}