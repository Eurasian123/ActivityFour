package com.example.activityfour

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameWelcome = findViewById<TextView>(R.id.textViewNameWelcome)
        val goodTitle = findViewById<TextView>(R.id.textViewTitle)
        val choiceSwitch = findViewById<Switch>(R.id.switch1)
        val choiceButton = findViewById<Button>(R.id.choiceButton)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val equalButton = findViewById<Button>(R.id.equalButton)
        val returnButton = findViewById<Button>(R.id.returnButton)
        val nameText = findViewById<EditText>(R.id.editTextText)
        val variableOne = findViewById<EditText>(R.id.editTextNumberDecimal)
        val variableTwo = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val choiceA = findViewById<TextView>(R.id.textViewChoiceA)
        val choiceB = findViewById<TextView>(R.id.textViewChoiceB)
        val textSum = findViewById<TextView>(R.id.textViewAddition)
        val textDiff = findViewById<TextView>(R.id.textViewSubtraction)
        val textProd = findViewById<TextView>(R.id.textViewMultiplication)
        val textQuot = findViewById<TextView>(R.id.textViewDivision)
        val resultSum = findViewById<TextView>(R.id.textViewAdditionRes)
        val resultDiff = findViewById<TextView>(R.id.textViewSubtractionRes)
        val resultProd = findViewById<TextView>(R.id.textViewMultiplicationRes)
        val resultQuot = findViewById<TextView>(R.id.textViewDivisionRes)
        val clearButton = findViewById<Button>(R.id.clearButton)

        choiceButton.setOnClickListener {
            choiceA.isVisible = false
            choiceB.isVisible = false
            choiceSwitch.isVisible = false
            choiceSwitch.isClickable = false
            choiceButton.isVisible = false
            choiceButton.isClickable = false
            returnButton.isVisible = true
            returnButton.isClickable = true
            if (choiceSwitch.isChecked) {
                nameWelcome.isVisible = false
                goodTitle.isVisible = true
                variableOne.isVisible = true
                variableOne.isClickable = true
                variableTwo.isVisible = true
                variableTwo.isClickable = true
                textSum.isVisible = true
                textDiff.isVisible = true
                textProd.isVisible = true
                textQuot.isVisible = true
                equalButton.isVisible = true
                equalButton.isClickable = true
            }
            else {
                nameWelcome.setText(R.string.name_insert)
                goodTitle.isVisible = true
                goodTitle.setText(R.string.operations)
                nameText.isVisible = true
                nameText.isClickable = true
                submitButton.isVisible = true
                submitButton.isClickable = true
            }
        }

        submitButton.setOnClickListener {
            nameWelcome.text = "Hello, " + nameText.text + "!"
            nameText.isVisible = false
            submitButton.isVisible = false
        }

        equalButton.setOnClickListener {
            resultSum.text = (variableOne.text.toString().toInt()+variableTwo.text.toString().toInt()).toString()
            resultDiff.text = (variableOne.text.toString().toInt()-variableTwo.text.toString().toInt()).toString()
            resultProd.text = (variableOne.text.toString().toInt()*variableTwo.text.toString().toInt()).toString()
            resultQuot.text = (variableOne.text.toString().toInt()+variableTwo.text.toString().toInt()).toString()
            resultSum.isVisible = true
            resultDiff.isVisible = true
            resultProd.isVisible = true
            resultQuot.isVisible = true
            clearButton.isVisible = true
            clearButton.isClickable = true
        }

        clearButton.setOnClickListener {
            resultSum.isVisible = false
            resultDiff.isVisible = false
            resultProd.isVisible = false
            resultQuot.isVisible = false
            clearButton.isVisible = false
            clearButton.isClickable = false
        }

        returnButton.setOnClickListener {
            choiceA.isVisible = true
            choiceB.isVisible = true
            choiceSwitch.isVisible = true
            choiceSwitch.isClickable = true
            choiceButton.isVisible = true
            choiceButton.isClickable = true
            returnButton.isVisible = false
            returnButton.isClickable = false
            if (choiceSwitch.isChecked) {
                nameWelcome.isVisible = true
                goodTitle.isVisible = false
                variableOne.isVisible = false
                variableOne.isClickable = false
                variableOne.setText("")
                variableTwo.isVisible = false
                variableTwo.isClickable = false
                variableTwo.setText("")
                textSum.isVisible = false
                textDiff.isVisible = false
                textProd.isVisible = false
                textQuot.isVisible = false
                equalButton.isVisible = false
                equalButton.isClickable = false
                resultSum.isVisible = false
                resultDiff.isVisible = false
                resultProd.isVisible = false
                resultQuot.isVisible = false
                clearButton.isVisible = false
                clearButton.isClickable = false
            }
            else {
                nameWelcome.setText(R.string.choice)
                goodTitle.isVisible = false
                goodTitle.setText(R.string.arithmetic)
                nameText.isVisible = false
                nameText.isClickable = false
                nameText.setText("")
                submitButton.isVisible = false
                submitButton.isClickable = false
            }
        }
    }
}