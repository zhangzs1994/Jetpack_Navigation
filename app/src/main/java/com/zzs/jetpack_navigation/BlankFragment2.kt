package com.zzs.jetpack_navigation


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_blank2.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    val args: BlankFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgs()
        finish()
    }

    private fun getArgs() {
//        val name = args.name
//        val sex = args.sex
//        val age = args.age

        val name = arguments?.getString("name")
        val sex = arguments?.getString("sex")
        val age = arguments?.getInt("age")
        tv_agrs.text =
            "${resources.getString(R.string.send_args)}\nname=${name}\nsex=$sex\nage=$age"
    }

    private fun finish() {
        tv_back.setOnClickListener {
            it.findNavController().popBackStack()
        }
    }

}
