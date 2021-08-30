package com.ihsan.challenge

fun main() {
    val diPilihan: Array<String> = arrayOf("b", "g", "k")
    var playerSatu = 0
    var playerDua = 0
    var seri = 0

    println("Masukan nama Player 1:")
    var namaInput = readLine().toString()
    val namaCek = NamaPlayer(player1 = namaInput)
    println("Masukan nama Player 2:")
    namaInput = readLine().toString()
    val namaCek1 = NamaPlayer(player2 = namaInput)

    while (playerSatu + playerDua < 10 || playerSatu == playerDua) {
    val pilihanPlayer1 = player1Jalan(diPilihan)
    val pilihanPlayer2 = player2Jalan(diPilihan)
        val outputPlayer1 = when (pilihanPlayer1){
            "b" -> "Batu"
            "g" -> "Gunting"
            "k" -> "Kertas"
            else -> break
        }
        val outputPlayer2 = when (pilihanPlayer2){
            "b" -> "Batu"
            "g" -> "Gunting"
            "k" -> "Kertas"
            else -> break
        }

    if (pilihanPlayer1 == pilihanPlayer2) {
        seri++
        println("Kedua Player memilih $outputPlayer1: Hasilnya Seri!")
    } else if (
            (pilihanPlayer1 == "b" && pilihanPlayer2 == "g") ||
            (pilihanPlayer1 == "k" && pilihanPlayer2 == "b") ||
            (pilihanPlayer1 == "g" && pilihanPlayer2 == "k")){
        playerSatu++
        println("${namaCek.player1} memilih: $outputPlayer1")
        println("${namaCek1.player2} memilih: $outputPlayer2")
        println("${namaCek.player1} Menang")
        println("Skor kali ini: $playerSatu vs $playerDua")
    } else {
        playerDua++
        println("${namaCek.player1} memilih: $outputPlayer1")
        println("${namaCek1.player2} memilih: $outputPlayer2")
        println("${namaCek1.player2} Menang")
        println("Skor kali ini: $playerSatu vs $playerDua")
    }
    }
    println("Skor Akhir: ${namaCek.player1} dengan ($playerSatu) poin vs ${namaCek1.player2} dengan ($playerDua) poin dan $seri seri")
}

fun player1Jalan( diPilihan: Array<String>): String {
    var pilihanValid = false
    var pilihanPlayer1 = ""

    while (!pilihanValid) {
        println("Player 1 jalan! pilih (b)atu, (g)unting, (k)ertas:")

        val playerInput = readLine()

        if (playerInput != null && playerInput in diPilihan) {
            pilihanValid = true
            pilihanPlayer1 = playerInput
        }

        if (!pilihanValid) println("Harap Masukan satu dari b, g, atau k saja!")
    }
    return pilihanPlayer1
}
fun player2Jalan( diPilihan: Array<String>): String {
    var pilihanValid = false
    var pilihanPlayer2 = ""

    while (!pilihanValid) {
        println("Player 2 jalan! pilih (b)atu, (g)unting, (k)ertas:")

        val playerInput = readLine()

        if (playerInput != null && playerInput in diPilihan) {
            pilihanValid = true
            pilihanPlayer2 = playerInput
        }

        if (!pilihanValid) println("Harap Masukan satu dari b, g, atau k saja!")
    }
    return pilihanPlayer2
}