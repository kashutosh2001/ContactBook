package com.yash.contactapp.exception;

public class UserBlockedException extends Exception{

    public UserBlockedException(){

    }

    public UserBlockedException (String errormsg){
        super(errormsg);
    }
}
