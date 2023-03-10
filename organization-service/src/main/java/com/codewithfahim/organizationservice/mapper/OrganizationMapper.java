package com.codewithfahim.organizationservice.mapper;

import com.codewithfahim.organizationservice.dto.OrganizationDto;
import com.codewithfahim.organizationservice.entity.Organization;

public class OrganizationMapper {

    public static Organization mapToOrganization(OrganizationDto organizationDto) {
        Organization organization = new Organization(
                organizationDto.getId(),
                organizationDto.getOrganizationName(),
                organizationDto.getOrganizationCode(),
                organizationDto.getOrganizationDescription(),
                organizationDto.getCreatedDate()
        );
        return organization;
    }

    public static OrganizationDto mapToOrganizationDto(Organization organization) {
        OrganizationDto organizationDto = new OrganizationDto(
                organization.getId(),
                organization.getOrganizationName(),
                organization.getOrganizationCode(),
                organization.getOrganizationDescription(),
                organization.getCreatedDate()
        );
        return organizationDto;
    }
}
