/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class SendTransactionalSmsModelBuilder {
    //the instance to build
    private SendTransactionalSmsModel sendTransactionalSmsModel;

    /**
     * Default constructor to initialize the instance
     */
    public SendTransactionalSmsModelBuilder() {
        sendTransactionalSmsModel = new SendTransactionalSmsModel();
    }

    public SendTransactionalSmsModelBuilder details(String details) {
        sendTransactionalSmsModel.setDetails(details);
        return this;
    }

    public SendTransactionalSmsModelBuilder status(String status) {
        sendTransactionalSmsModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendTransactionalSmsModel build() {
        return sendTransactionalSmsModel;
    }
}