package ug.mukono.hospital.staff;

/**
 * Generalized abstract base class for all Mukono Hospital medical personnel.
 *
 * <p>Declared {@code abstract} so generic, undefined medical staff instances cannot
 * be created directly, while enforcing a consistent contract across all clinical roles.</p>
 */
public abstract class MedicalStaff {
    private final String employeeId;
    private final String fullName;
    private final String department;
    private final int workingHoursPerWeek;

    protected MedicalStaff(String employeeId,
                           String fullName,
                           String department,
                           int workingHoursPerWeek) {
        if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("Employee ID cannot be blank.");
        }
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Full name cannot be blank.");
        }
        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException("Department cannot be blank.");
        }
        if (workingHoursPerWeek <= 0) {
            throw new IllegalArgumentException("Working hours per week must be positive.");
        }
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.department = department;
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public String getStaffProfile() {
        return String.format("[%s] %s | Role: %s | Dept: %s | Hours/Wk: %d",
                employeeId, fullName, getRoleTitle(), department, workingHoursPerWeek);
    }

    public abstract String getRoleTitle();

    public abstract void performPatientCareDuty(String patientOrCaseId);
}