package com.example.prototipo_app.api

import com.example.prototipo_app.model.Categoria
import com.example.prototipo_app.model.Postagem
import retrofit2.Response

class Repository {
    suspend fun listPostagem(): Response<List<Postagem>>{
        return RetrofitInstance.api.listPostagem()
    }

    suspend fun addPostagem(postagem: Postagem): Response<Postagem>{
        return RetrofitInstance.api.addPostagem(postagem)
    }

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

}