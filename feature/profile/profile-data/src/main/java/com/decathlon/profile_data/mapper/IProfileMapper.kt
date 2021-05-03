package com.decathlon.profile_data.mapper

import com.decathlon.profile_data.model.ProfileDTO
import com.decathlon.profile_domain.model.ProfileUI

interface IProfileMapper {

    fun toProfileUI(profileDTO: ProfileDTO): ProfileUI
    fun toProfileDTO(profileDTO: ProfileUI): ProfileDTO
}