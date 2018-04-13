package com.example.etienne.quizzood

class Joueur (Score: Int,Pseudo: String, nom: String, prenom: String, codePostal: Int, ville: String, age: Int, sexe: Boolean){

    private var Score: Int = 0
    private val Pseudo: String? = null
    private val nom: String? = null
    private val prenom: String? = null
    private val email: String? = null
    private val codePostal: Int = 0
    private val ville: String? = null
    private val age: Int = 0
    private val sexe: Boolean = false

    fun CalculeScore(temps: Int, difficulte: Int, nbReponseJuste: Int) {
        this.Score += difficulte * 100 + nbReponseJuste * 100 - temps * 2
    } // CalculeScore()  ajoute  le score à la fin de chaque partie

}
