package com.upn.config;

import com.upn.dto.ExamDTO;
import com.upn.dto.MedicDTO;
import com.upn.model.Exam;
import com.upn.model.Medic;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper defaultMapper() {
        return new ModelMapper();
    }

    @Bean
    public ModelMapper examMapper(){
        ModelMapper mapper = new ModelMapper();

        // ESCRITURA POST PUT
        mapper.createTypeMap(ExamDTO.class, Exam.class)
                .addMapping(ExamDTO::getExamDescription, Exam::setDescription)
                .addMapping(ExamDTO::getExamName, Exam::setName);

        // LECTURA GET
        mapper.createTypeMap(Exam.class, ExamDTO.class)
                .addMapping(Exam::getDescription, ExamDTO::setExamDescription)
                .addMapping(Exam::getName, ExamDTO::setExamName);

        return mapper;
    }

    @Bean
    public ModelMapper medicMapper() {
        ModelMapper mapper = new ModelMapper();

        //ESCRITURA POST PUT
        mapper.createTypeMap(MedicDTO.class, Medic.class)
                .addMapping(MedicDTO::getPrimaryName, Medic::setFirstName)
                .addMapping(MedicDTO::getSurname, Medic::setLastName)
                .addMapping(MedicDTO::getPhoto, Medic::setPhotoUrl);

        //LECTURA GET
        mapper.createTypeMap(Medic.class, MedicDTO.class)
                .addMapping(Medic::getFirstName, MedicDTO::setPrimaryName)
                .addMapping(Medic::getLastName, MedicDTO::setSurname);

        return mapper;
    }

}
