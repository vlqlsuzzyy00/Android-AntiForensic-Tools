package net.typeblog.shelter.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class RootDomain(val rootCommand: String="")