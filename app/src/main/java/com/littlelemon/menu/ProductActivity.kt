package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var title = intent.getStringExtra("title")
        var price = intent.getDoubleExtra("price", 0.0)
        var category = intent.getStringExtra("category")
        var image = intent.getIntExtra("image", -1)

        val productItem =
            ProductItem(title!!, price, category!!, image)//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"
    }
}