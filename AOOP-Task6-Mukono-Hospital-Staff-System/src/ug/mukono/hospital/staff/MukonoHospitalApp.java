package ug.mukono.hospital.staff;

import java.util.List;
/**
 * Application entry point demonstrating abstract base design, role polymorphism,
 * and healthcare system extensibility for Mukono Hospital.
 */
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

        printAbstractionBenefits();
    }

    private static void printAbstractionBenefits() {
        System.out.println("--- WHY ABSTRACTION MATTERS AT MUKONO HOSPITAL ---");
        System.out.println("1. Organization: Shared fields (ID, name, department, weekly hours) and validation");
        System.out.println("   live in one place instead of being duplicated across four separate classes.");
        System.out.println("2. Consistency: Every staff role is guaranteed to expose getStaffProfile() and");
        System.out.println("   implement performPatientCareDuty(...), so rosters and scheduling code stay uniform.");
        System.out.println("3. Extensibility: Adding new roles (e.g., Radiologist, Physiotherapist) only");
        System.out.println("   requires extending MedicalStaff without rewriting existing roster loops.");
    }
}