package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
// the model representing a single book
class BestSellerBook {
    // @SerializedName(String) tags are used by the gson library to select which JSON key to import data from. Make sure they match the returned json exactly!
    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("author")
    var author: String? = null

    // Create a String? variable called bookImageUrl that will match the correct JSON key.
    @SerializedName("book_image")
    var bookImageUrl: String? = null

    //Create a String? variable called description that will match the correct JSON key.
    @SerializedName("description")
    var description: String? = null

    // TODO-STRETCH-GOALS amazonUrl
    @SerializedName("amazon_product_url")
    var amazonUrl: String? = null
}