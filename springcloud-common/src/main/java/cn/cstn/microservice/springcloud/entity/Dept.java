package cn.cstn.microservice.springcloud.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Dept implements Serializable {
    static final long serialVersionUID = 1L;
    Long id;
    String name;
    String dbSrc;
}
