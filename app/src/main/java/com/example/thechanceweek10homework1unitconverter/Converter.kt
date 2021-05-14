package com.example.thechanceweek10homework1unitconverter

class Converter(from: Unit, to: Unit) {

    private var multiplier: Double = 1.0

    init {
        var constant = 1.0
        when (from) {
            Unit.INCH -> constant = when (to) {
                Unit.CENTIMETER -> 2.54
                Unit.FOOT -> 0.0833333
                Unit.YARD -> 0.0277778
                Unit.METER -> 0.0254
                Unit.MILE -> 1.5783e-5
                Unit.KILOMETER -> 2.54e-5
                else -> 1.0
            }
            Unit.CENTIMETER -> constant = when (to) {
                Unit.INCH -> 0.393701
                Unit.FOOT -> 0.0328084
                Unit.YARD -> 0.0109361
                Unit.METER -> 0.01
                Unit.MILE -> 6.2137e-6
                Unit.KILOMETER -> 1e-5
                else -> 1.0
            }
            Unit.FOOT -> constant = when (to) {
                Unit.INCH -> 12.0
                Unit.CENTIMETER -> 30.48
                Unit.YARD -> 0.333333
                Unit.METER -> 0.3048
                Unit.MILE -> 0.000189394
                Unit.KILOMETER -> 0.0003048
                else -> 1.0
            }
            Unit.YARD -> constant = when (to) {
                Unit.INCH -> 36.0
                Unit.CENTIMETER -> 91.44
                Unit.FOOT -> 3.0
                Unit.METER -> 0.9144
                Unit.MILE -> 0.000568182
                Unit.KILOMETER -> 0.0009144
                else -> 1.0
            }
            Unit.METER -> constant = when (to) {
                Unit.INCH -> 39.3701
                Unit.CENTIMETER -> 100.0
                Unit.FOOT -> 3.28084
                Unit.YARD -> 1.09361
                Unit.MILE -> 0.000621371
                Unit.KILOMETER -> 0.001
                else -> 1.0
            }
            Unit.MILE -> constant = when (to) {
                Unit.INCH -> 63360.0
                Unit.CENTIMETER -> 160934.0
                Unit.FOOT -> 5280.0
                Unit.YARD -> 1760.0
                Unit.METER -> 1609.34
                Unit.KILOMETER -> 1.60934
                else -> 1.0
            }
            Unit.KILOMETER -> constant = when (to) {
                Unit.INCH -> 39370.1
                Unit.CENTIMETER -> 100000.0
                Unit.FOOT -> 3280.84
                Unit.METER -> 1000.0
                Unit.MILE -> 0.621371
                Unit.YARD -> 0.0009144
                else -> 1.0
            }
        }
        multiplier = constant
    }
    fun convert(input: Double): Double{
        return input * multiplier
    }



}