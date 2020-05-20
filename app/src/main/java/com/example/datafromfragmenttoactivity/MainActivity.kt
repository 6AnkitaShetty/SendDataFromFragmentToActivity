package com.example.datafromfragmenttoactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), MyListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragmentA()
    }

    private fun addFragmentA() {
        val fragmentA = FragmentA()
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.containerFragmentA, fragmentA, "fragA")
        transaction.commit()
    }

    // Called from FragmentA
    override fun addTwoNumbers(num1: Int, num2: Int) {
        val result = num1 + num2
        txvResult.text = "Result : $result"
    }
}
