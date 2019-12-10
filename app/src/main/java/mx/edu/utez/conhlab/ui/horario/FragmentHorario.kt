package mx.edu.utez.conhlab.ui.horario

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import mx.edu.utez.conhlab.R

class FragmentHorario: Fragment() {

    private lateinit var _viewHorario: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        _viewHorario = inflater.inflate(R.layout.fragment_horario_periodo,container,false)


        return _viewHorario

    }
}