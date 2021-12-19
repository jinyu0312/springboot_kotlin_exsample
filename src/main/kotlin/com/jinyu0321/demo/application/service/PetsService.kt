package com.jinyu0321.demo.application.service

import com.jinyu0321.demo.application.model.gen.NewPet
import com.jinyu0321.demo.domain.Pet
import com.jinyu0321.demo.application.model.gen.Pet as PetDto
import com.jinyu0321.demo.presentation.gen.PetsApiService
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetsService: PetsApiService {
    override fun createPets(newPet: NewPet?) {
        require(newPet != null) {"newPet must be not null"}
        val pet = Pet(
            id = null,
            name = newPet.name,
            tag = newPet.tag
        )
        // TODO("Not yet implemented")
    }

    override fun listPets(limit: Int?): List<PetDto> {
        // TODO("Not yet implemented")
        return Collections.emptyList()
    }

    override fun showPetById(petId: String): PetDto {
        return PetDto(id = 1L, name = "name", tag = null)
    }

}