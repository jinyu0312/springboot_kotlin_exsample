package com.jinyu0321.demo.presentation.gen

import com.jinyu0321.demo.application.model.gen.Error
import com.jinyu0321.demo.application.model.gen.NewPet
import com.jinyu0321.demo.application.model.gen.Pet

interface PetsApiService {

    fun createPets(newPet: NewPet?): Unit

    fun listPets(limit: kotlin.Int?): List<Pet>

    fun showPetById(petId: kotlin.String): Pet
}
