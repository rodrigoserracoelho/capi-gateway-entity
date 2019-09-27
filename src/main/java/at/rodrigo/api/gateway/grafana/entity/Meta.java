package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class Meta {

    private String type;
    private Boolean canSave;
    private Boolean canEdit;
    private Boolean canAdmin;
    private Boolean canStar;
    private String slug;
    private String url;
    private String expires;
    private String created;
    private String updated;
    private String updatedBy;
    private String createdBy;
    private Integer version;
    private Boolean hasAcl;
    private Boolean isFolder;
    private Integer folderId;
    private String folderTitle;
    private String folderUrl;
    private Boolean provisioned;
    private String provisionedExternalId;

}