/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.models;

import java.util.*;

public class CheckBalanceAddonServicesModelBuilder {
    //the instance to build
    private CheckBalanceAddonServicesModel checkBalanceAddonServicesModel;

    /**
     * Default constructor to initialize the instance
     */
    public CheckBalanceAddonServicesModelBuilder() {
        checkBalanceAddonServicesModel = new CheckBalanceAddonServicesModel();
    }

    public CheckBalanceAddonServicesModelBuilder details(String details) {
        checkBalanceAddonServicesModel.setDetails(details);
        return this;
    }

    public CheckBalanceAddonServicesModelBuilder status(String status) {
        checkBalanceAddonServicesModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CheckBalanceAddonServicesModel build() {
        return checkBalanceAddonServicesModel;
    }
}