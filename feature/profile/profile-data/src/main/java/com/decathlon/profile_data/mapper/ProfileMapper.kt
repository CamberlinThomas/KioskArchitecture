package com.decathlon.profile_data.mapper

import com.decathlon.profile_data.model.ProfileDTO
import com.decathlon.profile_domain.model.ProfileUI
import com.decathlon.shared.constant.Constants.DateFormat.Companion.SIMPLE_DATE_FORMAT
import com.decathlon.shared.extension.toSimpleDateFormatUTC
import java.util.*

class ProfileMapper : IProfileMapper {
    override fun toProfileUI(profileDTO: ProfileDTO) =
        ProfileUI(
            profileDTO.firstName + " " + profileDTO.lastName,
            Date(profileDTO.birthDate).toSimpleDateFormatUTC(SIMPLE_DATE_FORMAT)
        )

    override fun toProfileDTO(profileDTO: ProfileUI): ProfileDTO {
        TODO("Not yet implemented")
    }


}