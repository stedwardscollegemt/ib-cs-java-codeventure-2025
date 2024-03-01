package cloud_service_example;

public class CloudDataServiceDemo {

    public static void main(String[] args) {

        // step 1 - authentication
        APICredentials apiCredLimitedPermissions = CloudDataServiceWrapper.getBaseTokenWithExternalLink();
        if (apiCredLimitedPermissions != null) {
            System.out.println("We got API credentials! My token is: " + apiCredLimitedPermissions.getBearerToken());
        }

        APICredentials apiCredMorePermissions = CloudDataServiceWrapper.getBaseTokenWithApiToken();
        if (apiCredMorePermissions != null) {
            System.out.println("We got API credentials! My token is: " + apiCredMorePermissions.getBearerToken());
        }

        // step 2 - get data
    }
    
}
