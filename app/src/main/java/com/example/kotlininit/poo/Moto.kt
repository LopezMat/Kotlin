package com.example.kotlininit.poo

class Moto(val sideCar:Boolean = false): Vehicule(2) {
    override fun nombreDeRoue(): String = "Ce véhicule a ${if(sideCar) nbrRoue + 1 else nbrRoue} roues "
}