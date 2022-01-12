package com.dungnguyen.carparkmanagementsystem.hrm_staff.exception;

public class CantEditException extends Exception{

    public CantEditException(){

    }

    public CantEditException(String s){
        super(s);
    }
}
