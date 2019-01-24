package com.example.demo.converter;

import com.example.demo.enumeration.SexEnum;

import javax.persistence.AttributeConverter;

/**
 * Created by Administrator on 2019/1/24.
 */
public class SexConverter implements AttributeConverter<SexEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(SexEnum sexEnum) {
        return sexEnum.getId();
    }

    @Override
    public SexEnum convertToEntityAttribute(Integer integer) {
        return SexEnum.getSexEnumById(integer);
    }
}
