package ug.mukono.hospital.staff;

import java.util.List;

public class MukonoHospitalApp {
    public static void main(String[] args) {
        System.out.println("        MUKONO HOSPITAL MEDICAL STAFF MANAGEMENT SYSTEM");
        System.out.println();

        // Direct instantiation `new MedicalStaff(...)` is disallowed at compile time
        // because MedicalStaff is abstract.

        List<MedicalStaff> dutyRoster = List.of(
                new Doctor("MK-DOC-101", "Samuel Mugisha", "Internal Medicine", 45, "Physician"),
                new Nurse("MK-NRS-204", "Grace Namukasa", "Inpatient Care", 40, "Medical Ward B"),
                new Pharmacist("MK-PHM-309", "Peter Okello", "Clinical Pharmacy", 40, "Main Dispensary"),
                new LabTechnician("MK-LAB-412", "Sarah Apio", "Pathology & Diagnostics", 38, "Hematology")
        );

        System.out.println("--- STAFF ROSTER & SHIFT DETAILS ---");
        for (MedicalStaff staff : dutyRoster) {
            System.out.println(staff.getStaffProfile());
        }
        System.out.println();

        System.out.println("--- DAILY PATIENT-CARE EXECUTION (POLYMORPHIC DISPATCH) ---");
        String activePatientCase = "PT-2026-0842";
        for (MedicalStaff staff : dutyRoster) {
            staff.performPatientCareDuty(activePatientCase);
        }
        System.out.println();
    }
}