package ug.mukono.hospital.staff;

public class Pharmacist extends MedicalStaff {
    private final String dispensaryUnit;

    public Pharmacist(String employeeId,
                      String fullName,
                      String department,
                      int workingHoursPerWeek,
                      String dispensaryUnit) {
        super(employeeId, fullName, department, workingHoursPerWeek);
        this.dispensaryUnit = dispensaryUnit;
    }

    public String getDispensaryUnit() {
        return dispensaryUnit;
    }

    @Override
    public String getRoleTitle() {
        return "Pharmacist (" + dispensaryUnit + ")";
    }

    @Override
    public void performPatientCareDuty(String patientOrCaseId) {
        System.out.println("[PHARMACIST - " + dispensaryUnit + "] " + getFullName()
                + " audits drug interactions, verifies dosage accuracy, and dispenses medication for "
                + patientOrCaseId + ".");
    }
}