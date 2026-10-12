package edu.campusconnect;

import edu.campusconnect.domain.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentTest { @Test void studentNumberIsRequired() { assertThrows(IllegalArgumentException.class, () -> new Student(1, "", "Sample Student", "Computer Science")); } }
