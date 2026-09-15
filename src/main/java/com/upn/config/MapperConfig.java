package com.upn.config;

import com.upn.dto.ExamDTO;
import com.upn.dto.SpecialtyDTO;
import com.upn.model.Exam;
import com.upn.model.Specialty;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper() {
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
}
