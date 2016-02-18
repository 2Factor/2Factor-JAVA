/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class SendingVoiceOtpModelBuilder {
    //the instance to build
    private SendingVoiceOtpModel sendingVoiceOtpModel;

    /**
     * Default constructor to initialize the instance
     */
    public SendingVoiceOtpModelBuilder() {
        sendingVoiceOtpModel = new SendingVoiceOtpModel();
    }

    public SendingVoiceOtpModelBuilder details(String details) {
        sendingVoiceOtpModel.setDetails(details);
        return this;
    }

    public SendingVoiceOtpModelBuilder status(String status) {
        sendingVoiceOtpModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendingVoiceOtpModel build() {
        return sendingVoiceOtpModel;
    }
}