package com.sparktake.coderswag.Services

import com.sparktake.coderswag.Modal.Category
import com.sparktake.coderswag.Modal.Product

/**
 * Created by lauhon on 30/6/2018.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$15", "hat02"),
            Product("Devslopes Hat White", "$20", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$18", "hoodie01"),
            Product("Devslopes Hoodie Red", "$15", "hoodie02"),
            Product("Devslopes Hoodie White", "$20", "hoodie03"),
            Product("Devslopes Hoodie Black", "$22", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Shirt Light Gray", "$15", "shirt02"),
            Product("Devslopes Shirt Logo Red", "$20", "shirt03"),
            Product("Devslopes Shirt Hustle", "$22", "shirt04"),
            Product("Devslopes Kickflip Hustle", "$22", "shirt05")
    )
}



















