package com.example.thechanceweek10homework1unitconverter

enum class Unit {

    INCH, CENTIMETER, FOOT, YARD, METER, MILE, KILOMETER;

    // Helper method to convert text to one of the above constants
    companion object {
        fun formString(text: String): Unit {
            for (unit in values()) {
                if (text == unit.toString()) {
                    return unit
                }
            }
            throw IllegalArgumentException("Cannot find a value for $text")
        }
    }
}