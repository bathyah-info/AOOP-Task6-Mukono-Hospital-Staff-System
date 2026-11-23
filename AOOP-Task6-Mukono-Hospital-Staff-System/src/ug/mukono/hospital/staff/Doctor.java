package ug.mukono.hospital.staff;

public class Doctor extends MedicalStaff {
    private final String specialization;

    public Doctor(String employeeId,
                  String fullName,
                  String department,
                  int workingHoursPerWeek,
                  String specialization) {
        super(employeeId, fullName, department, workingHoursPerWeek);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String getRoleTitle() {
        return "Doctor (" + specialization + ")";
    }

    @Override
    public void performPatientCareDuty(String patientOrCaseId) {
        System.out.println("[DOCTOR - " + getDepartment() + "] Dr. " + getFullName()
                + " (" + specialization + ") conducts clinical assessment, diagnosis, and care plan for "
                + patientOrCaseId + ".");
    }
}