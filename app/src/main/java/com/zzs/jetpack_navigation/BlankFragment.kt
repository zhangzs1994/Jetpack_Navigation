package com.zzs.jetpack_navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_blank.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        tv_jump.setOnClickListener {
            //val action = BlankFragmentDirections.actionBlankFragmentToBlankFragment2()
            //it.findNavController().navigate(action)
            val bundle = bundleOf(
                "name" to "张三",
                "sex" to "男",
                "age" to 20
            )
            it.findNavController().navigate(R.id.action_blankFragment_to_blankFragment2, bundle)
        }
    }

}
