/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class CheckSmsBalanceModelBuilder {
    //the instance to build
    private CheckSmsBalanceModel checkSmsBalanceModel;

    /**
     * Default constructor to initialize the instance
     */
    public CheckSmsBalanceModelBuilder() {
        checkSmsBalanceModel = new CheckSmsBalanceModel();
    }

    public CheckSmsBalanceModelBuilder details(String details) {
        checkSmsBalanceModel.setDetails(details);
        return this;
    }

    public CheckSmsBalanceModelBuilder status(String status) {
        checkSmsBalanceModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CheckSmsBalanceModel build() {
        return checkSmsBalanceModel;
    }
}