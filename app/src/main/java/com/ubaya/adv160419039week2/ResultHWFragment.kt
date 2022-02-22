package com.ubaya.adv160419039week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_result_h_w.*

class ResultHWFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments != null) {
            //val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
            val score = ResultHWFragmentArgs.fromBundle(requireArguments()).score
            txtScore.text = "Your score is $score"
        }
        btnRetry.setOnClickListener {
            val action = ResultHWFragmentDirections.actionMainHW()
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result_h_w, container, false)
    }
}