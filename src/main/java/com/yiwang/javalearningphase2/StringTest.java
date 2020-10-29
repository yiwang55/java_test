package com.yiwang.javalearningphase2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class StringTest {

    private static String[] mappingInclusionFromStringToArray(String string, String[] split) {
        if (string.indexOf("1. ") > 0){
            String substring = string.substring(string.indexOf("1.") + 2).replaceAll("\n\n","").trim();
            split = substring.split("\\d[.][ ]");
        }else if (string.indexOf("- ") > 0){
            String substring = string.substring(string.indexOf("- ") + 2).replaceAll("\n\n","").trim();
            split = substring.split("[-]\\s+");
        }
        return split;
    }

    public static void main(String[] args) {
        String[] arr = {};
        String a ="Exclusion Criteria:\n" +
                "\n" +
                "          1. ASA 3 or higher.\n" +
                "\n" +
                "          2. History of allergy to sulfites, lidocaine or mepivacaine.\n" +
                "\n" +
                "          3. Taking any analgesic 48hrs before testing, such as an NSAID, opioid, or acetaminophen.\n" +
                "\n" +
                "          4. Pregnancy.\n" +
                "\n" +
                "          5. Recent oral trauma.\n" +
                "\n" +
                "          6. Lack of informed consent.\n" +
                "      ";

        String b = "\n" +
                "        Inclusion Criteria:\n" +
                "\n" +
                "          -  PRIOR TO STEP 1 REGISTRATION\n" +
                "\n" +
                "          -  Histologic proof or unequivocal cytologic proof (fine needle aspiration, biopsy or two\n" +
                "             positive sputa) of SCLC within 250 days prior to Step 1 registration\n" +
                "\n" +
                "          -  Patients must have a three-dimensional (3D), T1-weighted, spoiled gradient (SPGR),\n" +
                "             magnetization-prepared rapid gradient echo (MP-RAGE), or turbo field echo (TFE) MRI\n" +
                "             scan without and with gadolinium contrast-enhanced T1-weighted axial, coronal, and\n" +
                "             sagittal sequence acquisitions and standard T2-weighted axial and coronal fluid\n" +
                "             attenuation inversion recovery (FLAIR) sequence acquisitions within 28 days of Step 1\n" +
                "             registration; to yield acceptable image quality, the pre-contrast-enhanced should have\n" +
                "             a resolution of 1 x 1 x 1.2 mm and should follow the protocols established by the\n" +
                "             Alzheimer's Disease Neuroimaging Initiative (ADNI); performance of this sequence at a\n" +
                "             3 Tesla field strength is recommended; sites may contact the Imaging Co-Chair, Dr.\n" +
                "             Tammie Benzinger, for further information or assistance if needed; to yield acceptable\n" +
                "             image quality, the gadolinium contrast-enhanced T1-weighted scan should use the\n" +
                "             smallest possible axial slice thickness not exceeding 1.5 mm; the associated coronal\n" +
                "             and sagittal sequences can be up to 2.5 mm in slice thickness; this imaging is\n" +
                "             considered standard of care\n" +
                "\n" +
                "          -  Note: The MRI study as part of response assessment following chemotherapy can be used\n" +
                "             for this purpose, but the appropriate sequences must be obtained; this sequence cannot\n" +
                "             be obtained prior to chemotherapy and is mandatory irrespective of randomization to\n" +
                "             the experimental or control arm of this study\n" +
                "\n" +
                "          -  Patients must sign a study-specific informed consent prior to study entry\n" +
                "\n" +
                "          -  PRIOR TO STEP 2 REGISTRATION\n" +
                "\n" +
                "          -  The following baseline neurocognitive assessments must be completed within 14 days\n" +
                "             prior to Step 2 registration: HVLT-R, TMT, and COWA; the neurocognitive assessments\n" +
                "             will be uploaded into the National Surgical Adjuvant Breast and Bowel Project,\n" +
                "             Radiation Therapy Oncology Group, and Gynecologic Oncology Group (NRG) Oncology RAVE\n" +
                "             system for evaluation by Dr. Wefel; once the upload is complete, a notification will\n" +
                "             be sent to the site to proceed to Step 2; note: completed baseline neurocognitive\n" +
                "             assessments can be uploaded at the time of Step 1 registration\n" +
                "\n" +
                "          -  Patients must have a baseline raw score greater than 2 on the HVLT-R delayed recall\n" +
                "\n" +
                "          -  Prior to chemotherapy or thoracic radiotherapy, patients must be defined as\n" +
                "             limited-stage or extensive-stage SCLC after clinical staging evaluation involving the\n" +
                "             following:\n" +
                "\n" +
                "               -  History/physical examination;\n" +
                "\n" +
                "               -  Computed tomography (CT) of the chest and abdomen with contrast (does not have to\n" +
                "                  be done if the patient has had a positron emission tomography (PET)/CT scan\n" +
                "                  within 8 weeks prior to initiating chemotherapy or thoracic radiotherapy)\n" +
                "\n" +
                "               -  MRI of the brain\n" +
                "\n" +
                "               -  For patients without evidence of extensive-stage SCLC on chest and abdomen CT and\n" +
                "                  brain MRI, a PET/CT or bone scan is required to confirm limited-stage SCLC\n" +
                "\n" +
                "          -  Patients must be registered on study no earlier than 1 week and no later than 8 weeks\n" +
                "             after completing chemotherapy (+/- thoracic radiotherapy)\n" +
                "\n" +
                "          -  After chemotherapy, patients must be restaged using the same diagnostic work-up as\n" +
                "             required pre-chemotherapy; repeat PET/CT or bone scan is not required; patients must\n" +
                "             have:\n" +
                "\n" +
                "               -  No central nervous system (CNS) metastases\n" +
                "\n" +
                "               -  Radiographic partial or complete response to chemotherapy in at least one disease\n" +
                "                  site using Response Evaluation Criteria in Solid Tumors (RECIST) criteria\n" +
                "\n" +
                "               -  No progression in any site\n" +
                "\n" +
                "          -  Zubrod performance status 0-2\n" +
                "\n" +
                "          -  Women of childbearing potential and male participants must practice adequate\n" +
                "             contraception\n" +
                "\n" +
                "          -  Women of childbearing potential must have a negative qualitative serum pregnancy test\n" +
                "             =< 2 weeks prior to study entry\n" +
                "\n" +
                "          -  Patients who are primary English or French speakers are eligible\n" +
                "\n" +
                "        ";
        String[] strings = mappingInclusionFromStringToArray(b, arr);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
