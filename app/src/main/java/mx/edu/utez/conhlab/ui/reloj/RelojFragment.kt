package mx.edu.utez.conhlab.ui.reloj

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import mx.edu.utez.conhlab.R

class RelojFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val  view  = inflater.inflate(R.layout.fragment_reloj,container,false)
        val rel = view.findViewById<TextView>(R.id.hora)

        return view

    }
}