package com.jinyu0321.demo.presentation.gen

import com.jinyu0321.demo.application.model.gen.Error
import com.jinyu0321.demo.application.model.gen.NewPet
import com.jinyu0321.demo.application.model.gen.Pet
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v1}")
class PetsApiController(@Autowired(required = true) val service: PetsApiService) {


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/pets"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createPets( @Valid @RequestBody(required = false) newPet: NewPet?
): ResponseEntity<Unit> {
        return ResponseEntity(service.createPets(newPet), HttpStatus.valueOf(201))
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/pets"],
        produces = ["application/json"]
    )
    fun listPets( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
): ResponseEntity<List<Pet>> {
        return ResponseEntity(service.listPets(limit), HttpStatus.valueOf(200))
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/pets/{petId}"],
        produces = ["application/json"]
    )
    fun showPetById( @PathVariable("petId") petId: kotlin.String
): ResponseEntity<Pet> {
        return ResponseEntity(service.showPetById(petId), HttpStatus.valueOf(200))
    }
}
