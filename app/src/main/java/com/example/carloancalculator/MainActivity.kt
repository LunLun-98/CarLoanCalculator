package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
            calloan()
        }
    }

    private fun calloan() {
        val carPrice: Double = CarPrice.text.toString().toDouble()
        val downPayment: Double = DownPayment.text.toString().toDouble()
        val period: Double = LoanPeriod.text.toString().toDouble()
        val interestRate: Double = InterestRate.text.toString().toDouble()

        val carLoan: Double = carPrice - downPayment
        val interest: Double = carLoan * interestRate * period
        val MonthlyRepayment = (carLoan + interest) / period /12

        view1.text = "RM %.2f".format(carLoan)
        view2.text = "RM %.2f".format(interest)
        view3.text = "RM %.2f".format(MonthlyRepayment)

    }
}
