package com.example.kotlin65.data.remote.rickandmortymodels.characters

data class CharactersResponse(
    val info: Info,
    val results: List<ResultCharacters>
)