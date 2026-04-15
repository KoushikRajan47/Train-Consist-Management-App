package UC11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(ValidationService.isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(ValidationService.isValidTrainID("TRAIN12"));
        assertFalse(ValidationService.isValidTrainID("TRN12A"));
        assertFalse(ValidationService.isValidTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(ValidationService.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(ValidationService.isValidCargoCode("PET-ab"));
        assertFalse(ValidationService.isValidCargoCode("PET123"));
        assertFalse(ValidationService.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(ValidationService.isValidTrainID("TRN-123"));
        assertFalse(ValidationService.isValidTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(ValidationService.isValidCargoCode("PET-Ab"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(ValidationService.isValidTrainID(""));
        assertFalse(ValidationService.isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(ValidationService.isValidTrainID("TRN-1234X"));
        assertFalse(ValidationService.isValidCargoCode("PET-ABC"));
    }
}