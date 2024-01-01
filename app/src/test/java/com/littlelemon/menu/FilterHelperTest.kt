package com.littlelemon.menu

import org.junit.Assert.*
import org.junit.Test

class FilterHelperTest {
    val sampleProductsList = mutableListOf(
        ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
        ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
        ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
    )
    @Test
    fun `filterProducts() should return all products when FilterType is All`() {
        val filterHelper = FilterHelper()
        val expected = sampleProductsList
        val actual = filterHelper.filterProducts(FilterType.All, sampleProductsList)
        assertEquals(expected, actual)
    }

    @Test
    fun `filterProducts() should return only drinks when FilterType is Drinks`() {
        val filterHelper = FilterHelper()
        val expected = listOf(sampleProductsList[0])
        val actual = filterHelper.filterProducts(FilterType.Drinks, sampleProductsList)
        assertEquals(expected, actual)
    }

    @Test
    fun `filterProducts() should return only food when FilterType is Food`() {
        val filterHelper = FilterHelper()
        val expected = listOf(sampleProductsList[2])
        val actual = filterHelper.filterProducts(FilterType.Food, sampleProductsList)
        assertEquals(expected, actual)
    }

    @Test
    fun `filterProducts() should return only dessert when FilterType is Dessert`() {
        val filterHelper = FilterHelper()
        val expected = listOf(sampleProductsList[1])
        val actual = filterHelper.filterProducts(FilterType.Dessert, sampleProductsList)
        assertEquals(expected, actual)
    }
}
