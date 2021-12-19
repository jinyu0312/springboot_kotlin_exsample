package com.jinyu0321.demo.domain

class Pet(
    id: Long?,
    name: String,
    tag: String?
)

interface PetRepository{
    fun get(id: Long): Pet
    fun create(pet: Pet)
    fun update(pet: Pet)
    fun delete(id: Long)
}
