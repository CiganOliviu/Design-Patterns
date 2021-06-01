package com.CiganEnterprise;

abstract public class AbstractHandler {

    private AbstractHandler _next;

    public AbstractHandler(AbstractHandler next) {
        _next = next;
    }

    public void SetNext(AbstractHandler next) {
        _next = next;
    }

    public void HandleRequest(AbstractRequest request) {

        if (_next != null)
            _next.HandleRequest(request);
    }
}
