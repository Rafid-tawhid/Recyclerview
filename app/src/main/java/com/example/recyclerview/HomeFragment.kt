package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater,container,false)

        val adapter=EmployeeAdapter {
            Toast.makeText(activity, "" + it.name, Toast.LENGTH_SHORT).show()
        }

        val adapter2=MovieAdapter(::onReceiveMovieFromAdapter)

        binding.empRv.layoutManager=LinearLayoutManager(activity)
        binding.empRv.adapter=adapter2
//        adapter.submitList(employeeList)
        adapter2.submitList(movieList)


        return binding.root
    }
    private fun onReceiveMovieFromAdapter(movie: Movie){

        Toast.makeText(activity, ""+movie.name, Toast.LENGTH_SHORT).show()
    }


}