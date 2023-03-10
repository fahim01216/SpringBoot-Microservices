package com.codewithfahim.organizationservice.service.impl;

import com.codewithfahim.organizationservice.dto.OrganizationDto;
import com.codewithfahim.organizationservice.entity.Organization;
import com.codewithfahim.organizationservice.mapper.OrganizationMapper;
import com.codewithfahim.organizationservice.repository.OrganizationRepository;
import com.codewithfahim.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        // convert OrganizationDto to Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization =organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
