package com.jinyu0321.demo.application.service

import com.jinyu0321.demo.application.model.gen.NewPet
import com.jinyu0321.demo.application.model.gen.Pet
import com.jinyu0321.demo.presentation.gen.PetsApiService
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetsService: PetsApiService {
    override fun createPets(newPet: NewPet?) {
        // TODO("Not yet implemented")
    }

    override fun listPets(limit: Int?): List<Pet> {
        // TODO("Not yet implemented")
        return Collections.emptyList()
    }

    override fun showPetById(petId: String): Pet {
        return Pet(id = 1L, name = "name", tag = null)
    }

}