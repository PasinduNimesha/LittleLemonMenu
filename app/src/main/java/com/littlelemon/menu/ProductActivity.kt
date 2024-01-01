package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = if (intent.getStringExtra("title") != null) {
            intent.getStringExtra("title")!!
        } else {
            ""
        }
        val price = intent.getDoubleExtra("price", 0.0)
        val category = if (intent.getStringExtra("category") != null) {
            intent.getStringExtra("category")!!
        } else {
            ""
        }
        val image = intent.getIntExtra("image", -1)
        val productItem =
            ProductItem(title, price, category, image)//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }
}