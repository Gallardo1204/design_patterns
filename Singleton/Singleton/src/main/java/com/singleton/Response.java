package com.singleton;

public class Response {

    private static Response response;
    private Integer status;
    private String message;
    private String method;
    private Object obj;

    private Response() {
    }

    public static Response getInstance(){

        if (response == null){
            response = new Response();
        }

        return  response;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", method='" + method + '\'' +
                ", obj=" + obj +
                '}';
    }
}
