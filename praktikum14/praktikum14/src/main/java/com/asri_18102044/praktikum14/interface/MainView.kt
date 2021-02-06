package com.asri_18102044.praktikum14.`interface`

import com.asri_18102044.praktikum14.model.Login
import com.asri_18102044.praktikum14.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login)
}