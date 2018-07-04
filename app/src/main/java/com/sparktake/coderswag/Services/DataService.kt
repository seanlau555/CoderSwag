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
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$15", "hat2"),
            Product("Devslopes Hat White", "$20", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$15", "hat2"),
            Product("Devslopes Hat White", "$20", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$15", "hat2"),
            Product("Devslopes Hat White", "$20", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
            Product("Devslopes Hoodie Red", "$15", "hoodie2"),
            Product("Devslopes Hoodie White", "$20", "hoodie3"),
            Product("Devslopes Hoodie Black", "$22", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
            Product("Devslopes Hoodie Red", "$15", "hoodie2"),
            Product("Devslopes Hoodie White", "$20", "hoodie3"),
            Product("Devslopes Hoodie Black", "$22", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
            Product("Devslopes Hoodie Red", "$15", "hoodie2"),
            Product("Devslopes Hoodie White", "$20", "hoodie3"),
            Product("Devslopes Hoodie Black", "$22", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Shirt Light Gray", "$15", "shirt2"),
            Product("Devslopes Shirt Logo Red", "$20", "shirt3"),
            Product("Devslopes Shirt Hustle", "$22", "shirt4"),
            Product("Devslopes Kickflip Hustle", "$22", "shirt5"),
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Shirt Light Gray", "$15", "shirt2"),
            Product("Devslopes Shirt Logo Red", "$20", "shirt3"),
            Product("Devslopes Shirt Hustle", "$22", "shirt4"),
            Product("Devslopes Kickflip Hustle", "$22", "shirt5"),
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Shirt Light Gray", "$15", "shirt2"),
            Product("Devslopes Shirt Logo Red", "$20", "shirt3"),
            Product("Devslopes Shirt Hustle", "$22", "shirt4"),
            Product("Devslopes Kickflip Hustle", "$22", "shirt5")
    )

    val digitalGood = listOf<Product>(

    )

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}





























