package com.ocean.myinterviewtest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModel {

    @SerializedName("hash")
    private String hash;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("source_account")
    private String sourceAccount;

    @SerializedName("signatures")
    private List<String> signatures;

    @SerializedName("envelope_xdr")
    private String envelopeXdr;


    public ResponseModel(String hash, String createdAt, String sourceAccount, List<String> signatures, String envelopeXdr) {
        this.hash = hash;
        this.createdAt = createdAt;
        this.sourceAccount = sourceAccount;
        this.signatures = signatures;
        this.envelopeXdr = envelopeXdr;
    }

    public String getHash() {
        return hash;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public String getEnvelopeXdr() {
        return envelopeXdr;
    }
}
