/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class VerifyVoiceOtpInputModelBuilder {
    //the instance to build
    private VerifyVoiceOtpInputModel verifyVoiceOtpInputModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyVoiceOtpInputModelBuilder() {
        verifyVoiceOtpInputModel = new VerifyVoiceOtpInputModel();
    }

    public VerifyVoiceOtpInputModelBuilder details(String details) {
        verifyVoiceOtpInputModel.setDetails(details);
        return this;
    }

    public VerifyVoiceOtpInputModelBuilder status(String status) {
        verifyVoiceOtpInputModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyVoiceOtpInputModel build() {
        return verifyVoiceOtpInputModel;
    }
}