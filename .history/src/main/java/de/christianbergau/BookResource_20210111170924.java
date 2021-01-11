package de.christianbergau;

import java.util.Set;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

public class BookResource {

    @Inject
    Validator validator;
    
    @Path("/manual-validation")
    @POST
    public Result tryMeManualValidation(Book book) {
        Set<ConstraintViolation<Book>> violations = validator.validate(book);
        
        if (violations.isEmpty()) {
            return new Result("Book is valid! It was validated by manual validation.");
        } else {
            return new Result(violations);
        }
    }
}
