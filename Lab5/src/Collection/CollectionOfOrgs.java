package Collection;

import Organization.Organization;

import java.util.Vector;

public class CollectionOfOrgs{

        private static Vector<Organization> organizationVector = new Vector<>();

    public static Vector<Organization> getOrganizationVector () {
        return organizationVector;
    }

    public static void setOrganizationVector (Vector <Organization> organizationVector) {
        CollectionOfOrgs.organizationVector = organizationVector;
    }


}
