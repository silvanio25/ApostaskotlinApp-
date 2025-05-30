
package com.apostas.app

data class Aposta(
    val jogo: String,
    val mercado: String,
    val odd: Double,
    val probabilidade: Double
) {
    fun value(): Double {
        return (probabilidade / 100) * odd - 1
    }

    fun recomendada(): Boolean {
        return value() > 0
    }
}
