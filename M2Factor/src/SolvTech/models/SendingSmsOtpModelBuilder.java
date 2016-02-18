/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class SendingSmsOtpModelBuilder {
    //the instance to build
    private SendingSmsOtpModel sendingSmsOtpModel;

    /**
     * Default constructor to initialize the instance
     */
    public SendingSmsOtpModelBuilder() {
        sendingSmsOtpModel = new SendingSmsOtpModel();
    }

    public SendingSmsOtpModelBuilder details(String details) {
        sendingSmsOtpModel.setDetails(details);
        return this;
    }

    public SendingSmsOtpModelBuilder status(String status) {
        sendingSmsOtpModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendingSmsOtpModel build() {
        return sendingSmsOtpModel;
    }
}