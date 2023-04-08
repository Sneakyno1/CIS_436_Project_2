package com.example.cis_436_project_2.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cis_436_project_2.R
import com.example.cis_436_project_2.databinding.FragmentCatInformationBinding

class CatInformation : Fragment() {

    private lateinit var binding: FragmentCatInformationBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCatInformationBinding.inflate(inflater , container, false)
        return binding.root
    }
}