package com.example.kotlininit.poo

open class Vehicule(protected val nbrRoue:Int){
    open fun nombreDeRoue():String = "Ce vehicule a $nbrRoue roue"
}