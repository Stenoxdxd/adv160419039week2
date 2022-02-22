package com.ubaya.adv160419039week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main_h_w.*

class MainHWFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var score = 0
        var num1 = (0..10).random()
        var num2 = (0..10).random()
        var correctAnswer = num1 + num2
        textQuestion.setText("$num1 + $num2")
        btnSubmit.setOnClickListener {
            //check if the answer is correct
            var answer = txtAnswer.text.toString().toInt()
            if(answer == correctAnswer)
            {
                num1 = (0..10).random()
                num2 = (0..10).random()
                correctAnswer = num1 + num2
                textQuestion.setText("$num1 + $num2")
                score += 1
            }else
            {
                val action = MainHWFragmentDirections.actionResultHW(score)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_h_w, container, false)
    }
}