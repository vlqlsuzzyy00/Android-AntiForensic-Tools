package com.oasisfeng.island.domain.repositories

import com.oasisfeng.island.domain.entities.Permissions
import kotlinx.coroutines.flow.Flow

/**
 * Repository for storing app's permissions. Data is encrypted.
 */
interface PermissionsRepository {
    suspend fun setAdminStatus(status: Boolean)
    suspend fun setOwnerStatus(status: Boolean)
    suspend fun setRootStatus(status: Boolean)
    val permissions: Flow<Permissions>
}