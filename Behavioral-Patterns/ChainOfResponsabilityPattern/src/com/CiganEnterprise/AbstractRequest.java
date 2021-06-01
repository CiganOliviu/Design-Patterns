package com.CiganEnterprise;

abstract public class AbstractRequest {

    private final int _requestCode;

    public AbstractRequest(int requestCode) {

        _requestCode = requestCode;
    }

    public int GetRequestCode() {

        return _requestCode;
    }
}
