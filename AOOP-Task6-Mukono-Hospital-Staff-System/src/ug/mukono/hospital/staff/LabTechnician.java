package ug.mukono.hospital.staff;
/**
 * Laboratory role responsible for specimen handling, diagnostic panels, and lab reporting.
 */
public class LabTechnician extends MedicalStaff {
    private final String diagnosticSection;

    public LabTechnician(String employeeId,
                         String fullName,
                         String department,
                         int workingHoursPerWeek,
                         String diagnosticSection) {
        super(employeeId, fullName, department, workingHoursPerWeek);
        this.diagnosticSection = diagnosticSection;
    }

    public String getDiagnosticSection() {
        return diagnosticSection;
    }

    @Override
    public String getRoleTitle() {
        return "Lab Technician (" + diagnosticSection + ")";
    }

    @Override
    public void performPatientCareDuty(String patientOrCaseId) {
        System.out.println("[LAB TECH - " + diagnosticSection + "] " + getFullName()
                + " processes diagnostic specimens, runs lab panels, and reports results for "
                + patientOrCaseId + ".");
    }
}