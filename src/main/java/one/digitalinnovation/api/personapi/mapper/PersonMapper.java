package one.digitalinnovation.api.personapi.mapper;

import one.digitalinnovation.api.personapi.dto.PersonDTO;
import one.digitalinnovation.api.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel (PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
