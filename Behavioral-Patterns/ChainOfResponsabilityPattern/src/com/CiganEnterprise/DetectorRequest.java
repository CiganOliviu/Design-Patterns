package com.CiganEnterprise;

public class DetectorRequest extends AbstractRequest {

    public DetectorRequest(int requestCode) {
        super(requestCode);
    }
}

class LowFuelRequest extends AbstractRequest {

    public LowFuelRequest(int requestCode) {
        super(requestCode);
    }
}

class LowFuelHandler extends AbstractHandler {

    private static final int code = 1;

    public LowFuelHandler(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void HandleRequest(AbstractRequest request) {

        if (code == request.GetRequestCode()) {
            // handle request
        }
    }
}

class FireHandler extends AbstractHandler {

    private static final int code = 1;

    public FireHandler(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void HandleRequest(AbstractRequest request) {

        if (code == request.GetRequestCode()) {
            // handle request
        }
    }
}