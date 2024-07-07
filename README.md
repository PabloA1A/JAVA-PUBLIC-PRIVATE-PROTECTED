# JAVA: PUBLIC, PRIVATE, PROTECTED

## EXERCISE:

Consider that you are developing a Java program where you work with the superclass Professor and the subclass ProfessorEmeritus. Create the code for these classes that fulfills the requirements that we indicate.

As attributes of the superclass we will have name (String), age (int) and yearsConsolidated (int) declared as protected.

In the subclass we will work with the additional field yearsEmerit declared as private.

A method of the subclass will be double getSalaryBase () that will get the base salary as (925 + yearsConsolidated * 33.25 + 47.80 * yearsEmerit).

Try to access the yearsConsolidated field directly from the subclass (as if it were another field of the subclass) to implement this method. Is it possible without using a super invocation or a get method? What happens if you declare the attribute in the superclass private?