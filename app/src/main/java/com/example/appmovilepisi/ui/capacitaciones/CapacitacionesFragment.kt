package com.example.appmovilepisi.ui.capacitaciones

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appmovilepisi.R

class CapacitacionesFragment : Fragment() {

    companion object {
        fun newInstance() = CapacitacionesFragment()
    }

    private val viewModel: CapacitacionesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_capacitaciones, container, false)
    }
}