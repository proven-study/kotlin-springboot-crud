package me.devarif.demospring1.users

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>