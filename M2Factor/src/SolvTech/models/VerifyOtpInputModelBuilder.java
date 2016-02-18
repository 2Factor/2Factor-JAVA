/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class VerifyOtpInputModelBuilder {
    //the instance to build
    private VerifyOtpInputModel verifyOtpInputModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyOtpInputModelBuilder() {
        verifyOtpInputModel = new VerifyOtpInputModel();
    }

    public VerifyOtpInputModelBuilder details(String details) {
        verifyOtpInputModel.setDetails(details);
        return this;
    }

    public VerifyOtpInputModelBuilder status(String status) {
        verifyOtpInputModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyOtpInputModel build() {
        return verifyOtpInputModel;
    }
}