package de.christianbergau;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Book {

    @NotBlank(message = "Title may not be blank")
    public String title;

    @NotBlank(message = "Author may not be blank")
    public String author;

    @Min(message="Author has been very lazy", value=1)
    public double pages;
}