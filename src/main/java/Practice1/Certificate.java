package Practice1;

import java.util.Date;

public class Certificate {
    private long certificatedID;
    private String certificateName;
    private String certificateRank;
    private Date certificatedDate;

    public long getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(long certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public Date getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(Date certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
}