package edu.uw.covidsafe.event;

public class SendInfectedUserDataEvent {
    private boolean requestStatus;
//    private UserDataSent response;

//    public UserDataSent getResponse() {
//        return response;
//    }

//    public void setResponse(UserDataSent response) {
//        this.response = response;
//    }

    public boolean isRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(boolean requestStatus) {
        this.requestStatus = requestStatus;
    }
}
