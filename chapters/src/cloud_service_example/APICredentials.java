package cloud_service_example;

import com.google.gson.annotations.SerializedName;

public class APICredentials {

    static final String EXTERNAL_LINK_TOKEN_URL = "https://cloud.seatable.io/api/v2.1/external-link-tokens/af07bab80c4940579785/access-token/";

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("dtable_uuid")
    private String dtableUuid;

    @SerializedName("workspace_id")
    private int workspaceId;

    private static APICredentials instance;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setDtableUuid(String dtableUuid) {
        this.dtableUuid = dtableUuid;
    }

    public void setWorkspaceId(int workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getBearerToken() {
        return accessToken;
    }


}
