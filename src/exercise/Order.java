package exercise;

import java.time.LocalDate;

public record Order(int id, String item, int amount, LocalDate date) {}
