package dev.pablo;

public class ProfessorEmeritus extends Professor {
    private int yearsEmeritus;

    public ProfessorEmeritus(String name, int age, int yearsConsolidated, int yearsEmeritus) {
        super(name, age, yearsConsolidated);
        this.yearsEmeritus = yearsEmeritus;
    }
    public double getBaseSalary() {
        return 925 + getYearsConsolidated() * 33.25 + 47.80 * yearsEmeritus;
    }
}