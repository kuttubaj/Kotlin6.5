package com.example.kotlin65.data.remote.rickandmortymodels.location

data class LocationResponse(
    val info: Info,
    val results: List<ResultLocation>
)