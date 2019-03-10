package com.gmail.chernii.oleksii;

/**
 * Created by Space on 10.03.2019.
 */
public class IllegalActionException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage() + " correct action => ( + , - , / , ^ , $ , # )";
    }
}
