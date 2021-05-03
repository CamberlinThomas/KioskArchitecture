package com.decathlon.profile_domain

class GetProfileUseCase(private val profileRepository: IProfileRepository) : IGetProfileUseCase {

    override fun execute() = profileRepository.getUserProfile()

}