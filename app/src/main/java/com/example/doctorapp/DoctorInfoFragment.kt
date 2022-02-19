package com.example.doctorapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.doctorapp.databinding.FragmentDoctorInfoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DoctorInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DoctorInfoFragment : Fragment() {
    // TODO: Rename and change types of parameters

    lateinit var binding:FragmentDoctorInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentDoctorInfoBinding.inflate(inflater,container,false)
       val view=binding.root
        binding.button9.setOnClickListener {
            Toast.makeText(activity,"Fragment work",Toast.LENGTH_SHORT).show()
        }
        return view
    }

}