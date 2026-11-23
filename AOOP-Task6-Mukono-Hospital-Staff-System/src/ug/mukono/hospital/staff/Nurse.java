package ug.mukono.hospital.staff;
/**
 * Nursing role responsible for ward monitoring, vitals tracking, and bedside patient care.
 */
public class Nurse extends MedicalStaff {
    private final String assignedWard;

    public Nurse(String employeeId,
                 String fullName,
                 String department,
                 int workingHoursPerWeek,
                 String assignedWard) {
        super(employeeId, fullName, department, workingHoursPerWeek);
        this.assignedWard = assignedWard;
    }

    public String getAssignedWard() {
        return assignedWard;
    }

    @Override
    public String getRoleTitle() {
        return "Nurse (" + assignedWard + ")";
    }

    @Override
    public void performPatientCareDuty(String patientOrCaseId) {
        System.out.println("[NURSE - " + assignedWard + "] " + getFullName()
                + " monitors vitals, administers prescribed treatments, and provides bedside care for "
                + patientOrCaseId + ".");
    }
}