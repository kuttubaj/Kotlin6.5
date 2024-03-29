package com.example.kotlin65.data.repositories

import com.example.kotlin65.data.remote.apiservice.RickAndMortyApi
import javax.inject.Inject

class RickAndMortyRepositories @Inject constructor(
    private val rickAndMortyApi: RickAndMortyApi
) {
    suspend fun getCharacter() = rickAndMortyApi.getCharacter()
    suspend fun getLocation() = rickAndMortyApi.getLocation()
}