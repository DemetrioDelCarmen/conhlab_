package mx.edu.utez.conhlab.ui.home

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import es.dmoral.toasty.Toasty
import mx.edu.utez.conhlab.R
import mx.edu.utez.conhlab.ui.reloj.RelojFragment

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_good_day, container, false)




        val btnChecar = root.findViewById<Button>(R.id.btn_checar)
        btnChecar.setOnClickListener {


            val alertDialog: AlertDialog? = activity?.let {
                val builder = AlertDialog.Builder(it)

                builder.apply {
                    setPositiveButton(
                        R.string.txt_aceptar,
                        DialogInterface.OnClickListener { dialog, id ->



                            val conexion =
                            Toasty.success(context, R.string.txt_confirmacion_chequeo, Toast.LENGTH_LONG, true).show()


                        })
                    setNegativeButton(
                        R.string.txt_cancelar,
                        DialogInterface.OnClickListener { dialog, id ->


                            Toasty.warning(context,R.string.txt_negacion_chequeo,
                                Toast.LENGTH_LONG,true).show()

                        })
                    setTitle(R.string.title_confirmar_chequeo)
                    setMessage(R.string.message_confirmar_chequeo)
                }



                builder.create()

            }

            alertDialog?.show()


        }




        return root
    }
}