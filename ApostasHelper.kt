
package com.apostas.app

object ApostasHelper {
    fun gerarApostas(): List<Aposta> {
        return listOf(
            Aposta("Flamengo x Palmeiras", "Mais de 1.5 gols", 1.55, 78.0),
            Aposta("Grêmio x Vasco", "Ambas Marcam", 1.70, 60.0),
            Aposta("Santos x Bahia", "Dupla Chance - Santos ou Empate", 1.40, 82.0)
        )
    }
}
