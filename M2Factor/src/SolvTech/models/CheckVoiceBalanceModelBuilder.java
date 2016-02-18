/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class CheckVoiceBalanceModelBuilder {
    //the instance to build
    private CheckVoiceBalanceModel checkVoiceBalanceModel;

    /**
     * Default constructor to initialize the instance
     */
    public CheckVoiceBalanceModelBuilder() {
        checkVoiceBalanceModel = new CheckVoiceBalanceModel();
    }

    public CheckVoiceBalanceModelBuilder details(String details) {
        checkVoiceBalanceModel.setDetails(details);
        return this;
    }

    public CheckVoiceBalanceModelBuilder status(String status) {
        checkVoiceBalanceModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CheckVoiceBalanceModel build() {
        return checkVoiceBalanceModel;
    }
}