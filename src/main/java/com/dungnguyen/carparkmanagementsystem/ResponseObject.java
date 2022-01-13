package com.dungnguyen.carparkmanagementsystem.hrm_staff.responseobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseObject {
//    private int code;
    private String status;
    private String message;
    private Object data;
}
