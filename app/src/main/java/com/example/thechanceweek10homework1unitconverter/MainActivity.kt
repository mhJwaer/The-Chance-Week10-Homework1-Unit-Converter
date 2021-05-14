package com.example.thechanceweek10homework1unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.example.thechanceweek10homework1unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSpinnersAdapter()

    }

    private fun initSpinnersAdapter() {
        val adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerFrom.adapter = adapter
        binding.spinnerTo.adapter = adapter
    }

    fun convert(view: View) {
        val input: Double = (binding.editTextFrom.text.toString()).toDouble()
        val converter = Converter(Unit.formString(binding.spinnerFrom.selectedItem.toString()), Unit.formString(binding.spinnerTo.selectedItem.toString()))
        binding.textViewTo.text = (converter.convert(input)).toString()
    }
}