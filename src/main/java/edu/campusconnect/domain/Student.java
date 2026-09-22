package edu.campusconnect.domain;

public record Student(long id, String studentNumber, String displayName, String program) {
    public Student {
        if (studentNumber == null || studentNumber.isBlank()) throw new IllegalArgumentException("student number is required");
        if (displayName == null || displayName.isBlank()) throw new IllegalArgumentException("display name is required");
    }
}
