package com.decathlon.profile_domain

import javax.inject.Inject

class GetProfileUseCase @Inject constructor(private val profileRepository: IProfileRepository) : IGetProfileUseCase {

    override fun execute() = profileRepository.getUserProfile()

}