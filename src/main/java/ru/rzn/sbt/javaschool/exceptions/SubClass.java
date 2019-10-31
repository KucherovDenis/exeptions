package ru.rzn.sbt.javaschool.exceptions;

import ru.rzn.sbt.javaschool.exceptions.utils.SomeService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    @Override
    public String callService(SomeService service) throws FileNotFoundException {
        String data = null;

        try {
            service.doSomething();
            data = "DONE";
        } catch (FileNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }


        return data;
    }
}
